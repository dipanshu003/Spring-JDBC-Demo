package com.spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dao.EmployeeDaoImpl;
import com.pojo.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Program Started..");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		Employee emp = (Employee) context.getBean("emp1");

		EmployeeDaoImpl edao = new EmployeeDaoImpl(template);

		System.out.println("Recorded : " + edao.insert(emp));
//		System.out.println("Recorded : " + edao.update("Piyush Dhole", "Ramakona", 202));
//		System.out.println("Recorded : " + edao.delete(202));
		

	}
}
