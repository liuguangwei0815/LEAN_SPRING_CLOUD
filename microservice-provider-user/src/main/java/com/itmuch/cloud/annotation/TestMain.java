package com.itmuch.cloud.annotation;

import java.lang.reflect.Method;

import com.itmuch.cloud.annotation.PasswrodUtil;
import com.itmuch.cloud.annotation.TestYuanTest;

public class TestMain {
	
	
	public static void main(String[] args) {
		trackLogRecord(PasswrodUtil.class);
	}
	
	public static  void trackLogRecord(Class<?> cl) {
		
		for (Method method : cl.getDeclaredMethods()) {
			TestYuanTest testYuanTest = method.getAnnotation(TestYuanTest.class);
			if(testYuanTest!=null) {
				System.out.println(testYuanTest.id()+" -- "+testYuanTest.description());
			}
		}
		

	}

}
