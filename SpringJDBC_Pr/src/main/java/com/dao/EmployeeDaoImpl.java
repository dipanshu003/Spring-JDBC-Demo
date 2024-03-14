package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	JdbcTemplate template;

	public EmployeeDaoImpl(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int insert(Employee emp) {
		String q = "insert into employee(id,name,city) values (?,?,?)";
		int result = template.update(q, emp.getId(), emp.getName(), emp.getCity());
		return result;
	}

	@Override
	public int update(String name, String city, int id) {

		String q = "update employee set name = ? , city = ? where id  = ? ";
		int result = template.update(q, name, city, id);
		return result;
	}

	@Override
	public int delete(int id) {

		String q = "delete from employee where id = ?";
		int result = template.update(q, id);
		return result;
	}

}
