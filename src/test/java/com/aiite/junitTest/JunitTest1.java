package com.aiite.junitTest;

import org.junit.Ignore;
import org.junit.Test;

public class JunitTest1 {

	
	@Test
	public void Testcase6() {
		System.out.println("Testcase 6");
	}
	@Test
	public void Testcase7() {
		System.out.println("Testcase 7");
	}
	
	@Ignore
	@Test
	public void Testcase8() {
		System.out.println("Testcase 8");
	}
	
	
	@Test
	public void Testcase9() {
		System.out.println("Testcase 9");
	}
	
	
}
