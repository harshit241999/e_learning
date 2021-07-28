package com.training.controller;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.training.doa.Userdoa;
import com.training.imple.Userimpl;
import com.training.module.User;
@Controller
public class UserController {


	Userdoa userDao=new Userimpl();
	
	@GetMapping("/user-list")
	public String usersPage(Model model) {

		List<User> userList = userDao.findAll();
		model.addAttribute("list", userList);
		return "users";
	}
	@GetMapping("/addUser")
	public String addUserForm(Model model){
		model.addAttribute("user", new User());
		return "add-user";
	}
	@PostMapping("/register")
	public String addUser(@ModelAttribute("user") User u) {
		userDao.addUser(u);
		//as we hv no page after reg so we redirect again to add user page
		return "redirect:/user-list";
	}
	@GetMapping("/delete-user/{userid}")
	public String deleteUser(@PathVariable("userid") Long userid) {
		userDao.deleteUser(userid);
		return "redirect:/user-list";
	}
	@GetMapping("/update-user/{userid}")
	public String updateUserForm(@PathVariable("userid") Long userid, Model model) {
		User user = userDao.getUserById(userid);
		model.addAttribute("user", user);
		return "update-user";
	}
	@PostMapping("/update-user")
	public String updateUser(@ModelAttribute("user") User user) {
		userDao.updateUser(user);
		return "redirect:/user-list";
	}

	
 
}
