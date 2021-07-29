package com.training.controller;
import java.util.List;
import java.io.*;
import com.training.doa.Coursedoa;
import com.training.imple.Courseimpl;
import com.training.module.Contact;
import com.training.module.Course;
public class Coursecontroller {
	public static void main(String[] args) throws IOException {
	Coursedoa c_data=new Courseimpl();
//	user User = new user(105L, "rohan", "afsafcaf", "rohan@gmail.com", "New Delhi");
	//boolean status =data.addUser(User);
//	if(status)
	//	System.out.println("user added successfully");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//	System.out.println("enter the courseid");
//	Long course_id=Long.parseLong(br.readLine());
//	System.out.println("enter the c_name");
//	String c_name=br.readLine();
//	System.out.println("enter the c_desp");
//	String c_desp=br.readLine();
//	System.out.println("enter the c_fees");
//	Long c_fees=Long.parseLong(br.readLine());
//	System.out.println("enter the c_resoursce");
//	String c_resource=br.readLine();
//	
//	Course course = new Course(course_id,c_name,c_desp,c_fees,c_resource);
//	
//	boolean status = c_data.addcc(course);
//	if(status)
//		System.out.println("User Added Successfully");
//	System.out.println("enter the student id to delete");
//	Long cId=Long.parseLong(br.readLine());
//	 boolean b= c_data.deleteUser(cId);
//	 if(b)
//	 {
//		 System.out.println("delete successfully");
//	 }
	Course u = c_data.getUserById(111L);
	System.out.println(u);

	u.setCname("C#");
	boolean updateuser = c_data.updateUser(u);
	if (updateuser)
		System.out.println("user updated successfully");
	else
		System.out.println("No User available");
//	List<Course>list=c_data.findAll();
//	list.forEach(System.out::println);
	}
}