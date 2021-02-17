package com.cg.empmgt.service;

import java.util.List;

import com.cg.empmgt.dao.*;
import com.cg.empmgt.beans.Employee;
import com.cg.empmgt.validation.*;

public class IEmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDao dao = new IEmployeeDaoImpl();

	@Override
	public Employee addEmployee(String name, String department) {
		// validateId(id);
		validateName(name);
		validateDept(department);
		Employee employee = new Employee(name, department);
		dao.add(employee);
		return employee;
	}

	@Override
	public Employee findById(int id) {
		validateId(id);
		Employee employee = dao.findById(id);
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = dao.findAll();
		return employees;
	}

	void validateDept(String department) {
		if (department == null || department.isEmpty() || department.trim().isEmpty()) {
			throw new InvalidDeptException("Department name can't be null or empty");
		}
	}

	void validateId(int id) {
		if (id < 0) {
			throw new InvalidIdException("Id can't be negative");
		}
	}

	void validateName(String name) {
		if (name == null || name.isEmpty() || name.trim().isEmpty() || (name.length() > 10)) {
			throw new InvalidDeptException("Name can't be null or empty or can have more than 10 alphabets");
		}
	}

}
