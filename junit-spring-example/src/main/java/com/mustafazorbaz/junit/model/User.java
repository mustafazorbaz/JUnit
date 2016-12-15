package com.mustafazorbaz.junit.model;

import java.util.Date;

public class User {

	private int userId;
	private String userStatus;
	private String securtyCode;
	private String about;
	private Date createDate;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getSecurtyCode() {
		return securtyCode;
	}
	public void setSecurtyCode(String securtyCode) {
		this.securtyCode = securtyCode;
	}
	public String getSecurityCode() {
		return securtyCode;
	}
	public void setSecurityCode(String securtyCode) {
		this.securtyCode = securtyCode;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	

	
	
	
}
