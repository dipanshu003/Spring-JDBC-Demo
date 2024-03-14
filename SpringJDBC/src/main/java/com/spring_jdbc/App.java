package com.spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.entities.Student;
import com.spring_jdbc.dao.StudentDao;
import com.spring_jdbc.dao.StudentDaoImpl;

public class App {
	public static void main(String[] args) {
		System.out.println("Program Started...");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");


//		Create JdbcTemplate object
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		Student stu= (Student) context.getBean("student1");

		
		
		
		StudentDaoImpl si = new StudentDaoImpl(template);
		
//		int result =si.insert(stu);
		
//		int result=si.delete(stu);
		
		int result=si.update(stu);
		
		System.out.println("Record inserted "+ result);
	}
}
