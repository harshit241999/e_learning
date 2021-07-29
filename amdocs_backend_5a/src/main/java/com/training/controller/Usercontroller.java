package com.training.controller;

import java.util.List;
import java.io.*;
import com.training.doa.Userdoa;
import com.training.imple.Userimpl;
import com.training.module.User;

public class Usercontroller {
	public static void main(String[] args) throws IOException {
		Userdoa data = new Userimpl();
//	user User = new user(105L, "rohan", "afsafcaf", "rohan@gmail.com", "New Delhi");
		// boolean status =data.addUser(User);
//	if(status)
		// System.out.println("user added successfully");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	System.out.println("enter the userid");
//	Long userid=Long.parseLong(br.readLine());
//	System.out.println("enter the name");
//	String name=br.readLine();
//	System.out.println("enter the phone no");
//	Long phone_no=Long.parseLong(br.readLine());
//	System.out.println("enter the email");
//	String email=br.readLine();
//	System.out.println("enter the reg date");
//	String reg_date=br.readLine();
//	System.out.println("enter the address");
//	String address=br.readLine();
//	System.out.println("enter the password");
//	String password=br.readLine();
//	System.out.println("enter the uploadimg");
//	String upload_image=br.readLine();
//	User user = new User(userid,name,phone_no,email,address,password,upload_image,reg_date);
//	
//	boolean status = data.addUser(user);
//	if(status)
//		System.out.println("User Added Successfully");
//	System.out.println("enter the student id to delete");
	Long userId=Long.parseLong(br.readLine());
	 boolean b= data.deleteUser(userId);
      if(b)
	 {
		 System.out.println("delete successfully");
	 }
		User u = data.getUserById(125L);
		System.out.println(u);

		u.setName("toppo");
		boolean updateuser = data.updateUser(u);
		if (updateuser)
			System.out.println("user updated successfully");
		else
			System.out.println("No User available");
		List<User> list = data.findAll();
		list.forEach(System.out::println);
	}
}