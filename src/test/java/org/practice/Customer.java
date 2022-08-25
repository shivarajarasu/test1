package org.practice;

import org.testng.annotations.Test;

public class Customer {
	@Test(groups = "Regression Test")
	public void createCustomer()
	{
		System.out.println("customer is created successfully");
	}
	
	@Test(groups = "Smoke Test")
	public void modifyCustomer()
	{
		System.out.println("customer is modified successfully");
	}

	
	@Test(groups = "Regression Test")
	public void deleteCustomer()
	{
		System.out.println("customer is deleted successfully");
	}


}
