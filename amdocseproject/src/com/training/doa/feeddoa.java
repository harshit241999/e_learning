package com.training.doa;
import java.util.List;
import com.training.module.feedback;
public interface feeddoa {

	List<feedback> findAll();


	boolean addfeedback(feedback Feedback);

	feedback getUserById(Long id);

	boolean deletefeedback(Long id);
	
	boolean updatefeedback(feedback Feedback);
}	
	