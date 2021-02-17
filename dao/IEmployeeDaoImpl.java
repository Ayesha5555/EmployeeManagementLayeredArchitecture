package com.cg.empmgt.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.cg.empmgt.dao.IEmployeeDao;
//import com.cg.emplmgt.dao.StoreHolder;
import com.cg.empmgt.beans.Employee;

public class IEmployeeDaoImpl implements IEmployeeDao {

	private int generatedId = 0;

	public int generateId() {
		generatedId++;
		return generatedId;
	}

	@Override
	public void add(Employee employee) {
		Map<Integer, Employee> store = DataStore.store;
		int id = generateId();
		employee.setId(id);
		store.put(id, employee);
	}

	@Override
	public Employee findById(int id) {
		Map<Integer, Employee> store = DataStore.store;
		Employee employee = store.get(id);
		return employee;
	}

	public void removeById(int id) {
		Map<Integer, Employee> store = DataStore.store;
		store.remove(id);
	}

	@Override
	public List<Employee> findAll() {
		Map<Integer, Employee> store = DataStore.store;
		Collection<Employee> employees = store.values();
		List<Employee> list = new ArrayList<>(employees);
		return list;
	}

}
