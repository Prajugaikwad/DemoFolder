package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Employee;
import com.velocity.repository.EmployeeRepository;
import com.velocity.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	//inject repository
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee)
	{
		Employee emp = employeeRepository.save(employee);
		return emp;
	}

}
