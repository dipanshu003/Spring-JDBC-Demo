package com.spring_jdbc.dao;

import com.entities.Student;

public interface StudentDao {
	public int insert(Student student);

	public int update(Student student);

	public int delete(Student student);

}
