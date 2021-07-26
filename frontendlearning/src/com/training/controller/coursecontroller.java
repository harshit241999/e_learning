package com.training.controller;
import com.training.doa.coursedoa;

import com.training.module.course;
import com.training.imple.courseimpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/course")
public class coursecontroller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		long course_id = Long.parseLong(req.getParameter("course_id"));
		String c_name = req.getParameter("c_name");
		String c_desp = req.getParameter("c_desp");
		long c_fees = Long.parseLong(req.getParameter("c_fees"));
		String c_resource = req.getParameter("c_resource");
		
//
//		Contact user = new Contact(id, name, email, phone, message, contactId);
//		ContactDAO dao = new ContactDAOImpl();
//		boolean addUser = dao.addUser(user);
//		if (addUser)
//			out.println("User added successfully");
//		else
//			out.println("Try again");
		out.println(course_id + "<br>");
		out.println(c_name + "<br>");
		out.println(c_desp + "<br>");
		out.println(c_fees + "<br>");
		out.println(c_resource + "<br>");
		course Course=new course(course_id,c_name,c_desp,c_fees,c_resource );
		coursedoa dao=new courseimpl();
		boolean doa=dao.addcc(Course);
		if(doa)
			System.out.println("success");

	}

}
