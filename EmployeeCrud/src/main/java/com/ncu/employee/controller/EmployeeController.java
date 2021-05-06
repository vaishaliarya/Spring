package com.ncu.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ncu.employee.dao.EmployeeDao;
import com.ncu.employee.models.Employee;

@Controller
public class EmployeeController {
	@Autowired
    private EmployeeDao employeeDAO;
	
	@RequestMapping("/")
	   public String index() {
		 
		   return "index";
	   }

    @RequestMapping(value = "/employee", method=RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee, Model model)
    {
        try
        {
            if(employeeDAO.getEmployeeById(employee.getId()) != null);
            employeeDAO.updateEmployee(employee);
        }
        catch(EmptyResultDataAccessException e)
        {
            System.out.println("inside catch");
            employeeDAO.saveEmployee(employee);
        }
        return ("redirect:/employees");
    }
    
    @RequestMapping(value = "/edit/{id}")
    public String editEmployee(@PathVariable("id") int id,@ModelAttribute("employee") Employee employee, Model model)
    {
       
      
        employeeDAO.getEmployeeById(id);
        List<Employee> employeeList = employeeDAO.getAllEmployees();
        System.out.println("employeeList "+ employeeList);
        model.addAttribute("employee",employee);        
        model.addAttribute("employeeList",employeeList);
        
        return "employees";
    }
    
    @RequestMapping(value = "/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id, @ModelAttribute("employee") Employee employee, Model model)
    {
        employeeDAO.deleteEmployee(id);
        
        return ("redirect:/employees");
    }

    @RequestMapping(value = "/employees")
    public String listEmployees(@ModelAttribute("employee") Employee employee, Model model)
    {
//        Model model = new Model("employees");

        List<Employee> employeeList = employeeDAO.getAllEmployees();
        System.out.println(employeeList);
        model.addAttribute("employeeList", employeeList);
        
        return "employee";
    }
}

