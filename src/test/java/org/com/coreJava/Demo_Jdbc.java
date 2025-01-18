package org.com.coreJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_Jdbc 
{
	
	static Connection connection;
	static Statement statement;
	static ResultSet result;
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{ 
	  String db_url = "jdbc:mysql://localhost:3306/MyRecord";
	  String username = "root";
	  String password = "Lincoln@1234";
	  
      connection = DriverManager.getConnection(db_url,username,password); 
      statement  = connection.createStatement();                     
      result     = statement.executeQuery("Select * from Customers");    
      
     while (result.next()) 
     { 
    	 int Customer_id   = result.getInt("CustomerID"); 
    	 String First_Name = result.getString("FirstName");
    	 String Last_Name  = result.getString("LastName");
    	 System.out.println("Customer_id: " + Customer_id + ", First_Name: " + First_Name + ", Last_Name: " + Last_Name); 
    	 
     }

     result.close(); 
     statement.close();
		
		
	}

}
