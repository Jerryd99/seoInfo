package com.winndoo.seoinfo.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
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

import com.winndoo.seoinfo.po.ProjDetailInfo;
import com.winndoo.seoinfo.po.ProjSimpleInfo;
import com.winndoo.seoinfo.po.Projdes;
import com.winndoo.seoinfo.po.TableInfo;
import com.winndoo.seoinfo.service.InfoService;
import com.winndoo.seoinfo.service.WxBindService;
import com.winndoo.seoinfo.utils.HttpRequestUtils;
import com.winndoo.seoinfo.utils.MailUtils;

import net.sf.json.JSONObject;

//暂时不需要登录验证拦截器
@Controller
@RequestMapping("/info")
public class InfoController {
	@Autowired
	private InfoService infoService;
	
	// 总表单浏览
	@RequestMapping("/tables")
	public ModelAndView queryTables(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		String a = (String)session.getAttribute("flag");
		session.setAttribute("flag", "xxx");
		List<ProjSimpleInfo> projsList = infoService.findProjsList();
		List<TableInfo> tablesList = infoService.getTablesInfo(projsList);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("tablesList", tablesList);
		modelAndView.addObject("projsList", projsList);
		modelAndView.setViewName("tableList");

		return modelAndView;
	}

	// 总产品浏览
	@RequestMapping("/items")
	public ModelAndView queryItems() throws Exception {
		List<ProjSimpleInfo> projsList = infoService.findProjsList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("projsList", projsList);
		modelAndView.setViewName("itemList");

		return modelAndView;
	}

	// 查看具体项目
	@RequestMapping("/items/{proj_id}")
	public ModelAndView itemsView(@PathVariable("proj_id") Integer proj_id,HttpServletRequest request) throws Exception {
	
		String projName = infoService.findProjNameById(proj_id);
		List<Projdes> projDesList = infoService.findProjDesListByProjId(proj_id).getProjDesList();

		String priceDes = infoService.findProjPriceDesByProjId(proj_id);
		String priceFile = infoService.findProjPriceFileByProjId(proj_id);
		String detailDes = infoService.findProjDetailDesByProjId(proj_id);
		String detailFile = infoService.findProjDetailFileByProjId(proj_id);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("projId", proj_id);
		modelAndView.addObject("projName", projName);
		modelAndView.addObject("projDesList", projDesList);
		modelAndView.addObject("priceDes", priceDes);
		modelAndView.addObject("priceFileName", priceFile);
		modelAndView.addObject("detailDes", detailDes);
		modelAndView.addObject("detailFileName", detailFile);
		modelAndView.setViewName("projDetail");

		return modelAndView;
	}

	/*
	 * // 取消上传，直接放到tomcat 请求登录，只有账号密码正确才能上传文件
	 * 
	 * @RequestMapping(value = "login") public String toUpload() { return
	 * "login"; }
	 * 
	 * // 取消上传，直接放到tomcat 登录，设置session，不匹配则返回登录,成功则转到上传页面
	 * 
	 * @RequestMapping("/submitLogin") public String login(HttpSession session,
	 * String username, String password) throws Exception { if
	 * (!username.equals("admin888") || !password.equals("111111")) { return
	 * "login"; } session.setAttribute("username", username);
	 * session.setAttribute("password", password); return "upload"; }
	 * 
	 * // 取消上传，直接放到tomcat 提交上传文件 判断权限
	 * 
	 * @RequestMapping("/submitUpload") public String submitUpload(Model model,
	 * HttpSession session, MultipartFile remoteFile) throws Exception {
	 * 
	 * //windows路径\\; LINUX路径/ String uploadDir =
	 * session.getServletContext().getRealPath("/") + "upLoadDir/"; if
	 * (!session.getAttribute("username").equals("admin888")) { return "login";
	 * } // 原始名称 String originalFilename = remoteFile.getOriginalFilename(); //
	 * 上传 if (remoteFile != null && originalFilename != null &&
	 * originalFilename.length() > 0) { File newFile = new File(uploadDir +
	 * originalFilename); try { if(!newFile.getParentFile().exists()){
	 * newFile.getParentFile().mkdirs(); } newFile.createNewFile(); } catch
	 * (IOException e) { e.printStackTrace(); } remoteFile.transferTo(newFile);
	 * } // 成功则继续上传 return"upload"; }
	 */

	// 取消下载 转为邮件发送 下载文件
	// filename不能为中文 由于文件是直接拖到linux下，没有转换文件名
	@RequestMapping("/download/{proj_id}/{fileName}.{suffix}")
	public ModelAndView download(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("proj_id") Integer proj_id,@PathVariable("fileName") String fileName, @PathVariable("suffix") String suffix) throws Exception {
		//String contentType = "application/octet-stream";
		// String str = new String(fileName.getBytes("ISO8859-1"),"utf-8");
		HttpSession session  = request.getSession();
		String fullFileName = fileName + "." + suffix;
		String fileCtxPath = request.getSession().getServletContext().getRealPath("/") + "mailsDir/"+fullFileName;
//		infoService.download(request, response, fullFileName, contentType);
		MailUtils.sendMail((String)session.getAttribute("email"), "闻道附件："+fullFileName, null, "测试内容", fullFileName, fileCtxPath);

		
		//todo ajax
		String projName = infoService.findProjNameById(proj_id);
		List<Projdes> projDesList = infoService.findProjDesListByProjId(proj_id).getProjDesList();

		String priceDes = infoService.findProjPriceDesByProjId(proj_id);
		String priceFile = infoService.findProjPriceFileByProjId(proj_id);
		String detailDes = infoService.findProjDetailDesByProjId(proj_id);
		String detailFile = infoService.findProjDetailFileByProjId(proj_id);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("projId", proj_id);
		modelAndView.addObject("projName", projName);
		modelAndView.addObject("projDesList", projDesList);
		modelAndView.addObject("priceDes", priceDes);
		modelAndView.addObject("priceFileName", priceFile);
		modelAndView.addObject("detailDes", detailDes);
		modelAndView.addObject("detailFileName", detailFile);
		modelAndView.setViewName("projDetail");

		return modelAndView;
	}

}
