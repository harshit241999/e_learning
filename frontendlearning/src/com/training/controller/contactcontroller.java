package com.training.controller;
import com.training.doa.contactdoa;
import com.training.module.contact;
import com.training.imple.contactimpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/contacts")
public class contactcontroller extends HttpServlet {
	
	   @Override
      protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		PrintWriter out =resp.getWriter();
		long userid =Long.parseLong(req.getParameter("userid"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		long phone_no =Long.parseLong(req.getParameter("phone_no"));
		String message=req.getParameter("message");
		int contact_id=Integer.parseInt(req.getParameter("contact_id"));
		out.println(userid+"<br>");
		out.println(name+"<br>");
		out.println(email+"<br>");
		out.println(phone_no+"<br>");
		out.println(message+"<br>");
		out.println(contact_id+"<br>");
		contact Contact=new contact(userid,name,email,phone_no,message,contact_id );
		contactdoa dao=new contactimpl();
		boolean addcontact=dao.addContact(Contact);
		if(addcontact)
			System.out.println("suuces");

	}

}
