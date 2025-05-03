package com.TestNgAnnotations.TestngAnnotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRun {

	@Test
	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("Before suite");

	}
	@Test
	@BeforeTest
	public static void beforeTest() {
		System.out.println("Before Test");

	}
	@Test
	@BeforeMethod
	public static void beforeMeth() {
		System.out.println("Before method");

	}
	@Test
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("Before class");
	}
}
