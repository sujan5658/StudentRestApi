package com.studentrestapi.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentrestapi.models.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		Session session = this.entityManager.unwrap(Session.class);
		students = session.createQuery("FROM Student").list();
		return students;
	}

}
