package gui;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AirlineRegistration extends Application{
	 public static void main(String[] args) { 
		    launch(args);
		  }
		  
@Override
	 public void start(Stage primaryStage) throws Exception {
	primaryStage.setTitle("7Clouds Registration");
	
	//* Create VBox layout
	HBox topText = new HBox();
	LinearGradient gradient1 = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,
			new Stop(0.2, Color.AQUAMARINE), new Stop(0.8, Color.BLACK));
	Text text = new Text("Register to 7Clouds");
	text.setFont(new Font("Times New Roman", 30));
	text.setStroke(Color.DARKSLATEBLUE);
	text.setStrokeWidth(2);
	text.setFill(gradient1);
	topText.getChildren().add(text);
	topText.setAlignment(Pos.BASELINE_CENTER);
	
	//* Create and set information nodes
	VBox registerCenter = new VBox();
	Label firstName = new Label();
	Label lastName = new Label();
	Label address = new Label();
	Label state = new Label();
	Label zip = new Label();
	Label userName = new Label();
	Label password = new Label();
	Label email = new Label();
	Label SSN = new Label();
	Label secQuestion = new Label();
	Label secAnswer = new Label();
	TextField txtFirstName = new TextField();
	txtFirstName.setPromptText("First name");
	TextField txtLastName = new TextField("Lastname");
	TextField txtAddress = new TextField("Address");
	TextField txtState = new TextField("State");
	TextField txtZip = new TextField("Zip");
	TextField txtUserName = new TextField("Username");
	TextField txtPassword = new TextField("Password");
	TextField txtEmail = new TextField("Email");
	TextField txtSSN = new TextField("SSN");
	TextField txtSecQuestion = new TextField("Enter sequrity question");
	TextField txtSecAnswer = new TextField("Enter sequrity answer");
	Button completeButton = new Button("Complete");
	Button backButton = new Button("Back");
	
	//* Set size for all nodes
	firstName.setMaxWidth(180);
	lastName.setMaxWidth(180);
	address.setMaxWidth(180);
	state.setMaxWidth(180);
	zip.setMaxWidth(180);
	userName.setMaxWidth(190);
	password.setMaxWidth(180);
	email.setMaxWidth(180);
	SSN.setMaxWidth(180);
	secQuestion.setMaxWidth(180);
	secAnswer.setMaxWidth(150);
	completeButton.setMaxWidth(150);
	backButton.setMaxWidth(150);
	txtFirstName.setMaxWidth(150);
	txtLastName.setMaxWidth(150);
	txtAddress.setMaxWidth(150);
	txtState.setMaxWidth(150); 
	txtZip.setMaxWidth(150); 
	txtUserName.setMaxWidth(150); 
	txtPassword.setMaxWidth(150); 
	txtEmail.setMaxWidth(150);
	txtSSN.setMaxWidth(150); 
	txtSecQuestion.setMaxWidth(150);
	txtSecAnswer.setMaxWidth(150);
	
	registerCenter.getChildren().addAll(firstName,lastName, address,state,zip,userName,password,
			email,SSN,secQuestion,secAnswer,txtFirstName,txtLastName, txtAddress,txtState,txtZip,
			txtUserName, txtPassword, txtEmail, txtSSN, txtSecQuestion, txtSecAnswer,
			completeButton, backButton);
	
	registerCenter.setAlignment(Pos.TOP_CENTER);
	StackPane bottomPane = new StackPane();
	
	BorderPane registerWindow = new BorderPane();
	registerWindow.setTop(topText);
	registerWindow.setCenter(registerCenter);
	registerWindow.setBottom(bottomPane);
	
	
	Scene newScene = new Scene(registerWindow, 500,600);
	newScene.getStylesheets().add("background.css");
	primaryStage.setScene(newScene);
	primaryStage.show();
}

}
