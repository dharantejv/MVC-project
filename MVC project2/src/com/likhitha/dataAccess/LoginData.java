package com.likhitha.dataAccess;
import java.sql.SQLException;

import com.likhitha.been.Loginbeen;
import com.likhitha.connection.GetConnection;

public class LoginData
{
	public boolean authenticateUser(String username,String password)
	{
		String sql="select * from user where username=?and password=?";
		GetConnection gc=new GetConnection();
		
		try
		{
			gc.ps= GetConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setString(1, username);
			gc.ps.setString(2, password);
			
			gc.rs=gc.ps.executeQuery();
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	
}
