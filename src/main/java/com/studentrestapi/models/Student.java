package com.studentrestapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="tbl_students")
public class Student {
	
	@Id
	@Column(name="roll_no")
	private int rollNo;
	@Column(name="full_name")
	private String fullName;
	@Column(name="contact_address")
	private String contactAddress;
	@Column(name="contact_no")
	private String contactNo;
	@Column(name="batch")
	private int batch;
	@Column(name="level")
	private String level;
	@Column(name="program")
	private String program;
	@Column(name="reg_no")
	private String regNo;
	@Column(name="status")
	private boolean status;
	
	public Student() {
		this.rollNo = 0;
		this.fullName = "";
		this.contactAddress = "";
		this.contactNo = "";
		this.batch = 0;
		this.level = "";
		this.program = "";
		this.regNo = "";
		this.status = true;
	}
	
	public Student(int rollNo, String fullName, String contactAddress, String contactNo, int batch, String level,
			String program, String regNo, boolean status) {
		this.rollNo = rollNo;
		this.fullName = fullName;
		this.contactAddress = contactAddress;
		this.contactNo = contactNo;
		this.batch = batch;
		this.level = level;
		this.program = program;
		this.regNo = regNo;
		this.status = status;
	}
	
	public Student(Student student) {
		this.rollNo = student.rollNo;
		this.fullName = student.fullName;
		this.contactAddress = student.contactAddress;
		this.contactNo = student.contactNo;
		this.batch = student.batch;
		this.level = student.level;
		this.program = student.program;
		this.regNo = student.regNo;
		this.status = student.status;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public int getBatch() {
		return batch;
	}

	public void setBatch(int batch) {
		this.batch = batch;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fullName=" + fullName + ", contactAddress=" + contactAddress
				+ ", contactNo=" + contactNo + ", batch=" + batch + ", level=" + level + ", program=" + program
				+ ", regNo=" + regNo + ", status=" + status + "]";
	}
	
}
