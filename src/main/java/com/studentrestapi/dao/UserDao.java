package com.studentrestapi.dao;

import com.studentrestapi.models.ApiUser;

public interface UserDao {
	ApiUser getUserByUserName(String userName);
}
