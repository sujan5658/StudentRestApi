package com.studentrestapi.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentrestapi.models.ApiUser;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private EntityManager entityManager;
	@Autowired
	private ApiUser apiUser;
	
	@Override
	public ApiUser getUserByUserName(String userName) {
		Session currentSession = this.entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("FROM ApiUser au WHERE au.userName=:username");
		query.setParameter("username", userName);
		this.apiUser = (ApiUser)query.uniqueResult();
		return this.apiUser;
	}

}
