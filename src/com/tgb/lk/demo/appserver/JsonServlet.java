package com.tgb.lk.demo.appserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JsonServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("json-----------POST");
		getPost(request,response);

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("json-----------GET");
		getPost(request,response);
	}

	public void getPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(request
				.getInputStream(), "UTF-8"));
		// 数据
		String retData = null;
		String responseData = "";
		while ((retData = in.readLine()) != null) {
			responseData += retData;
		}
		in.close();

		System.out.println("json: " + responseData);

		response.setContentType("text/xml; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("{\"result_code\":\"1\",\"result_massage\":\"abcdefghijklmn\",\"result\":[]}");
		out.flush();
		out.close();
	}

}
