package Szpotifaj;
	
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Main extends Application {
	
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	ImgReader imgReader;
	double width = dim.getWidth();
	double height = dim.getHeight()-70;
	MenuButton file,edit,view,help;
	HBox downPane;
	GridPane upPane, centerPane;
	VBox leftPane, rightPane;
	BorderPane borderPane;
	Listener listener;
	ToggleButton playlisty, przegladaj, utwory, albumy, wykonawcy;
	TextField szukaj;
	ProgressBar musicBar;
	Icons icons;
	Button chevronLeftButton,chevronRightButton,nextSong,prevSong,playButton;
	static Media media;
	static MediaPlayer mediaPlayer;
	
	@Override
	
	public void start(Stage primaryStage) 
	{
		primaryStage.setTitle("Szpotifaj");
		borderPane = new BorderPane();
		icons = new Icons();
		imgReader = new ImgReader();
		listener = new Listener(this,icons);
		
		//left panel//
		setLeftButtons();
		
		//up panel//
		setUpButtons();
			
			
		//center panel
		centerPane = new GridPane();
		centerPane.setId("centerPane");
		borderPane.setCenter(centerPane);
		listener.panelChanger.panelPrzegladaj();
		
		
		//right panel
		rightPane = new VBox();
		rightPane.setId("rightPane");
		borderPane.setRight(rightPane);
		
		
		//bottom panel
		setBottomPanel();
		
		//ustawianie sceny
		Scene scene = new Scene(borderPane,width,height);
		
		String cssPath = this.getClass().getResource("application.css").toExternalForm();
		String iconPath = this.getClass().getResource("App-Spotify-icon.png").toExternalForm();
		scene.getStylesheets().add(cssPath);
		primaryStage.getIcons().add(new Image(iconPath));
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		String song = "D:/muzyka/01. Coldplay feat. Beyonce - Hymn For The Weekend.mp3";
		media = new Media(new File(song).toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		
		launch(args);
	}
	
	public void setUpButtons()
	{
		file = new MenuButton("File");
		file.setId("UpPanelMenu");
		edit = new MenuButton("Edit");
		edit.setId("UpPanelMenu");
		view = new MenuButton("View");
		view.setId("UpPanelMenu");
		help = new MenuButton("Help");
		help.setId("UpPanelMenu");
		szukaj = new TextField("   Szukaj");
		szukaj.setId("szukaj");
		
		chevronLeftButton = new Button("",icons.chevronLeft);
		chevronLeftButton.setId("chevronButtonLeft");
		
		chevronRightButton = new Button("",icons.chevronRight);
		chevronRightButton.setId("chevronButtonRight");
			
		upPane = new GridPane();
		upPane.setId("upPane");
			
		upPane.add(file, 0, 0, 1, 1);
		upPane.add(edit, 1, 0, 1, 1);
		upPane.add(view, 2, 0, 1, 1);
		upPane.add(help, 3, 0, 1, 1);
		upPane.add(szukaj, 3, 1, 1, 1);
		upPane.add(icons.search, 3, 1, 1, 1);
		upPane.add(chevronLeftButton, 0, 1, 1, 1);
		upPane.add(chevronRightButton, 1, 1, 1, 1);
			
		borderPane.setTop(upPane);
	}
	
	public void setLeftButtons()
	{
		Label menuLabel = new Label("Menu G³ówne");
		menuLabel.setId("menuLabel");
		
		ToggleGroup menuGroup = new ToggleGroup();
		
		przegladaj = new ToggleButton("  Przegl¹daj",icons.archive);
		przegladaj.setToggleGroup(menuGroup);
		przegladaj.setId("menuButtonsClicked");
		przegladaj.setOnAction(listener);
		
		utwory = new ToggleButton("  Utwory",icons.note);
		utwory.setToggleGroup(menuGroup);
		utwory.setId("menuButtons");
		utwory.setOnAction(listener);
		
		albumy = new ToggleButton("  Albumy",icons.folderOpen); 
		albumy.setToggleGroup(menuGroup);
		albumy.setId("menuButtons");
		albumy.setOnAction(listener);
		
		wykonawcy = new ToggleButton("  Wykonawcy", icons.mic); 
		wykonawcy.setToggleGroup(menuGroup);
		wykonawcy.setId("menuButtons");
		wykonawcy.setOnAction(listener);
		
		playlisty = new ToggleButton("  Playlisty",icons.music);
		playlisty.setToggleGroup(menuGroup);
		playlisty.setId("menuButtons");
		playlisty.setOnAction(listener);
		
		listener.setFirstClicked();
		
		Button nowaPlaylista = new Button("  Nowa playlista",icons.plusSquare);
		nowaPlaylista.setId("nowaPlaylistaButton");
		
		leftPane = new VBox(menuLabel,przegladaj,utwory,albumy,wykonawcy,playlisty,nowaPlaylista);
		leftPane.setId("leftPane");
		
		borderPane.setLeft(leftPane);
	}
	
	public void setBottomPanel()
	{
		musicBar = new ProgressBar();
		musicBar.setMinWidth(850);
		musicBar.setId("musicBar");
		
		
		
		nextSong = new Button("",icons.nextSong);
		nextSong.setStyle("-fx-background-color: #2C302C;" + 
		"-fx-padding: 10 60 5 5");
		nextSong.setId("musicButtons");
		
		prevSong = new Button("",icons.prevSong);
		prevSong.setStyle("-fx-background-color: #2C302C;" + 
				"-fx-padding: 10 5 5 25");
		prevSong.setId("musicButtons");
		
		playButton = new Button("",icons.playButton);
		playButton.setStyle("-fx-background-color: #2C302C;" + 
				"-fx-padding: 8 5 5 5");
		playButton.setId("musicButtons");
		playButton.setOnAction(listener);
		
		downPane = new HBox(prevSong,playButton,nextSong,musicBar);
		downPane.setId("downPane");
		borderPane.setBottom(downPane);
	}
}
