package com.yc.thread.d0730;

import com.yc.thread.d0729.HttpServlet;
import com.yc.thread.d0729.HttpServletRequest;
import com.yc.thread.d0729.HttpServletResponse;

public class PostServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		System.out.println("=========");
		response.getWriter().append("post,name="+name);
	}
}
