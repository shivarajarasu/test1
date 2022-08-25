package com.wizGradeSchoolapp.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class readDatafromDatabaseExecuteupdate {


	public static void main(String[] args) throws SQLException {
		//create object
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		//step 2:get connect to database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "root");
		//step 3: create sql statement
		Statement statement=con.createStatement();
		String query= "insert into empdetails values(4561,'Shivaraj',805081261,'Gulbarga');";
		//step 4:execute statement/query
		int result=statement.executeUpdate(query);
		if(result==1) {
			System.out.println("user is created");
		}
		else {
			System.out.println("user is not created");
		}
		//step 5: close connection
		con.close();
	}
		

}


