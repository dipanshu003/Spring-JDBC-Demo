package com.spring_jdbc.dao;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entities.Student;

public class StudentDaoImpl implements StudentDao {

	JdbcTemplate template;
	Scanner x = new Scanner(System.in);

	public StudentDaoImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int insert(Student student) {

//		insert query
		String insertQuery = "insert into student(id,name,city) values(?,?,?)";

		int result = template.update(insertQuery, student.getId(),student.getName(), student.getCity());
		return result;
	}

	@Override
	public int update(Student student) {
		
		System.out.print("Enter your updated name : ");
		String name = x.next();


//		update query
		String updateQuery = "update student set name = ? where id = ?";

		int result = template.update(updateQuery,name, student.getId());

		return result;

	}

	@Override
	public int delete(Student student) {

//		delete query
		String deleteQuery = "delete from student where id = ?";
		int result=template.update(deleteQuery,student.getId());
		return result;
	}

}
