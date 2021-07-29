package com.training.doa;
import java.util.List;
import com.training.module.Admin;
public interface Admindoa {

	List<Admin> findAll();


	boolean addadmin(Admin Admin);

	Admin getUserById(Long id);

	boolean deleteadmin(Long id);
	
	boolean updateUser(Admin admin);
}	
	