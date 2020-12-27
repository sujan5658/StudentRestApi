package com.studentrestapi.services;

import com.studentrestapi.models.ApiUser;

public interface UserService {
	ApiUser getUserByUserName(String userName);
}
