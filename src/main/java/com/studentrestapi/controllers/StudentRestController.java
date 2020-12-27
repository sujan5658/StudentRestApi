package com.studentrestapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studentrestapi.models.ApiUser;
import com.studentrestapi.models.JwtToken;
import com.studentrestapi.models.Student;
import com.studentrestapi.services.JwtUtility;
import com.studentrestapi.services.StudentServiceImpl;

@RestController
@RequestMapping(value="/studentapi")
public class StudentRestController {
	@Autowired
	private AuthenticationProvider authProvider;
	@Autowired
	private JwtToken jwtToken;
	@Autowired
	private JwtUtility jwtUtility;
	@Autowired
	private StudentServiceImpl studentService;
	
	@RequestMapping(value="/authenticate",method=RequestMethod.POST,headers="Accept=application/json")
	public JwtToken authenticateUser(@RequestBody ApiUser apiUser) {
		try {
			this.authProvider.authenticate(new UsernamePasswordAuthenticationToken(apiUser.getUserName(), apiUser.getUserPass()));
			this.jwtToken.setStatus(true);
			this.jwtToken.setToken("Bearer "+this.jwtUtility.generateToken(apiUser.getUserName()));
			this.jwtToken.setMessage("Token Genereted");
			this.jwtToken.setTokenLife("5 hour");
		}catch(Exception er) {
			this.jwtToken.setStatus(false);
			this.jwtToken.setToken("");
			this.jwtToken.setMessage(er.getMessage());
			this.jwtToken.setTokenLife("No Life");
		}
		return this.jwtToken;
	}
	
	@RequestMapping(value="/getStudents",method=RequestMethod.GET,headers="Accept=application/json")
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		try {
			System.out.println("Reached finction");
			students = this.studentService.getAllStudents();
			System.out.println(students);
		}catch(Exception er) {
			students = null;
		}
		return students;
	}
}
