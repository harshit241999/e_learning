package com.training.controller;
import java.util.List;
import java.io.*;
import com.training.doa.coursedoa;
import com.training.imple.courseimpl;
import com.training.module.course;
public class coursecontroller {
	public static void main(String[] args) throws IOException {
	coursedoa c_data=new courseimpl();
//	user User = new user(105L, "rohan", "afsafcaf", "rohan@gmail.com", "New Delhi");
	//boolean status =data.addUser(User);
//	if(status)
	//	System.out.println("user added successfully");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the courseid");
	Long course_id=Long.parseLong(br.readLine());
	System.out.println("enter the c_name");
	String c_name=br.readLine();
	System.out.println("enter the c_desp");
	String c_desp=br.readLine();
	System.out.println("enter the c_fees");
	Long c_fees=Long.parseLong(br.readLine());
	System.out.println("enter the c_resoursce");
	String c_resource=br.readLine();
	
	course Course = new course(course_id,c_name,c_desp,c_fees,c_resource);
	
	boolean status = c_data.addcc(Course);
	if(status)
		System.out.println("User Added Successfully");
	System.out.println("enter the student id to delete");
	Long cId=Long.parseLong(br.readLine());
	 boolean b= c_data.deleteUser(cId);
	 if(b)
	 {
		 System.out.println("delete successfully");
	 }
	List<course>list=c_data.findAll();
	list.forEach(System.out::println);
	}
}