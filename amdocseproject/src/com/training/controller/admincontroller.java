package com.training.controller;
import java.util.List;
import java.io.*;
import com.training.doa.admindoa;
import com.training.imple.adminimple;
import com.training.module.admin;
public class admincontroller {
	public static void main(String[] args) throws IOException {
	admindoa c_data=new adminimple();
//	user User = new user(105L, "rohan", "afsafcaf", "rohan@gmail.com", "New Delhi");
	//boolean status =data.addUser(User);
//	if(status)
	//	System.out.println("user added successfully");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the admin id");
	Long admin_id=Long.parseLong(br.readLine());
	System.out.println("enter the name");
	String name=br.readLine();
	System.out.println("enter the email");
	String email=br.readLine();
	System.out.println("enter the password");
	String password=br.readLine();
	
	admin Admin = new admin(admin_id,name,email,password);
	
	boolean status = c_data.addadmin(Admin);
	if(status)
		System.out.println("User Added Successfully");
	System.out.println("enter the student id to delete");
	Long cId=Long.parseLong(br.readLine());
	 boolean b= c_data.deleteadmin(cId);
	 if(b)
	 {
		 System.out.println("delete successfully");
	 }
	List<admin>list=c_data.findAll();
	list.forEach(System.out::println);
	}
}