package com.tns.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	private String driver;
	private String url;
	private String user;
	private String password;
	
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		//load the driver
		Class.forName(driver);
		
		//get connection
		Connection con=DriverManager.getConnection(url, user, driver);
	
	

	//execute a query
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery("SELECT * FROM cg1.employee12");
		while(r.next())
		{
			int id=r.getInt(1);
			String Name=r.getString(2);
		    double salary=r.getDouble(4);
		    System.out.println("Emp ID:"+id+" Employee name is: "+Name +" salary: "+salary);
		}
   }
}