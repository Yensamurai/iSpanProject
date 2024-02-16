package com.web.store.login.model;

public class LoginBean {
	String account; 
	String password;
	String invalidCredentials;
	boolean rememberMe;
	
	public LoginBean() {
	}
	
	public LoginBean(String account, String password, boolean rememberMe) {
		this.account = account;
		this.password = password;
		this.rememberMe = rememberMe;
	}
	
	public String getAccount() {
		return account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public String getInvalidCredentials() {
		return invalidCredentials;
	}

	public void setInvalidCredentials(String invalidCredentials) {
		this.invalidCredentials = invalidCredentials;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginBean [account=");
		builder.append(account);
		builder.append(", password=");
		builder.append(password);
		builder.append(", rememberMe=");
		builder.append(rememberMe);
		builder.append("]");
		return builder.toString();
	}
	
	
}
