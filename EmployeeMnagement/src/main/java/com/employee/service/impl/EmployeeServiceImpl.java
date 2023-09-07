package com.employee.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.exceptions.ResourceNotFoundException;
import com.employee.model.Employee;
import com.employee.reposiotry.EmployeRepo;
import com.employee.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeRepo employeRepo;

	@Override
	public List<Employee> getAllEmployees() {
		return employeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeRepo.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		Optional<Employee> findById = employeRepo.findById(id);
		if (findById.isEmpty()) {
			throw new ResourceNotFoundException("Employee not found with id: " + id);
		}
		employeRepo.deleteById(id);
	}

}
