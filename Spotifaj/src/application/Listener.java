package application;

import java.util.ArrayList;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ToggleButton;

public class Listener implements EventHandler
{
	ArrayList<ToggleButton> alreadyClicked = new ArrayList<ToggleButton>();
	Main frame;
	Object source;
	
	Listener(Main frame)
	{
		this.frame = frame;
	}
	
	void setFirstClicked()
	{
		alreadyClicked.add(frame.przegladaj);
	}
	@Override
	public void handle(Event e) 
	{
		source = e.getSource();
		
		if(source == frame.przegladaj)
		{
			if(frame.przegladaj.isSelected()==false)
			{
				frame.przegladaj.setId("menuButtonsClicked");
				alreadyClicked.remove(0).setId("menuButtons");
				alreadyClicked.add(frame.przegladaj);
				frame.przegladaj.setSelected(true);
			}
			
		}
		if(source == frame.utwory)
		{
			frame.utwory.setId("menuButtonsClicked");
			alreadyClicked.remove(0).setId("menuButtons");
			alreadyClicked.add(frame.utwory);
		}
		if(source == frame.albumy)
		{
			frame.albumy.setId("menuButtonsClicked");
			alreadyClicked.remove(0).setId("menuButtons");
			alreadyClicked.add(frame.albumy);
		}
		if(source == frame.wykonawcy)
		{
			frame.wykonawcy.setId("menuButtonsClicked");
			alreadyClicked.remove(0).setId("menuButtons");
			alreadyClicked.add(frame.wykonawcy);
		}
		if(source == frame.playlisty)
		{
			frame.playlisty.setId("menuButtonsClicked");
			alreadyClicked.remove(0).setId("menuButtons");
			alreadyClicked.add(frame.playlisty);
		}
	}

}
