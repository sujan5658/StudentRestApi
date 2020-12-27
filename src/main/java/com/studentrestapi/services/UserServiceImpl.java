package com.studentrestapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.studentrestapi.dao.UserDaoImpl;
import com.studentrestapi.models.ApiUser;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoImpl userDaoImpl;
	
	@Transactional
	@Override
	public ApiUser getUserByUserName(String userName) {
		System.out.println("USerNAme : "+userName);
		return this.userDaoImpl.getUserByUserName(userName);
	}

}
