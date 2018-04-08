package CisGroupProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainMenu {
	public static void main( String [] args) throws Exception {
		getConnection();
		
	}
	public static Connection getConnection() throws Exception{
		try {
				String driver= "com.mysql.jdbc.Driver";
				String url="jdbc:mysql:///lab 3";
				String username = "";
				String password ="";
				Class.forName(driver);
				Connection con= DriverManager.getConnection(url, username, password);
				System.out.println("connectd.");
				return con; 
	} catch (Exception e) {System.out.println(e);}
	return null;
	}
}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Properties;
// 
//public class MainMenu {
//    public static void main(String[] args) {
// 
//        // creates three different Connection objects
//        Connection conn1 = null;
//        Connection conn2 = null;
//        Connection conn3 = null;
// 
//        try {
//            // connect way #1
//            String url1 = "jdbc:mysql://localhost:3306/test1";
//            String user = "root";
//            String password = "secret";
// 
//            conn1 = DriverManager.getConnection(url1, user, password);
//            if (conn1 != null) {
//                System.out.println("Connected to the database test1");
//            }
// 
//            // connect way #2
//            String url2 = "jdbc:mysql://localhost:3306/test2?user=root&password=secret";
//            conn2 = DriverManager.getConnection(url2);
//            if (conn2 != null) {
//                System.out.println("Connected to the database test2");
//            }
// 
//            // connect way #3
//            String url3 = "jdbc:mysql://localhost:3306/test3";
//            Properties info = new Properties();
//            info.put("user", "root");
//            info.put("password", "secret");
// 
//            conn3 = DriverManager.getConnection(url3, info);
//            if (conn3 != null) {
//                System.out.println("Connected to the database test3");
//            }
//        } catch (SQLException ex) {
//            System.out.println("An error occurred. Maybe user/password is invalid");
//            ex.printStackTrace();
//        }
//    }
//}