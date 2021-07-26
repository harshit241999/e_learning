package com.training.controller;
import com.training.doa.userdoa;
import com.training.module.user;
import com.training.imple.userimpl;
//import com.training.controller.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/registers")
public class RegistrationController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		PrintWriter out =resp.getWriter();
		long userid =Long.parseLong(req.getParameter("userid"));
		String name=req.getParameter("name");
		long phone_no =Long.parseLong(req.getParameter("phone_no"));
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		String password=req.getParameter("password");
		String upload_image=req.getParameter("upload_image");
		String reg_date=req.getParameter("reg_date");
		out.println(userid+"<br>");
		out.println(name+"<br>");
		out.println(phone_no+"<br>");
		out.println(email+"<br>");
		out.println(address+"<br>");
		out.println(upload_image+"<br>");
		out.println(reg_date+"<br>");
		user User=new user(userid,name,phone_no,email,address,password,upload_image,reg_date );
		userdoa dao=new userimpl();
		boolean adduser=dao.addUser(User);
		if(adduser)
			System.out.println("suuces");

	}
}
