package com.likhitha.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection 
{
private static Connection conn;
public PreparedStatement ps,ps1,ps2;
public ResultSet rs,rs1;

public static Connection getMySqlConnection()
{
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginData", "root",
			"12345");
	return conn;
	}
	catch(ClassNotFoundException e)
	{
		
	}
	catch(SQLException e) 
	{
		
	}
	return null;
	
}

}
