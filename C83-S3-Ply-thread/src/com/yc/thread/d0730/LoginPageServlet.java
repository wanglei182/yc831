package com.yc.thread.d0730;

import com.yc.thread.d0729.Cookie;
import com.yc.thread.d0729.HttpServlet;
import com.yc.thread.d0729.HttpServletRequest;
import com.yc.thread.d0729.HttpServletResponse;

public class LoginPageServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Cookie[] cookies=request.getCookies();
		
		response.getWriter().append("用户名<input value='"+cookies[0].getValue()+"'><br>");
		response.getWriter().append("密码<input value=' '><br>");
		response.getWriter().append("<input type='button' value='登录'><br>");
		


		
	}

}
