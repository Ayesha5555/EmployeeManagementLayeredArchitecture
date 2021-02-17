package com.cg.empmgt.dao;

import com.cg.empmgt.beans.Employee;
import java.util.List;

public interface IEmployeeDao {
	void add(Employee employee);

	Employee findById(int id);

	void removeById(int id);

	List<Employee> findAll();

}
