package com.winndoo.seoinfo.interceptor;

import java.net.URLEncoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.winndoo.seoinfo.po.User;
import com.winndoo.seoinfo.service.InfoService;
import com.winndoo.seoinfo.service.WxBindService;

public class AuthInterceptor implements HandlerInterceptor {

	/*<mvc:interceptors>
	<!--多个拦截器,顺序执行 -->
	<!-- 登陆认证拦截器 -->
	<mvc:interceptor>
		<mvc:mapping path="/**"/>
		<bean class="com.winndoo.seoinfo.interceptor.AuthInterceptor"></bean>
	</mvc:interceptor>
	
</mvc:interceptors>*/
	
	@Autowired
	private WxBindService wxBindService;
	
	@Autowired
	private InfoService infoService;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		//获取请求的url
		 String url = URLEncoder.encode(request.getRequestURL().toString(),"utf-8");
		 String redirect_url = wxBindService.QUERY_CODE_URL_PRE + url + wxBindService.QUERY_CODE_URL_SUF;
		 User user2 = infoService.findUserByNickName("戴戴test1234");
		
		//判断session
		HttpSession session  = request.getSession();
		//从session中取出用户身份信息
		String hasauth = (String) session.getAttribute("hasauth");
		
		//已经设置了权限字段的处理
		if(hasauth != null){
			if(hasauth.equals("true")){
				return true;
			}
			else{
				response.sendRedirect(request.getContextPath() + "/jsp/error.jsp");
			}
		}
		else{
			String code = request.getParameter("code");
			String state = request.getParameter("state");
			if(code != null && state != null){
				//取得nickname，写入session
				String nickname = wxBindService.getNickName(code);
				session.setAttribute("nickname",nickname);
				User user = infoService.findUserByNickName(nickname);
				//判断是否在db里，将hasauth写入session
				if(user == null){
					session.setAttribute("hasauth","false");
					response.sendRedirect(request.getContextPath() + "/jsp/error.jsp");
				}
				else{
					session.setAttribute("hasauth","true");
					session.setAttribute("nickname",nickname);
					session.setAttribute("email",user.getEmail());
					return true;
				}
				
			}
			else{
				response.sendRedirect(redirect_url);
			}
		}

		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
