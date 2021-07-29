package com.training.doa;
import java.util.List;
import com.training.module.User;
public interface Userdoa {

	List<User> findAll();


	boolean addUser(User user);

	User getUserById(Long id);

	boolean deleteUser(Long id);
	
	boolean updateUser(User user);
}	
	