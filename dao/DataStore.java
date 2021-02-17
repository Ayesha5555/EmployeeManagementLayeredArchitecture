package com.cg.empmgt.dao;

import java.util.*;
import com.cg.empmgt.beans.Employee;

public class DataStore {

	private DataStore() {
	}

	public static Map<Integer, Employee> store = new HashMap<>();

}
