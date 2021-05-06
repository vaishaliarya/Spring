package com.ncu.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;


import com.ncu.employee.models.Employee;

class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
        employee.setId(rs.getInt(1));
        employee.setAge(rs.getInt(2));
        employee.setDept(rs.getString(3));
        employee.setName(rs.getString(4));
        return employee;
	}
	
}

public class EmployeeDaoImpl implements EmployeeDao {
	
	 private JdbcTemplate jdbcTemplate;
	    // JdbcTemplate setter
	    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	    {
	        this.jdbcTemplate = jdbcTemplate;
	    }

	public void saveEmployee(Employee employee) {
		String sql = "insert into employee values(?,?,?,?)";

        jdbcTemplate.update(sql, new Object[]
        { employee.getId(), employee.getAge(), employee.getDept(), employee.getName() });
		
	}

	public Employee getEmployeeById(int id) {
		 String sql = "select * from employee where id=?";
		 Employee employee = (Employee) jdbcTemplate.queryForObject(sql, new Object[]
			        { id }, new EmployeeRowMapper());

//						public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//							Employee employee = new Employee();
//			                employee.setId(rs.getInt(1));
//			                employee.setAge(rs.getInt(2));
//			                employee.setDept(rs.getString(3));
//			                employee.setName(rs.getString(4));
//			                return employee;
//						}
//			 
//			 
//			        });
		return employee;
			        
			           
		
		 
		
	}

	public void updateEmployee(Employee employee) {
		String sql = "update employee set age =?, dept=?,name=? where id=?";
        jdbcTemplate.update(sql, new Object[]
        { employee.getAge(), employee.getDept(), employee.getName(), employee.getId() });
		
	}

	public void deleteEmployee(int id) {
		String sql = "delete from employee where id=?";
        jdbcTemplate.update(sql, new Object[]
        { id });
	}

	public List<Employee> getAllEmployees() {
		String sql = "select * from Employee";

        List<Employee> employeeList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Employee>>(){

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				 List<Employee> list = new ArrayList<Employee>();
	                while (rs.next())
	                {
	                    Employee employee = new Employee();
	                    employee.setId(rs.getInt(1));
		                employee.setAge(rs.getInt(2));
		                employee.setDept(rs.getString(3));
		                employee.setName(rs.getString(4));
	                    list.add(employee);
	                }
	                return list;
			}
        });
			
        
        return employeeList;
		
	}
	}





