package com.training.controller;
import java.util.List;
import java.io.*;
import com.training.doa.Admindoa;
import com.training.imple.Adminimple;
import com.training.module.Admin;
public class Admincontroller {
	public static void main(String[] args) throws IOException {
	Admindoa c_data=new Adminimple();
//	user User = new user(105L, "rohan", "afsafcaf", "rohan@gmail.com", "New Delhi");
	//boolean status =data.addUser(User);
//	if(status)
	//	System.out.println("user added successfully");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("8enter the admin id");
	Long adminid=Long.parseLong(br.readLine());
	System.out.println("enter the name");
	String name=br.readLine();
	System.out.println("enter the email");
	String email=br.readLine();
	System.out.println("enter the password");
	String password=br.readLine();
	
	Admin admin = new Admin(adminid,name,email,password);
	
	boolean status = c_data.addadmin(admin);
	if(status)
		System.out.println("User Added Successfully");
	System.out.println("enter the student id to delete");
	Long cId=Long.parseLong(br.readLine());
	 boolean b= c_data.deleteadmin(cId);
	 if(b)
	 {
		 System.out.println("delete successfully");
	 }
	List<Admin>list=c_data.findAll();
	list.forEach(System.out::println);
	}
}