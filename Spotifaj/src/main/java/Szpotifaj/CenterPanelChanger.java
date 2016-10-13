package Szpotifaj;

import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;

public class CenterPanelChanger 
{
	Main frame;
	Button hip_hopButton, popButton, klasycznaButton, reggaeButton, rockButton, jazzButton;
	String cssPath = this.getClass().getResource("panel.css").toExternalForm();
	
	CenterPanelChanger(Main frame)
	{
		this.frame = frame;
	}
	
	void panelClear()
	{
		frame.centerPane.getChildren().clear();
	}
	
	void panelPrzegladaj()
	{
		frame.centerPane.setHgap(50);
		frame.centerPane.setVgap(50);
		frame.centerPane.getStylesheets().add(cssPath);
		
		hip_hopButton = new Button("Hip hop",frame.imgReader.hip_hop);
		hip_hopButton.setContentDisplay(ContentDisplay.TOP);
		hip_hopButton.setId("Buttons");
		frame.centerPane.add(hip_hopButton, 0, 0, 1, 1);
		
		popButton = new Button("Pop",frame.imgReader.pop);
		popButton.setContentDisplay(ContentDisplay.TOP);
		popButton.setId("Buttons");
		frame.centerPane.add(popButton, 1, 0, 1, 1);
		
		klasycznaButton = new Button("Klasyczna",frame.imgReader.klasyczna);
		klasycznaButton.setContentDisplay(ContentDisplay.TOP);
		klasycznaButton.setId("Buttons");
		frame.centerPane.add(klasycznaButton, 2, 0, 1, 1);
		
		reggaeButton = new Button("Reggae",frame.imgReader.reggae);
		reggaeButton.setContentDisplay(ContentDisplay.TOP);
		reggaeButton.setId("Buttons");
		frame.centerPane.add(reggaeButton, 0, 1, 1, 1);
		
		rockButton = new Button("Rock",frame.imgReader.rock);
		rockButton.setContentDisplay(ContentDisplay.TOP);
		rockButton.setId("Buttons");
		frame.centerPane.add(rockButton, 1, 1, 1, 1);
		
		jazzButton = new Button("Jazz",frame.imgReader.jazz);
		jazzButton.setContentDisplay(ContentDisplay.TOP);
		jazzButton.setId("Buttons");
		frame.centerPane.add(jazzButton, 2, 1, 1, 1);
	}
}
