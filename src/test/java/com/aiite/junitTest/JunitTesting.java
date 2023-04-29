package com.aiite.junitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTesting {

	@BeforeClass
	public static void beforeclass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("After Class");
	}

	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	@Test
	public void Testcase4() {
		System.out.println("Testcase 4");
	}
	
	@Test
	public void Testcase1() {
		System.out.println("Testcase 1");
	}
	
	@Test
	public void Testcase2() {
		System.out.println("Testcase 2");
		Assert.assertEquals("dinesh", "dinesh");
		System.out.println("Assertion Test");
	}
	
	@Ignore
	@Test
	public void Testcase3() {
		System.out.println("Testcase 3");
	}
	
	
	
	@Test
	public void Testcase5() {
		System.out.println("Testcase 5");
	}
	
	
	
	
}
