package com.training.controller;
import java.util.List;
import java.io.*;
import com.training.doa.Contactdoa;
import com.training.imple.Contactimpl;
import com.training.module.Contact;

public class Contactcontroller {
	public static void main(String[] args) throws IOException {
	Contactdoa contactdoa=new Contactimpl();
//	user User = new user(105L, "rohan", "afsafcaf", "rohan@gmail.com", "New Delhi");
	//boolean status =data.addUser(User);
//	if(status)
	//	System.out.println("user added successfully");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//	System.out.println("enter the userid");
//	Long userid=Long.parseLong(br.readLine());
//	System.out.println("enter the name");
//	String name=br.readLine();
//	System.out.println("enter the email");
//	String email=br.readLine();
//	System.out.println("enter the phone no");
//	Long phone_no=Long.parseLong(br.readLine());
//	System.out.println("enter the message");
//	String message=br.readLine();
//	System.out.println("enter the contact_id");
//	int contact_id=Integer.parseInt(br.readLine());
//	Contact contact = new Contact(userid,name,email,phone_no,message,contact_id);	
//	boolean status = contactdoa.addContact(contact);
//	if(status)
//		System.out.println("User Added Successfully");
//	System.out.println("enter the student id to delete");
//	Long userId=Long.parseLong(br.readLine());
//	 boolean b= contactdoa.deleteUser(userId);
//	 if(b)
//	 {
//		 System.out.println("delete successfully");
//	 }
	Contact u = contactdoa.getUserById(104L);
	System.out.println(u);

	u.setName("jaag");
	boolean updateuser = contactdoa.updateUser(u);
	if (updateuser)
		System.out.println("user updated successfully");
	else
		System.out.println("No User available");
//	List<Contact>list=contactdoa.findAll();
//	list.forEach(System.out::println);
	}
}