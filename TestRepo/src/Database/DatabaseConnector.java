package Database;

import java.sql.*;

public class DatabaseConnector {
	
	public static void main(String[] args) {
		
		
		String databaseURL = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";
		String databaseUser = "root";
		String databasePass = "Westsmyrna-2020";
		
		try {
			
			//loads the driver to connect to the database
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(databaseURL, databaseUser, databasePass);
			System.out.print("Database connected");
			
			
			String sqlQuery = "INSERT INTO users (ssn, firstname, lastname, address,zip, state,username,password,email,question, answer) VALUES(?, ?, ?, ?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, "12345"); //first question mark
			statement.setString(2, "Simeon"); //second question mark
			statement.setString(3, "Simeon");
			statement.setString(4, "Simeon");
			statement.setString(5, "Simeon");
			statement.setString(6, "Simeon");
			statement.setString(7, "Simeon");
			statement.setString(8, "Simeon");
			statement.setString(9, "Simeon");
			statement.setString(10, "Simeon");
			statement.setString(11, "Simeon");
			
			statement.executeUpdate();
			
			
			
			
			
			
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
	}
	
	

}
