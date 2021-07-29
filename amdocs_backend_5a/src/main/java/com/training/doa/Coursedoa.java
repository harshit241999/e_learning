package com.training.doa;
import java.util.List;
import com.training.module.Course;
public interface Coursedoa {

	List<Course> findAll();


	boolean addcc(Course course);

	Course getUserById(Long id);

	boolean deleteUser(Long id);
	
	boolean updateUser(Course course);
}	
	