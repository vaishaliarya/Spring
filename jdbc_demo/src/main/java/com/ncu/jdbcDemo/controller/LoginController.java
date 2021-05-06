package com.ncu.jdbcDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ncu.jdbcDemo.dao.UserDao;
import com.ncu.jdbcDemo.models.User;


@Controller
@SessionAttributes("user")
public class LoginController {
	
	@Autowired
	private UserDao userdao;
	
	@ModelAttribute("user")
	   public User setUpUserForm() {
	      return new User();
	   }

	   @RequestMapping("/")
	   public String index() {
		 
		   return "index";
	   }

	
	  
	  @RequestMapping(value="/dologin", method=RequestMethod.GET)
	   public String doLogin(@ModelAttribute("user") User user, Model model) {
		  String email=user.getEmail();
	      // Implement your business logic
	      if (user.getEmail().equals("vaishali@gmail.com") || user.getPassword().equals("abc@123")) {
	         // Set user dummy data
	        System.out.println(user.getEmail());
	        
	         user=userdao.get(email);
	     
	        
//	        System.out.println(userdao.get(email));
//	    	  user.setFname("vaishali");
//	        
//	         user.setLname("Kalra");
//	         user.setAge(34);
	         model.addAttribute(user);
	      } else {
	         model.addAttribute("message","Login failed. Try again.");
	         System.out.println("login failed");
	         return "index";
	      }
	      return "success";
	   }
	   @RequestMapping(value="/test", method = RequestMethod.GET)
		 public String userInfo(@SessionAttribute("user") User user) {

		      System.out.println("Email: " + user.getEmail());
		      System.out.println("First Name: " + user.getFname());

		      return "user-test";
		   }
	   @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
		 public String dbInfo( @PathVariable("id") String id, @ModelAttribute("user") User user, Model model) {
		 
//		   String email=user.getEmail();
		      System.out.println("id: " + id);
		      System.out.println("First Name: " + user.getFname());

		      user=userdao.get(id);
		      model.addAttribute(user);
		      return "dbinfo";
		   }

}
