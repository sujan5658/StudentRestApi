package com.studentrestapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="tbl_api_users")
public class ApiUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_pass")
	private String userPass;
	@Column(name="status")
	private boolean status;
	
	public ApiUser() {
		this.userId = 0;
		this.userName = "";
		this.userPass = "";
		this.status = true;
	}
	
	public ApiUser(int userId, String userName, String userPass, boolean status) {
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.status = status;
	}
	
	public ApiUser(ApiUser usr) {
		this.userId = usr.userId;
		this.userName = usr.userName;
		this.userPass = usr.userPass;
		this.status = usr.status;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "ApiUser [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + ", status=" + status
				+ "]";
	}
}
