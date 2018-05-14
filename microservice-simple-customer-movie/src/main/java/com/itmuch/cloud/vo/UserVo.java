package com.itmuch.cloud.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8726022423710642552L;
	private Long id;
	private String userName;
	private String name;
	private BigDecimal balance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}
