package com.kh.mvc.model.dto;

import java.sql.Date;

public class UserDTO {
	
	private int userNo;
	private String userId;
	private String userPw;
	private String userName;
	private Date enrollDate;
	
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getEnrollDtate() {
		return enrollDtate;
	}
	public void setEnrollDtate(Date enrollDtate) {
		this.enrollDtate = enrollDtate;
	}

	
	
}
