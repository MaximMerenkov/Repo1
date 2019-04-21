package BusinessLogic;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import Database.DatabaseConnector;
import gui.AlertBox;

public class BusinessProccess {
//	public static addFlight() 
		//connect
	public static void signUp(Data data) throws SQLException {
		DatabaseConnector.addUser(data);		
   }	
    public static void processObject(Data data, String msg) throws SQLException {
	
	if(msg.equals("sign up"))
		signUp(data);
	
	
	
}

}
