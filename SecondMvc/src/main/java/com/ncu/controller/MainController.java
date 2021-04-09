package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.ncu.models.Employee;

@Controller
public class MainController {

	@RequestMapping("/home")
	public String Home(Model model) {
		model.addAttribute("EmpModel", new Employee("Vaishali","Kalra"));
		
		return "home-login";
	}
	@RequestMapping(path = "/login",method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("EmpModel") Employee emp , Model model) {
		
			model.addAttribute("EmpName", emp.getEmpname());
			model.addAttribute("EmpId", emp.getEmpid());
		
		return "dashboard";
	}
	
}
