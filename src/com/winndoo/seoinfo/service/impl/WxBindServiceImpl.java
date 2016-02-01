package com.winndoo.seoinfo.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.winndoo.seoinfo.service.WxBindService;

public class WxBindServiceImpl implements WxBindService{

	@Override
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
	}
	
}
