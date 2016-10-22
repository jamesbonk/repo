package Szpotifaj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;

public class CenterPanelChanger 
{
	Main frame;
	Button hip_hopButton, popButton, klasycznaButton, reggaeButton, rockButton, jazzButton;
	String cssPath = this.getClass().getResource("panel.css").toExternalForm();
	PrzegladajListener listener;
	SongButtons buttons;
	
	CenterPanelChanger(Main frame, PrzegladajListener listener, SongButtons buttons)
	{
		this.frame = frame;
		this.listener = listener;
		this.buttons = buttons;
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
		hip_hopButton.setOnAction(listener);
		frame.centerPane.add(hip_hopButton, 0, 0, 1, 1);
		
		popButton = new Button("Pop",frame.imgReader.pop);
		popButton.setContentDisplay(ContentDisplay.TOP);
		popButton.setId("Buttons");
		popButton.setOnAction(listener);
		frame.centerPane.add(popButton, 1, 0, 1, 1);
		
		klasycznaButton = new Button("Klasyczna",frame.imgReader.klasyczna);
		klasycznaButton.setContentDisplay(ContentDisplay.TOP);
		klasycznaButton.setId("Buttons");
		klasycznaButton.setOnAction(listener);
		frame.centerPane.add(klasycznaButton, 2, 0, 1, 1);
		
		reggaeButton = new Button("Reggae",frame.imgReader.reggae);
		reggaeButton.setContentDisplay(ContentDisplay.TOP);
		reggaeButton.setId("Buttons");
		reggaeButton.setOnAction(listener);
		frame.centerPane.add(reggaeButton, 0, 1, 1, 1);
		
		rockButton = new Button("Rock",frame.imgReader.rock);
		rockButton.setContentDisplay(ContentDisplay.TOP);
		rockButton.setId("Buttons");
		rockButton.setOnAction(listener);
		frame.centerPane.add(rockButton, 1, 1, 1, 1);
		
		jazzButton = new Button("Jazz",frame.imgReader.jazz);
		jazzButton.setContentDisplay(ContentDisplay.TOP);
		jazzButton.setId("Buttons");
		jazzButton.setOnAction(listener);
		frame.centerPane.add(jazzButton, 2, 1, 1, 1);
	}
	
	void changeContent()
	{
		Label utwor = new Label("Utwór");
		utwor.setId("upLabel");
		Label wykonawca = new Label("Wykonawca");
		wykonawca.setId("upLabel");
		Label album = new Label("Album");
		album.setId("upLabel");
		
		frame.centerPane.add(utwor,2,0,1,1);
		frame.centerPane.add(wykonawca,4,0,1,1);
		frame.centerPane.add(album,6,0,1,1);
		
		Iterator iterator = ListsMusic.itemsByGenre.iterator();
		int i = 1;
		
		while(iterator.hasNext())
		{
			Object[] items = (Object[]) iterator.next();
			
			Label label1 = new Label((String)items[0]);
			Label label2 = new Label((String)items[1]);
			Label label3 = new Label((String)items[2]);
			
			ListsMusic.songsName.add((String)items[0]);
			ListsMusic.listOfUrl.add((String)items[3]);
			buttons.addIcon();
			
			frame.centerPane.add(buttons.playButtonList.get(i-1),1,i,1,1);
			frame.centerPane.add(label1,2,i,1,1);
			frame.centerPane.add(label2,4,i,1,1);
			frame.centerPane.add(label3,6,i,1,1);
			
			i++;
		}
	}
}
