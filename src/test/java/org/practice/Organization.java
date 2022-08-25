package org.practice;

import org.testng.annotations.Test;

public class Organization {
	@Test(groups = "Regression Test")
	public void createOrganization()
	{
		System.out.println("Organization is created successfully");
	}
	
	@Test(groups = "Regression Test")
	public void modifyOrganization()
	{
		System.out.println("Organization is modified successfully");
	}

	
	@Test(groups = "Smoke Test")
	public void deleteOrganization()
	{
		System.out.println("Organization is deleted successfully");
	}

}
