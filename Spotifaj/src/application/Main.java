package application;
	
import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends Application {
	
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	double width = dim.getWidth();
	double height = dim.getHeight()-70;
	MenuButton file,edit,view;
	FlowPane centerPane;
	HBox upPane, downPane;
	VBox leftPane, rightPane;
	BorderPane borderPane;
	
	@Override
	
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("Sptf");
		borderPane = new BorderPane();
		
		//up panel//
		file = new MenuButton("File");
		edit = new MenuButton("Edit");
		view = new MenuButton("View");
		
		upPane = new HBox();
		upPane.setId("upPane");
		
		upPane.getChildren().add(file);
		upPane.getChildren().add(edit);
		upPane.getChildren().add(view);
		
		borderPane.setTop(upPane);
		
		//left panel//
		Label menuLabel = new Label("Menu G³ówne");
		
		ToggleGroup menuGroup = new ToggleGroup();
		
		ToggleButton przegladaj = new ToggleButton("Przegl¹daj");
		przegladaj.setToggleGroup(menuGroup);
		
		ToggleButton utwory = new ToggleButton("Utwory");
		utwory.setToggleGroup(menuGroup);
		
		ToggleButton albumy = new ToggleButton("Albumy"); 
		albumy.setToggleGroup(menuGroup);
		
		ToggleButton wykonawcy = new ToggleButton("Wykonawcy"); 
		wykonawcy.setToggleGroup(menuGroup);
		
		ToggleButton playlisty = new ToggleButton("Playlisty");
		playlisty.setToggleGroup(menuGroup);
		
		Button nowaPlaylista = new Button("Nowa playlista");
		
		leftPane = new VBox(menuLabel,przegladaj,utwory,albumy,wykonawcy,playlisty,nowaPlaylista);
		leftPane.setId("leftPane");
		
		borderPane.setLeft(leftPane);
		
		//center panel
		centerPane = new FlowPane();
		centerPane.setId("centerPane");
		borderPane.setCenter(centerPane);
		
		
		//right panel
		rightPane = new VBox();
		rightPane.setId("rightPane");
		borderPane.setRight(rightPane);
		
		
		//bottom panel
		Label labi = new Label("Dolny");
		downPane = new HBox();
		downPane.setMinWidth(60);
		downPane.setId("downPane");
		borderPane.setBottom(downPane);
		
		//ustawianie sceny
		Scene scene = new Scene(borderPane,width,height);
		
		String cssPath = this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(cssPath);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
