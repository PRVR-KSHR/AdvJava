package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class student {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prvr", "root", "praveer");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM student"); // Ensure the table name is correct

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getDouble(4) + " " + rs.getString(5));
        }

        con.close();
    }
}
