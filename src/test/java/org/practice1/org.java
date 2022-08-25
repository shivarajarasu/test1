package org.practice1;

import org.testng.annotations.Test;

public class org {
	@Test(groups = "Regression Test")
	public void creatorg()
	{
		System.out.println("org is created successfully");
	}
	
	@Test(groups = "Smoke Test")
	public void modifyorg()
	{
		System.out.println("org is modified successfully");
	}

	
	@Test(groups = "Regression Test")
	public void deleteorg()
	{
		System.out.println("org is deleted successfully");
	}
}
