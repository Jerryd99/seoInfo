package com.winndoo.seoinfo.service;

public interface WxBindService {
	public final String QUERY_CODE_URL_PRE ="https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxd62ba60538758396&redirect_uri=";
	public final String QUERY_CODE_URL_SUF ="&response_type=code&scope=snsapi_userinfo&state=123#wechat_redirect";
	public final String QUERY_TOKEN_URL_PRE = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxd62ba60538758396&secret=743e539c3a85117fdc6a11cf70816b3d&code=";
	public final String QUERY_TOKEN_URL_SUF = "&grant_type=authorization_code";
	public final String QUERY_USERINFO_URL_PRE = "https://api.weixin.qq.com/sns/userinfo?access_token=";
	public final String QUERY_USERINFO_URL_MID = "&openid=";
	public final String QUERY_USERINFO_URL_SUF = "&lang=zh_CN";
	
	public String getNickName(String code) throws Exception;
}
