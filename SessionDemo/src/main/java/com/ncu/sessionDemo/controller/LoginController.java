package com.ncu.sessionDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ncu.sessionDemo.model.User;

@Controller
@SessionAttributes("user")
public class LoginController {
	@ModelAttribute("user")
	   public User setUpUserForm() {
	      return new User();
	   }

	   @RequestMapping("/")
	   public String index(Model model) {
	     model.addAttribute("user", new User());
		   return "index";
	   }

	   @RequestMapping(value="/dologin", method=RequestMethod.GET)
	   public String doLogin(@ModelAttribute("user") User user, Model model) {

	      // Implement your business logic
	      if (user.getEmail().equals("vaishali@gmail.com") && user.getPassword().equals("abc@123")) {
	         // Set user dummy data
	        System.out.println(user.getEmail());
	    	  user.setFname("vaishali");
	         user.setMname("Arya");
	         user.setLname("Kalra");
	         user.setAge(34);
	         model.addAttribute(user);
	      } else {
	         model.addAttribute("message","Login failed. Try again.");
	         System.out.println("login failed");
	         return "index";
	      }
	      return "success";
	   }
}
