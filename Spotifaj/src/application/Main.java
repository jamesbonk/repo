package application;
	
import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	
	double width = dimension.getWidth() - 15;
	double height = dimension.getHeight() - 75;
	
	@Override
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("Szpotifaj");
		BorderPane layout= new BorderPane();
		Scene scene = new Scene(layout, width, height);
		String cssPath = this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(cssPath);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}
