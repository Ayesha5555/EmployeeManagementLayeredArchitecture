package com.cg.empmgt.ui;

import com.cg.empmgt.beans.Employee;
import com.cg.empmgt.validation.*;
import com.cg.empmgt.service.*;

import java.util.Collection;
import java.util.List;

public class DisplayResults {
	private IEmployeeService service = new IEmployeeServiceImpl();

	public static void main(String[] args) {
		DisplayResults app = new DisplayResults();
		app.start();
	}

	public void start() {
		try {
			Employee ayesha = service.addEmployee("Ayesha", "CSE");			

			Employee miloni = service.addEmployee("Miloni", "Mechanical");	

			Employee rachna = service.addEmployee("Rachna", "EXTC");
			display(ayesha);
			display(miloni);
			display(rachna);

			List<Employee> list = service.findAll();
			displayAll(list);
		} catch (InvalidIdException e) {
			System.out.println(e.getMessage());

		} catch (InvalidDeptException e) {
			System.out.println(e.getMessage());

		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println("something went wrong");

		}

	}

	public void displayAll(Collection<Employee> employees) {
		for (Employee employee : employees) {
			display(employee);
		}
	}

	public void display(Employee employee) {
		System.out.println(employee.getId() + "-" + employee.getName() + "-" + "-" + employee.getDepartment());
	

}}
