package com.winndoo.seoinfo.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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

import com.winndoo.seoinfo.po.ProjDetailInfo;
import com.winndoo.seoinfo.po.ProjSimpleInfo;
import com.winndoo.seoinfo.po.Projdes;
import com.winndoo.seoinfo.po.TableInfo;
import com.winndoo.seoinfo.service.InfoService;
import com.winndoo.seoinfo.service.WxBindService;
import com.winndoo.seoinfo.utils.HttpRequestUtils;

import net.sf.json.JSONObject;

//暂时不需要登录验证拦截器
@Controller
@RequestMapping("/info")
public class InfoController {
	@Autowired
	private InfoService infoService;
	
	@Autowired
	private WxBindService wxBindService;

	// wxd62ba60538758396
	// 获取是否有cookie
	@RequestMapping("/wxbind/{path}")
	public String bind(HttpServletRequest request, HttpSession session, @PathVariable("path") String path)
			throws Exception {

		String code = request.getParameter("code");
		String state = request.getParameter("state");
		if (code) {

		}
		String nickname = (String) session.getAttribute("nickname");
		if (nickname == null) {
			return "redirect:" + BIND_ACCOUNT;
		}

		if ("123".equalsIgnoreCase(state) && code != null) {
			String token_uri = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxd62ba60538758396&secret=743e539c3a85117fdc6a11cf70816b3d&code="
					+ code + "&grant_type=authorization_code";

			JSONObject jsonToken = HttpRequestUtils.httpGet(token_uri);
			String access_token = jsonToken.getString("access_token");
			String openid = jsonToken.getString("openid");

			String userInfo_url = "https://api.weixin.qq.com/sns/userinfo?" + "access_token=" + access_token
					+ "&openid=" + openid + "&lang=zh_CN";
			JSONObject jsonUser = HttpRequestUtils.httpGet(userInfo_url);
			String nickname = new String(jsonUser.getString("nickname").getBytes("ISO8859-1"), "utf-8");

		}

		return "info/tables";
	}

	// 总表单浏览
	@RequestMapping("/tables")
	public ModelAndView queryTables() throws Exception {
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
	public ModelAndView itemsView(@PathVariable("proj_id") Integer proj_id) throws Exception {

		String projName = infoService.findProjNameById(proj_id);
		List<Projdes> projDesList = infoService.findProjDesListByProjId(proj_id).getProjDesList();

		String priceDes = infoService.findProjPriceDesByProjId(proj_id);
		String priceFile = infoService.findProjPriceFileByProjId(proj_id);
		String detailDes = infoService.findProjDetailDesByProjId(proj_id);
		String detailFile = infoService.findProjDetailFileByProjId(proj_id);

		ModelAndView modelAndView = new ModelAndView();
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

	// 下载文件
	// filename不能为中文 由于文件是直接拖到linux下，没有转换文件名
	@RequestMapping("/download/{fileName}.{suffix}")
	public ModelAndView download(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("fileName") String fileName, @PathVariable("suffix") String suffix) throws Exception {
		String contentType = "application/octet-stream";
		// String str = new String(fileName.getBytes("ISO8859-1"),"utf-8");
		String fullFileName = fileName + "." + suffix;
		infoService.download(request, response, fullFileName, contentType);

		return null;
	}

}
