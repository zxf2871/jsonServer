package com.tgb.lk.demo.appserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetPostServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("get method -----------");
		getPost(request,response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post method -----------");
		getPost(request,response);
	}

	public void getPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		// 处理中文乱码问题解决办法
		response.setContentType("text/xml; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("{\"result_code\":\"1\",\"result_massage\":\"abcdefghijklmn\",\"result\":[].}");
 		out.flush();
		out.close();
	}

}
