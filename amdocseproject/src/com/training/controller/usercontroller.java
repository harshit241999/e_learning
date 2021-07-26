package com.training.controller;
import java.util.List;
import java.io.*;
import com.training.doa.userdoa;
import com.training.imple.userimpl;
import com.training.module.user;
public class usercontroller {
	public static void main(String[] args) throws IOException {
	userdoa data=new userimpl();
//	user User = new user(105L, "rohan", "afsafcaf", "rohan@gmail.com", "New Delhi");
	//boolean status =data.addUser(User);
//	if(status)
	//	System.out.println("user added successfully");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the userid");
	Long userid=Long.parseLong(br.readLine());
	System.out.println("enter the name");
	String name=br.readLine();
	System.out.println("enter the phone no");
	Long phone_no=Long.parseLong(br.readLine());
	System.out.println("enter the email");
	String email=br.readLine();
	System.out.println("enter the reg date");
	String reg_date=br.readLine();
	System.out.println("enter the address");
	String address=br.readLine();
	System.out.println("enter the password");
	String password=br.readLine();
	System.out.println("enter the uploadimg");
	String upload_image=br.readLine();
	user User = new user(userid,name,phone_no,email,address,password,upload_image,reg_date);
	
	boolean status = data.addUser(User);
	if(status)
		System.out.println("User Added Successfully");
	System.out.println("enter the student id to delete");
	Long userId=Long.parseLong(br.readLine());
	 boolean b= data.deleteUser(userId);
	 if(b)
	 {
		 System.out.println("delete successfully");
	 }
	List<user>list=data.findAll();
	list.forEach(System.out::println);
	}
}