package bca.drive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import bca.jdbc.Student;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/crud";
		String username = "root";
		String pwd = "praveer";
		
	    Connection con = DriverManager.getConnection(url, username, pwd);
	    Scanner sc = new Scanner(System.in);
	    
	    Student stud = new Student();
	    
	    int choice;
	    
	    do { 
	    	System.out.println("1. Insert Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Remove Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
//            stud.insertStudent(con, sc);
//    		stud.displayStudents(con);
//    		stud.updateStudent(con, sc);
//    		stud.removeStudent(con, sc);
    		
            switch (choice) {
            case 1:
            stud.insertStudent(con, sc);
            break;
            case 2:
            stud.displayStudents(con);
            break;
            case 3:
            stud.updateStudent(con, sc);
            break;
            case 4:
            stud.removeStudent(con, sc);
            case 5:
            System.out.println("Exit");
//            case 0:
//            System.out.println("BYY");
//            System.exit(0);
            break;
            default:
            System.out.println("Invalid choice.");
        }
	 }
	    while (choice != 0);

            sc.close();
            con.close();
	    }
}