package com.wixgradeschoolApp.admin;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.wizGradeSchoolapp.generic.BaseClass;
import com.wizGradeSchoolapp.generic.ExcelUtility;
import com.wizGradeSchoolapp.generic.FileUtility;
import com.wizGradeSchoolapp.objectRepositeryUtility.Home;
import com.wizGradeSchoolapp.objectRepositeryUtility.vaddstudent;
@Listeners(com.wizGradeSchoolapp.generic.ListnerImplementation.class)
public class Student1 extends BaseClass{
	@Test
	public void deleteExam() {

		Home hp=new Home(driver);
		hp.getExamLnk().click();
		hp.getCreatLnk().click();
		//hp.getImage().click();
		//hp.getSingoutLnk().click();

	}


	@Test
	public void  verifyStudentAddToDatabase() throws Throwable {
		int random = jLib.getRanDomNumber();
		ExcelUtility eLib=new ExcelUtility();
		FileUtility fLib=new FileUtility();


		String stdImgPath= fLib.getPropertyKeyValue("imagepath");
		String grdImgPath= fLib.getPropertyKeyValue("imagepath1");


		String INDEXNUMBER = eLib.getExcelData("Sheet1", 1, 0)+random;
		String FullName = eLib.getExcelData("Sheet1", 1, 1);
		String NameWithintials = eLib.getExcelData("Sheet1", 1, 2);
		String Addres = eLib.getExcelData("Sheet1", 1, 2);
		String Email = random+eLib.getExcelData("Sheet1", 1, 4);
		String Phone = eLib.getExcelData("Sheet1", 1, 5);
		String DateofBirth = eLib.getExcelData("Sheet1", 1, 6);
		String Gender1 = eLib.getExcelData("Sheet1", 1, 13);
		String FullName1 = eLib.getExcelData("Sheet1", 1, 7);
		String NameWithintials1 = eLib.getExcelData("Sheet1", 1, 8);
		String Addres1 = eLib.getExcelData("Sheet1", 1, 9);
		String Email1 = random+eLib.getExcelData("Sheet1", 1, 10);
		String Phone1 = eLib.getExcelData("Sheet1", 1, 11);
		String DateofBirth1 = eLib.getExcelData("Sheet1", 1, 12);
		String Gender2 = eLib.getExcelData("Sheet1", 1, 14);
		String Grade = eLib.getExcelData("Sheet1", 1, 15);


		Home hp=new Home(driver);
		hp.getstudent().click();


		vaddstudent vad= new vaddstudent(driver);
		vad.getAddstudent().click();
		vad.verifyStudentDetails(INDEXNUMBER,FullName,NameWithintials,Addres,Email,Phone,DateofBirth,Gender1,stdImgPath,FullName1,NameWithintials1,Addres1,Email1,Phone1,DateofBirth1,Gender2,grdImgPath,Grade);
		
		//vad.getCheckbox().click();
		//vad.getBtnsubmit1().click();
		vad.getclose().click();
		//Assert.fail();


	}


}
















































