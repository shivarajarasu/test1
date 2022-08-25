package com.grade.practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.wizGradeSchoolapp.generic.ListnerImplementation.class)
public class SampleTest  {
	@Test
	public void aaa() {
		System.out.println("=====Test START=====");
		Assert.assertEquals(false, true);
		System.out.println("=====Test END");
	}
	
	
	

}
