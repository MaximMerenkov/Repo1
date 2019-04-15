package Database;

import java.sql.*;

public class DatabaseConnector {
	
	public static void main(String[] args) {
		
		
		String databaseURL = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";
		String databaseUser = "root";
		String databasePass = "Westsmyrna-2020";
		
		try {
			
			//loads the dirver to connect to the database
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(databaseURL, databaseUser, databasePass);
			System.out.print("Database connected");
			String sqlQuery = "INSERT INTO customer(customerusername, customerpassword) VALUES('max', 'password123')";
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.executeUpdate();
			
			
			
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
	}
	
	

}
