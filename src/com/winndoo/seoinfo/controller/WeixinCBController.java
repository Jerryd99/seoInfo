package com.winndoo.seoinfo.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.qq.weixin.mp.aes.AesException;
import com.qq.weixin.mp.aes.WXBizMsgCrypt;
import com.winndoo.seoinfo.po.ProjDetailInfo;
import com.winndoo.seoinfo.po.ProjSimpleInfo;
import com.winndoo.seoinfo.po.Projdes;
import com.winndoo.seoinfo.po.TableInfo;
import com.winndoo.seoinfo.service.InfoService;

//暂时不需要登录验证拦截器
@Controller
@RequestMapping("/weixin")
public class WeixinCBController {
	@Autowired
	private InfoService infoService;
	String sToken = "9MvuIb8A58zkg";//这个Token是随机生成，但是必须跟企业号上的相同
    String sCorpID = "wx99ca8e91711f846f";//这里是你企业号的CorpID
    String sEncodingAESKey = "Hg3ZHYdBLs1YXskTlWxfBx9GnEWvKfocfOwwAvsQplN";//这个EncodingAESKey是随机生成，但是必须跟企业号上的相同
    /**
     * 确认请求来自微信服务器
     * @throws IOException 
     */
	// 总表单浏览
	@RequestMapping("/cb")
	public void queryTables(HttpServletRequest request,HttpServletResponse response/*String msg_signature,String timestamp,String nonce,String echostr*/) throws Exception {
		
		// 微信加密签名 
        String sVerifyMsgSig = request.getParameter("msg_signature");
        // 时间戳
        String sVerifyTimeStamp = request.getParameter("timestamp");
        // 随机数
        String sVerifyNonce = request.getParameter("nonce");
        // 随机字符串
        String sVerifyEchoStr = request.getParameter("echostr");
        String sEchoStr; //需要返回的明文
        PrintWriter out = response.getWriter();  
        WXBizMsgCrypt wxcpt;
        try {
            wxcpt = new WXBizMsgCrypt(sToken, sEncodingAESKey, sCorpID);
            sEchoStr = wxcpt.VerifyURL(sVerifyMsgSig, sVerifyTimeStamp,sVerifyNonce, sVerifyEchoStr);
            // 验证URL成功，将sEchoStr返回
            out.print(sEchoStr);  
            out.flush();  
            out.close();
        } catch (AesException e1) {
            e1.printStackTrace();
        }
	}
	
	
}