package advjavaTest1.nit.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class preparedsmnt {
    private static final String DB_URL ="jdbc:mysql://localhost:3306/advjdb";
    private static final String DB_USERNAME = "root";
    private static final String DB_PWD = "root";

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the price: ");
        double price = scn.nextDouble();
        Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PWD);

        StringBuilder s = new StringBuilder("SELECT * FROM BOOKS");

        if (price >= 0) {
            s.append(" WHERE price <= ?");
        }

        PreparedStatement pstmt = con.prepareStatement(s.toString());

        if (price > 0) {
            pstmt.setDouble(1, price);
        }

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getDouble(3));
        }

        con.close();
    }
}
