package com.training.doa;
import java.util.List;
import com.training.module.user;
public interface userdoa {

	List<user> findAll();


	boolean addUser(user User);

	user getUserById(Long id);

	boolean deleteUser(Long id);
	
	boolean updateUser(user User);
}	
	