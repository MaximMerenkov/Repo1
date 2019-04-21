package Database;

import java.sql.*;
import java.time.LocalTime;

import BusinessLogic.Customer;
import BusinessLogic.Data;

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
			
			
		/*	public static addFlight
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
			
			*/
			
			
			
			String sqlQuery2 = "insert into flight values(?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement statement2 = connection.prepareStatement(sqlQuery2);
			statement2.setInt(1, 1);
			statement2.setString(2, "Atlanta");
			statement2.setDate(3, new Date(04-18-19));
			statement2.setString(4, "8:30 AM");
			statement2.setString(5, "Atlanta");
			statement2.setString(6, "80.00");
			statement2.setInt(7, 200);
			statement2.executeUpdate();
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
		public static void dbPushBooking(int ticketId, String flightId, String custUserName) {
			String databaseURL = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";
			String databaseUser = "root";
			String databasePass = "Westsmyrna-2020";
			
			try {
				
				//loads the dirver to connect to the database
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection connection = DriverManager.getConnection(databaseURL, databaseUser, databasePass);
				System.out.print("Database connected");
				String sqlQuery = 
						"insert into confirmedbookings values(" + ticketId + ", " + flightId + ", " + custUserName + ")";
				PreparedStatement statement = connection.prepareStatement(sqlQuery);
				statement.executeUpdate();
				
				
				
				
				
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
		
		public static void addUser(Data data) throws SQLException {
			
			String databaseURL = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";
			String databaseUser = "root";
			String databasePass = "Westsmyrna-2020";
			
			
				//loads the driver to connect to the database
				
				Connection connection = DriverManager.getConnection(databaseURL, databaseUser, databasePass);
				String sqlQuery = "INSERT INTO users (ssn, firstname, lastname, address,zip, state,username,password,email,question, answer) VALUES(?, ?, ?, ?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(sqlQuery);
				statement.setString(1, data.getPerson().getSsn()); //first question mark
				statement.setString(2, data.getPerson().getFirstName()); //second question mark
				statement.setString(3, data.getPerson().getLastName());
				statement.setString(4, data.getPerson().getAddress());
				statement.setString(5, data.getPerson().getZipCode());
				statement.setString(6, data.getPerson().getState());
				statement.setString(7, data.getPerson().getUserName());
				statement.setString(8, data.getPerson().getPassword());
				statement.setString(9, data.getPerson().getEmail());
				statement.setString(10, data.getPerson().getSecurityQuestion());
				statement.setString(11, data.getPerson().getAnswer());
				
				statement.executeUpdate();
		}
		
}
	
	


