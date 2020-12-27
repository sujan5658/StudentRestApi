package com.studentrestapi.dao;

import java.util.List;

import com.studentrestapi.models.Student;

public interface StudentDao {
	List<Student> getAllStudents();
}
