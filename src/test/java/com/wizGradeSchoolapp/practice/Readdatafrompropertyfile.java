package com.wizGradeSchoolapp.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readdatafrompropertyfile {

	public static void main(String[] args) throws IOException {
	//step 1: use file Input stream to load the property file
		FileInputStream fis =new FileInputStream(".\\Data\\commondata.properties");
		// step 2: creat object of properties and load the file
		Properties prop = new Properties();
		 prop.load(fis);
		 //step 3: provide the key to read the value
	String	URL= prop.getProperty("url");
	System.out.println(URL);
		String username=prop.getProperty("username");
		System.out.println(username);
		

	}

}
