package com.zensar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ArithmeticTest {

	Arithmetic arithmetic=null;
	@Before
	public void before() {
		this.arithmetic= new Arithmetic();
	}
	@BeforeClass
	public static void beforeclass(){
		System.out.println("Inside before class()");
	}
	@After
	public void after() {
		this.arithmetic=null;
	}
	@AfterClass
	public static void afterclass(){
		System.out.println("Inside after class()");
	}
	@Test
	public void testAdd() {
		
		assertEquals(arithmetic.add(10, 5),15);
	}
	@Test
	@Ignore("Not ready to run")
	public void testAdd1() {
		
		assertEquals(arithmetic.add(20, 5),25);
	}
	
	@Test(timeout = 1000)
	public void testDivide(){
		
		assertEquals(arithmetic.divide(8, 4),2);
	}
	@Test(expected = ArithmeticException.class)
	public void testDivideException() {
		assertEquals(arithmetic.divide(50, 0),5);
	}
}
