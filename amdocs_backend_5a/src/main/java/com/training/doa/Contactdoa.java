package com.training.doa;
import java.util.List;
import com.training.module.Contact;
public interface Contactdoa {

	List<Contact> findAll();


	boolean addContact(Contact contact);

	Contact getUserById(Long id);

	boolean deleteUser(Long id);
	
	boolean updateUser(Contact contact);
}	
	