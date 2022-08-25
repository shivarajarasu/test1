package org.practice1;

import org.testng.annotations.Test;

public class cust {
	@Test(groups = "Regression Test")
	public void creatcust()
	{
		System.out.println("cust is created successfully");
	}
	
	@Test(groups = "Smoke Test")
	public void modifycust()
	{
		System.out.println("cust is modified successfully");
	}

	
	@Test(groups = "Regression Test")
	public void deletecust()
	{
		System.out.println("cust is deleted successfully");
	}


}
