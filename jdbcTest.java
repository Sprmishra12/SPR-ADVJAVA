package advjavaTest1.nit.in;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;



@SuppressWarnings("unused")
public class jdbcTest {
	
	
	    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
	    private static final String DB_USERNAME = "root";
	    private static final String DB_PWD = "root";
	    private static String SELECT_SQL = " SELECT BOOK_ID, BOOK_NAME, BOOK_PRICE FROM BOOKS";
	    public static void main(String[] args) throws Exception {
	       Class.forName("com.mysql.cj.jdbc.Driver");
	    	// for loading the driver
	        // for creating the connection
	        Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PWD);
	        // create statement
	        Statement smnt2 = con.createStatement();
	        Statement smnt=con.createStatement(ResultSet. TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	        
            ResultSet rs=smnt.executeQuery(SELECT_SQL);
	        System.out.println("query is updated now displying the results ");
	        int rowsAffected1 = smnt.executeUpdate(SELECT_SQL);
	       // System.out.println("Rows affected: " + rowsAffected1);
	        while( rs.next()) {
	        	System.in.read();
	        	System.in.read();
	        	System.in.read();
	        	rs.refreshRow();
	        	System.out.println(rs.getInt(1) + "---" + rs.getString(2) + "--" + rs.getDouble(3));
	        	System.out.println("rowsAffected1:"+rowsAffected1);
	        	
	        	
	        // Step-6 : Close Connection
	        con.close();
	    }
	}


}
