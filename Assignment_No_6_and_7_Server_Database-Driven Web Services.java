package com.mit.services;
import java.sql.*;
import java.util.*;
public class StudentDatabasePHP 
{	

	public static String displaystudent(int sid) 
	{
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //Scanner scanner = new Scanner(System.in);
        String name="Record not found";
        try {
            // Load Oracle JDBC Driver
        	System.out.println("Student ID before: " + sid);
            Class.forName("oracle.jdbc.driver.OracleDriver");
        	System.out.println("Student ID after: " + sid);
            // Connect to Oracle 10g
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Replace with correct SID if needed
            String user = "system"; // Your Oracle username
            String password = "system"; // Your Oracle password

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // Accept Student ID from user
            // System.out.print("Enter Student ID: ");
            // int student_id = scanner.nextInt();

            // SQL query using PreparedStatement to prevent SQL injection
            String sql = "SELECT sname FROM student WHERE sid = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, sid);
            rs = pstmt.executeQuery();
            // Display result
            if (rs.next()) {
                name = rs.getString("sname");
                System.out.println("Student Name : " + name);
                return(name);
            } else {
                return("Student ID not found.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        } finally {
            // Clean up resources
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }
        return(name);	
	}
	


	public static String displaystudentrowstring(int sid) 
	{
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String result="";
        try {
            // Load Oracle JDBC Driver
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	// Connect to Oracle 10g
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Replace with correct SID if needed
            String user = "system"; // Your Oracle username
            String password = "system"; // Your Oracle password

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // SQL query using PreparedStatement to prevent SQL injection
            String sql = "SELECT * FROM student WHERE sid = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, sid);
            rs = pstmt.executeQuery();
            // Display result
            if (rs.next()) {
            	result = "SNo : " + rs.getInt("sid") +
                        ", SName : " + rs.getString("sname");
               System.out.println("Student Row : " + result);
                return(result);
            } else {
                return("Student ID not found.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        } finally {
            // Clean up resources
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }
        return(result);	
	}
	
/*
 open server-config.wsdd file 
 <ns1:service name="StudentDatabasePHP" provider="java:RPC" style="wrapped" use="literal">
 
 add following tag at last statement before </ns1:service>

	 <beanMapping qname="myNS:Student" 
             xmlns:myNS="urn:Student"
             languageSpecificType="java:com.mit.services.Student"/>
	 
*/	 
	public Student displaystudentrowobject(int sid) 
	{
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Student s=new Student();
        try {
            // Load Oracle JDBC Driver
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	// Connect to Oracle 10g
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Replace with correct SID if needed
            String user = "system"; // Your Oracle username
            String password = "system"; // Your Oracle password

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // SQL query using PreparedStatement to prevent SQL injection
            String sql = "SELECT * FROM student WHERE sid = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, sid);
            rs = pstmt.executeQuery();
            // Create Result in Student Object
            if (rs.next()) {
                s.sid=rs.getInt("sid");
                s.sname=rs.getString("sname");
                return(s);
            } else {
                s.sid=sid;
                s.sname="Student row not found for given sid";        	
                return(s);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        } finally {
            // Clean up resources
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }
        return(s);	
	}

	public Student[] displayallstudentrowobject() 
	{
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Student> s = new ArrayList<>();
        try {
            // Load Oracle JDBC Driver
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	// Connect to Oracle 10g
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Replace with correct SID if needed
            String user = "system"; // Your Oracle username
            String password = "system"; // Your Oracle password

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // SQL query using PreparedStatement to prevent SQL injection
            String sql = "SELECT * FROM student";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            // Create Result in Student Object
            while (rs.next()) {
                Student single = new Student();
                single.sid=rs.getInt("sid");
                single.sname=rs.getString("sname");
                s.add(single);
            }
  
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        } finally {
            // Clean up resources
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }
        return(s.toArray(new Student[0]));	
	}

}
