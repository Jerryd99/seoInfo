package com.winndoo.seoinfo.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface WxBindService {
	
	public boolean isWxBind(HttpServletRequest request, HttpSession session) throws Exception;
	public void queryWxBind(String path) throws Exception;
	public void setBindData(HttpSession session,String bindFlag, String nickName) throws Exception;
}
