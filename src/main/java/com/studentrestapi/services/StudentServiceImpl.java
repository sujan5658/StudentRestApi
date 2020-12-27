package com.studentrestapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.studentrestapi.dao.StudentDaoImpl;
import com.studentrestapi.models.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDaoImpl studentDaoImpl;
	
	@Transactional
	@Override
	public List<Student> getAllStudents() {
		return this.studentDaoImpl.getAllStudents();
	}

}
