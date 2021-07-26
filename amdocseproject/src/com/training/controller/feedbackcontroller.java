package com.training.controller;
import java.util.List;
import java.io.*;
import com.training.doa.feeddoa;
import com.training.imple.feedbackimpl;
import com.training.module.feedback;
public class feedbackcontroller {
	public static void main(String[] args) throws IOException {
		
		feeddoa data=new feedbackimpl();
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
	System.out.println("enter the f_id");
	Long f_id=Long.parseLong(br.readLine());
	System.out.println("enter the feedbbacck");
	String feedbbacck=br.readLine();
	feedback Feedback = new feedback(userid,name,email,f_id,feedbbacck);
	
	boolean status = data.addfeedback(Feedback);
	if(status)
		System.out.println("User Added Successfully");
	System.out.println("enter the student id to delete");
	Long userId=Long.parseLong(br.readLine());
	 boolean b= data.deletefeedback(userId);
	 if(b)
	 {
		 System.out.println("delete successfully");
	 }
	List<feedback>list=data.findAll();
	list.forEach(System.out::println);
	}
}