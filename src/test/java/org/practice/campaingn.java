package org.practice;

import org.testng.annotations.Test;

public class campaingn {
	@Test(groups = "Smoke Test")
	public void createCampaingn()
	{
		System.out.println("campaingn is created successfully");
	}
	
	@Test(groups = "Regression Test")
	public void modifyCampaingn()
	{
		System.out.println("campaingn is modified successfully");
	}

	
	@Test(groups ="Smoke Test")
	public void deleteCampaingn()
	{
		System.out.println("customer is deleted successfully");
	}



}
