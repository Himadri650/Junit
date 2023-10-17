package com.app.junitDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterEachAnnoatation {
	JavaOperation obj;
	@BeforeEach
	public void init() {
		System.out.println("Start Db connection");
		obj = new JavaOperation();
		
	}
	
	@AfterEach
	public void teardown()

	{
		System.out.println("close DB coonection");
	}
	@Test
	public void test1()
	{
		
		System.out.println("Execute the test cause using method of ... javaOperation");
		System.out.println("close DB connection");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Execute the test cause using method of ... javaOperation");
		System.out.println("close DB connection");
	}
	

}
