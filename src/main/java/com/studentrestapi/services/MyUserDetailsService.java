package com.studentrestapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.studentrestapi.models.ApiUser;
import com.studentrestapi.models.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private ApiUser apiUser;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		this.apiUser = this.userServiceImpl.getUserByUserName(username);
		return new MyUserDetails(this.apiUser);
	}

}
