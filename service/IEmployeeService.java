package com.cg.empmgt.service;

import com.cg.empmgt.beans.Employee;
import java.util.List;

public interface IEmployeeService {

	Employee addEmployee(String name, String department);

	Employee findById(int id);

	List<Employee> findAll();

}
