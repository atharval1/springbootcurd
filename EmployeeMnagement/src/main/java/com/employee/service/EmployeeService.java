package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployeeById(Long id);

	Employee saveEmployee(Employee employee);

	void deleteEmployee(Long id);

}
