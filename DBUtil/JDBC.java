package Utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Service.UserService;



public class JDBC {
 
	
	
	public static  Connection getConnection(){
		
	Connection conn = null;
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/contraction";
	String user = "root";
	String password = "xiang123";
	
	try {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, password);
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	
	}
	/*
	public static void main(String[] args) {
		getConnection();
		UserService user = new UserService();
		boolean flag = user.CheckExist("peng");
		if(flag){
			user.register("peng", "peng123");
		}
	}*/
}