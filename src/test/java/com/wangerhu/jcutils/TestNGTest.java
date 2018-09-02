package com.wangerhu.jcutils;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGTest {
	
	@InjectMocks
	TestNG testNG;
	
	@BeforeClass
	public void initMock() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testTestNG() {
		Assert.assertEquals("abc", "abc");
		testNG.testTestNG();
	}
}
