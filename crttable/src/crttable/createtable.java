package crttable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "praveer");

            Statement st = con.createStatement();

            String query = "CREATE TABLE students (id INT, name VARCHAR(45), marks DOUBLE, age INT, gender VARCHAR(45))";

            st.executeUpdate(query);

            System.out.println("Table created");

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
        } catch (SQLException e) {
            System.out.println("Error executing the query!");
        }
    }
}