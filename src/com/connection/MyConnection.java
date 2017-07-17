package com.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MyConnection {
	private static Connection conn;
	public static Connection setConnection()
	{
		int count=0;
		if(count == 0)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/PizzaDB", "root", "root");
				count++;
			} catch (ClassNotFoundException e){
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return conn;
	}
	public static void closeConnection()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
