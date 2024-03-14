package com.dao;

import com.pojo.Employee;

public interface EmployeeDao {

	int insert(Employee emp);

	int update(String name, String city, int id);

	int delete(int id);

}
