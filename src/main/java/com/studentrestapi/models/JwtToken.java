package com.studentrestapi.models;

import org.springframework.stereotype.Component;

@Component
public class JwtToken {
	private boolean status;
	private String token;
	private String message;
	private String tokenLife;
	public JwtToken() {
		this.status = false;
		this.token = "Bearer ";
		this.message = "";
		this.tokenLife = "";
	}
	public JwtToken(boolean status, String token, String message,String tokenLife) {
		this.status = status;
		this.token = token;
		this.message = message;
		this.tokenLife = tokenLife;
	}
	public JwtToken(JwtToken jwtToken) {
		this.status = jwtToken.status;
		this.token = jwtToken.token;
		this.message = jwtToken.message;
		this.tokenLife = jwtToken.tokenLife;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getTokenLife() {
		return tokenLife;
	}
	public void setTokenLife(String tokenLife) {
		this.tokenLife = tokenLife;
	}
	@Override
	public String toString() {
		return "JwtToken [status=" + status + ", token=" + token + ", message=" + message + ", tokenLife=" + tokenLife
				+ "]";
	}
}
