package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.DriverManager;
public class ConnectionFactory {
	
	
	public static Connection getConnection () {
		
		try {
			//Nome driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Retornar
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/agenda?userTimezone=true&serverTimezone=UTC","root","asha202");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException ();
		}
		
	}
	//private static final String USERNAME = "root";
	//private static final String PASSWORD = "asha202";
	//private static final String DATABASE_URL = "jdbc:mysql://localhost/db_supermercado?userTimezone=true&serverTimezone=UTC";

}
