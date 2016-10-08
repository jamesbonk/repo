package Szpotifaj;

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
			alreadyClicked.remove(0).setId("menuButtons");
			frame.przegladaj.setId("menuButtonsClicked");
			alreadyClicked.add(frame.przegladaj);
		}
		if(source == frame.utwory)
		{
			alreadyClicked.remove(0).setId("menuButtons");
			frame.utwory.setId("menuButtonsClicked");
			alreadyClicked.add(frame.utwory);
		}
		if(source == frame.albumy)
		{
			alreadyClicked.remove(0).setId("menuButtons");
			frame.albumy.setId("menuButtonsClicked");
			alreadyClicked.add(frame.albumy);
		}
		if(source == frame.wykonawcy)
		{
			alreadyClicked.remove(0).setId("menuButtons");
			frame.wykonawcy.setId("menuButtonsClicked");
			alreadyClicked.add(frame.wykonawcy);
		}
		if(source == frame.playlisty)
		{
			alreadyClicked.remove(0).setId("menuButtons");
			frame.playlisty.setId("menuButtonsClicked");
			alreadyClicked.add(frame.playlisty);
		}
	}

}
