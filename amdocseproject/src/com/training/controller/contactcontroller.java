package com.training.controller;
import java.util.List;
import java.io.*;
import com.training.doa.contactdoa;
import com.training.imple.contactimpl;
import com.training.module.contact;
public class contactcontroller {
	public static void main(String[] args) throws IOException {
	contactdoa contactdoa=new contactimpl();
//	user User = new user(105L, "rohan", "afsafcaf", "rohan@gmail.com", "New Delhi");
	//boolean status =data.addUser(User);
//	if(status)
	//	System.out.println("user added successfully");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the userid");
	Long userid=Long.parseLong(br.readLine());
	System.out.println("enter the name");
	String name=br.readLine();
	System.out.println("enter the email");
	String email=br.readLine();
	System.out.println("enter the phone no");
	Long phone_no=Long.parseLong(br.readLine());
	System.out.println("enter the message");
	String message=br.readLine();
	System.out.println("enter the contact_id");
	int contact_id=Integer.parseInt(br.readLine());
	contact Contact = new contact(userid,name,email,phone_no,message,contact_id);	
	boolean status = contactdoa.addContact(Contact);
	if(status)
		System.out.println("User Added Successfully");
	System.out.println("enter the student id to delete");
	Long userId=Long.parseLong(br.readLine());
	 boolean b= contactdoa.deleteUser(userId);
	 if(b)
	 {
		 System.out.println("delete successfully");
	 }
	List<contact>list=contactdoa.findAll();
	list.forEach(System.out::println);
	}
}