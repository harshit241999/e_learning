package com.training.doa;
import java.util.List;
import com.training.module.contact;
public interface contactdoa {

	List<contact> findAll();


	boolean addContact(contact Contact);

	contact getUserById(Long id);

	boolean deleteUser(Long id);
	
	boolean updateUser(contact Contact);
}	
	