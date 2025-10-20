import java.sql.*;
public class Table 
{
  public static void main(String [] args)
 {
    Connection con = null;
   	 try 
	{
      	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    	  con = DriverManager.getConnection("jdbc:odbc:smita");

// Creating a database table
      Statement sta = con.createStatement();
      int count = sta.executeUpdate(
        "CREATE TABLE Student (ID INT, StudtName VARCHAR(20),"
        + " City VARCHAR(20))");
      System.out.println("Table created.");
      sta.close();

      con.close();
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}