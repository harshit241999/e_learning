package com.training.doa;
import java.util.List;
import com.training.module.course;
public interface coursedoa {

	List<course> findAll();


	boolean addcc(course Course);

	course getUserById(Long id);

	boolean deleteUser(Long id);
	
	boolean updateUser(course Course);
}	
	