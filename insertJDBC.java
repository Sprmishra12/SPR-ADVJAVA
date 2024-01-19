package advjavaTest1.nit.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertJDBC {
	 private static final String DB_URL ="jdbc:mysql://localhost:3306/advjdb";
	    private static final String DB_USERNAME = "root";
	    private static final String DB_PWD = "root";
	    private static String INSERT_SQL="INSERT INTO BOOKS VALUES(?,?,?)";
        public static void main(String[]args) throws SQLException {
        	Scanner scn=new Scanner(System.in);
        	System.out.println("enter ID");
        	int id=scn.nextInt();
        	System.out.println("enter NAME");
        	String name=scn.next();
        	System.out.println("enter PRICE");
        	int price=scn.nextInt();
        	Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PWD);
        	System.out.println(con);
        	
        	  PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
        	  pstmt.setInt(1, id);
        	  pstmt.setString(2, name);
        	  pstmt.setInt(3, price);
        	  int exe=pstmt.executeUpdate();
        	  System.out.println("rows affected :");
        	  
        	con.close();
        }
}

