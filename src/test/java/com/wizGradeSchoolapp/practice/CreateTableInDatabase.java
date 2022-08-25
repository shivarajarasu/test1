package com.wizGradeSchoolapp.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CreateTableInDatabase {

	public static void main(String[] args) throws SQLException {
		
	// Step 1: Create the object for DB driver class
	Driver refDriver= new Driver();
	
	//Step 2: Register the driver to the JDBC
	DriverManager.registerDriver(refDriver);
	Connection connection = null;
	
	try {
	// Step 3: Establish the connection
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "root");
		
	// Step 4: Create the statement
		Statement statement = connection.createStatement();
		
	// Step 5: Execute the query
		statement.executeUpdate("create table EmpDetails(empID int(4) not null unique,empName varchar(30),phone_number int(10) not null unique, Address  varchar(50));");
		System.out.println("Data updated successfully");
	}
	finally {
		//close the connection
		connection.close();
		System.out.println("connection closed");
	}
	}
}
