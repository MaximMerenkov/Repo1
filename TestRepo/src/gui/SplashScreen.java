package gui;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SplashScreen extends Application  {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		String imageForSplash = "file:///C:/Users/Max/git/Repo1/TestRepo/src/gui/P-51_Mustang_edit1.jpg";
		Image image = new Image(imageForSplash);
		
		StackPane pane = new StackPane();
		Scene scene = new Scene(pane, 600, 800);
		
		ImageView iview = new ImageView();
		iview.setImage(image);
		iview.setFitWidth(750);
		iview.setFitHeight(550);
		pane.getChildren().add(iview);
		
		FadeTransition fadeOut = new FadeTransition(Duration.seconds(5), pane);
		fadeOut.setFromValue(1);
		fadeOut.setToValue(0);
		fadeOut.setCycleCount(1);
		stage.setScene(scene);
		stage.show();
		fadeOut.play();
		
		fadeOut.setOnFinished(event->{
			MenuForAirline menu = new MenuForAirline();
			try {
				menu.start(stage);
				
			}catch (Exception e) {
				e.printStackTrace();
				
			}
		});
		
	   
		
	}
	

}
