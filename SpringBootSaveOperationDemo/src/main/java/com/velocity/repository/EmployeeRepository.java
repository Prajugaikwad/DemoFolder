package com.velocity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.velocity.model.Employee;

	@Repository
	public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
