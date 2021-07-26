package com.training.doa;
import java.util.List;
import com.training.module.admin;
public interface admindoa {

	List<admin> findAll();


	boolean addadmin(admin Admin);

	admin getUserById(Long id);

	boolean deleteadmin(Long id);
	
	boolean updateUser(admin Admin);
}	
	