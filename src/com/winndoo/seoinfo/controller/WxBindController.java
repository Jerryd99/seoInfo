package com.winndoo.seoinfo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winndoo.seoinfo.utils.HttpRequestUtils;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/wxbind")
public class WxBindController {
	
	public static final String BIND_ACCOUNT ="https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxd62ba60538758396&redirect_uri=http%3A%2F%2Fseo.winndoo.com%2FseoInfo%2Finfo%2Fwxbind&response_type=code&scope=snsapi_userinfo&state=123#wechat_redirect";

	@RequestMapping("/tables")
	public String bind(HttpServletRequest request, HttpSession session/*@RequestParam(value="code", required=false) String code*/) throws Exception {
			
			String code = request.getParameter("code");
			String state = request.getParameter("state");
			if(code){
				
			}
			String nickname = (String) session.getAttribute("nickname");
			if(nickname == null){
				return "redirect:"+BIND_ACCOUNT;
			}
			
			if("123".equalsIgnoreCase(state)&&code!=null){
			String token_uri = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxd62ba60538758396&secret=743e539c3a85117fdc6a11cf70816b3d&code="+code+"&grant_type=authorization_code";

			JSONObject jsonToken = HttpRequestUtils.httpGet(token_uri);
			String access_token = jsonToken.getString("access_token");
			String openid = jsonToken.getString("openid");
			
			String  userInfo_url = "https://api.weixin.qq.com/sns/userinfo?"+"access_token=" + access_token+"&openid="+openid+"&lang=zh_CN";
			JSONObject jsonUser = HttpRequestUtils.httpGet(userInfo_url);
			String nickname = new String(jsonUser.getString("nickname").getBytes("ISO8859-1"),"utf-8");
						
		}
		
		return "info/tables";
	}
	
}
