package org.practice1;

import org.testng.annotations.Test;

public class camp {
	@Test(groups = "Smoke Test")
	public void createcamp()
	{
		System.out.println("camp is created successfully");
	}
	
	@Test(groups = "Regression Test")
	public void modifycamp()
	{
		System.out.println("camp is modified successfully");
	}

	
	@Test(groups = "Smoke Test")
	public void deletecamp()
	{
		System.out.println("camp is deleted successfully");
	}



}
