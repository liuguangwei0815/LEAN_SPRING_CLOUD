package com.itmuch.cloud.annotation;

import com.itmuch.cloud.annotation.TestYuanTest;

public class PasswrodUtil {

	@TestYuanTest(id="3",description="at last contain a number")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}

	@TestYuanTest(id="4")
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}

}
