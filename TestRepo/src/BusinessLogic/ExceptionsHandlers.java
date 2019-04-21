package BusinessLogic;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import gui.AlertBox;

public class ExceptionsHandlers {
	
	//get all of the user inputs from the gui as a string
	/*public static boolean didUserEnterAllFields(String firstName, String lastName, String address, String state,
		String userName, String password, String email,	String SSN, String question, String answer) {
		if (firstName.isEmpty()|| lastName.isEmpty() || address.isEmpty() || state.isEmpty() ||userName.isEmpty() || password.isEmpty()
				|| password.isEmpty() || email.isEmpty() || SSN.isEmpty() || question.isEmpty()|| answer.isEmpty()) {
		return false;
		}
		
		return true;
		*/
	
	public static void catchExceptions(Data data, String msg) {
		
		try {
			BusinessProccess.processObject(data, msg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			AlertBox.display("Registration confirmation", "Please fill out all fields");
		}
	}

}
