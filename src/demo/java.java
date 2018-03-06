package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;


import com.mysql.jdbc.Driver;

public class java 
{
  @Test
  public void sendAmount() throws SQLException
  {
	  Driver driverref=new Driver();
	  DriverManager.registerDriver(driverref);
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "swathi123");
      String query = "select * from emp";
      Statement stmnt = con.createStatement();
      ResultSet set = stmnt.executeQuery(query);
      while(set.next())
      {
    	  System.out.println(set.getInt(1)+"\t"+set.getString(2)+"\t");
      }
      con.close();
      
  }
}
