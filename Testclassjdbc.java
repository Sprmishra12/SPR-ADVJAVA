package advjavaTest1.nit.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testclassjdbc {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
    private static final String DB_USERNAME = "root";
    private static final String DB_PWD = "root";
    private static final String SELECT_SQL = "SELECT ID, NAME, LOCATION FROM USER";

    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PWD);
        Statement smnt = con.createStatement();
        ResultSet rs = smnt.executeQuery(SELECT_SQL);

        System.out.println("Query has been executed. The result is:");

        while (rs.next()) {
            System.in.read();
            System.in.read();
            // rs.refreshRow(); // Remove this line
            System.out.println(rs.getInt(1) + "---" + rs.getString(2) + "--" + rs.getDouble(3));
        }

        con.close();
    }
}
