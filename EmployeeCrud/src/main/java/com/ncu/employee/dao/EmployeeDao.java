package com.ncu.employee.dao;

import java.util.List;

import com.ncu.employee.models.Employee;

public interface EmployeeDao {

	 public void saveEmployee(Employee employee);
	    public Employee getEmployeeById(int id);
	    public void updateEmployee(Employee employee);
	    public void deleteEmployee(int id);
	    public List<Employee> getAllEmployees();
}
