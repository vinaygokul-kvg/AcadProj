package com.cbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

import com.mysql.jdbc.Driver;

public class ConnectionFactory {
	
	static Connection con;
	
	public static Connection openConn()
	{
		ResourceBundle rb= ResourceBundle.getBundle("mysql");
	    
	     String url=rb.getString("db.url");
	     String user=rb.getString("db.username");
	     String pass=rb.getString("db.password");
		try {
			DriverManager.registerDriver(new Driver());
			con=DriverManager.getConnection(url,user,pass);
		} catch (Exception e) {
			System.out.println("Error in open Connection :"+e);
		}
		return con;
	}
	public static void closeConn()
	{
		try {
			con.close();
		} catch (Exception e) {
			System.out.println("Error in close Connection :"+e);
		}
	}

}

