/**
 * 
 */
package com.shihao.sso.sub.one.web.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shihao.sso.sub.one.web.cache.LocalCache;

/**
 * 
 * @author beidou
 * @date 2017年6月21日 下午1:25:04
 */
public class AuthorFilter implements Filter {

	private static String[] NOT_FILTER;
	
	@Override
	public void destroy() {

	}

	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		 if (!(request instanceof HttpServletRequest) || !(response instanceof HttpServletResponse)) {  
	            throw new ServletException(" just supports HTTP requests");  
	     } 
		 HttpServletRequest httpRequest = (HttpServletRequest) request;  
		 HttpServletResponse httpResponse = (HttpServletResponse) response;  
	     String requestUri = httpRequest.getRequestURI();
	     String requestUrl = httpRequest.getRequestURL().toString();
	     boolean isFilter = checkFilter(requestUri);
	     if (isFilter) {
	    	 String sessionId = "";
	    	 Cookie[] cookies = httpRequest.getCookies();
	    	 if (cookies != null) {
	    		 for (Cookie cookie : cookies) {
		    		 if ("sessionId".equals(cookie.getName())) {
		    			 sessionId = cookie.getValue();
		    		 }
		    	 }
	    	 }
	    	 List<String> author = LocalCache.get(sessionId);
	    	 if (author != null) {
	    		 chain.doFilter(request, response);
	    	 } else {
	    		 //跳转到sso，进行统一登录
	    		 httpResponse.sendRedirect( "http://localhost:8080/sso-admin/user/login?appId=123&desUrl=" + requestUrl ); 
	    	 }
	     } else {
	    	 chain.doFilter(request, response);
	     }

	}
	
	private boolean checkFilter(String uri) {
		for (String url : NOT_FILTER) {
			 if (uri.endsWith(url) || uri.contains(url)) {
				 return false;
			 }
		 }
		return true;
	}

	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String skip = filterConfig.getInitParameter("skip");
		NOT_FILTER = skip.split(",");
	}

}
