package com.ncu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ncu.models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Student theStudent = new Student();
		
		// add student object to the model
		theModel.addAttribute("student", theStudent);
		initModelList(theModel);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName()
							+ " " + theStudent.getLastName());
		
		return "student-confirmation";
	}
	
	private void initModelList(Model model) {
		 Map<String, String> countryList = new HashMap<String, String>();
	      countryList.put("US", "United States");
	      countryList.put("CH", "China");
	      countryList.put("SG", "Singapore");
	      countryList.put("MY", "Malaysia");
	     
        model.addAttribute("countryList", countryList);
    }
//	@ModelAttribute("countryList")
//	   public Map<String, String> getCountryList() {
//	      Map<String, String> countryList = new HashMap<String, String>();
//	      countryList.put("US", "United States");
//	      countryList.put("CH", "China");
//	      countryList.put("SG", "Singapore");
//	      countryList.put("MY", "Malaysia");
//	      return countryList;
//	   }
}
