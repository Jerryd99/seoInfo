package com.winndoo.seoinfo.service.impl;

import com.winndoo.seoinfo.service.WxBindService;
import com.winndoo.seoinfo.utils.HttpRequestUtils;

import net.sf.json.JSONObject;

public class WxBindServiceImpl implements WxBindService{

	@Override
	public String getNickName(String code) throws Exception {
		String token_url = QUERY_TOKEN_URL_PRE + code + QUERY_TOKEN_URL_SUF;

		JSONObject jsonToken = HttpRequestUtils.httpGet(token_url);
		String access_token = jsonToken.getString("access_token");
		String openid = jsonToken.getString("openid");

		String userInfo_url = QUERY_USERINFO_URL_PRE + access_token
				+ QUERY_USERINFO_URL_MID + openid + QUERY_USERINFO_URL_SUF;
		JSONObject jsonUser = HttpRequestUtils.httpGet(userInfo_url);
		String nickname = new String(jsonUser.getString("nickname").getBytes("ISO8859-1"), "utf-8");
		return nickname;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Override
	public boolean isWxBind(HttpServletRequest request, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		String bindflag = request.getParameter("bindflag");
		String nickname = request.getParameter("nickname");
		String code = request.getParameter("code");
		String state = request.getParameter("state");
		
		if(bindflag.equals("true") || nickname != null){
			return true;
		}
		
		//是bind请求
		if("123".equalsIgnoreCase(state) && code != null){
			setBindData(session,"true",nickname);
		}
		//不是bind请求
		else if (bindflag == null || nickname == null){
			return false;
		}
		return true;
	}

	@Override
	public void queryWxBind(String path) throws Exception {
		// TODO Auto-generated method stub
		String bind_url ="https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxd62ba60538758396&redirect_uri=http%3A%2F%2Fseo.winndoo.com%2FseoInfo%2Finfo%2Fwxbind&response_type=code&scope=snsapi_userinfo&state=123#wechat_redirect";
	}

	@Override
	public void setBindData(HttpSession session,String bindFlag, String nickName) throws Exception {
		// TODO Auto-generated method stub
		session.setAttribute("bindFlag", bindFlag);
		session.setAttribute("nickname", nickName);		
	}*/
	
}
