package advjavaTest1.nit.in;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class newdriver {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";

	private static final String DB_UNAME = "root";

	private static final String DB_PWD = "root";

	private static final String SELECT_SQL = "SELECT ID ,NAME,LOCATION  FROM USER";

	public static void main(String[] args) throws Exception {

	//	Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);

		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

		ResultSet rs = stmt.executeQuery(SELECT_SQL);
        ResultSetMetaData MetaData=rs.getMetaData();
        System.out.println(MetaData.getColumnCount());
        for(int i=1;i<MetaData.getColumnCount();i++) {
        	String columnName=MetaData.getColumnName(i);
        	 System.out.println(columnName);	
        }
		System.out.println("Query Execution Completed... Data available in ResultSet...");
		while (rs.next()) {
			System.in.read();
			System.in.read();
			rs.refreshRow();
			System.out.println(rs.getInt(1) + "---" + rs.getString(2) + "--" + rs.getString(3));
		}
		con.close();
	}
}