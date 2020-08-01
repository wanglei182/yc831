package com.yc.thread.d0730;

import com.yc.thread.d0729.HttpServlet;
import com.yc.thread.d0729.HttpServletRequest;
import com.yc.thread.d0729.HttpServletResponse;

public class ToIndexServlet extends HttpServlet{ 
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		response.sendRedirect("/photo/index.html");
	}
}
