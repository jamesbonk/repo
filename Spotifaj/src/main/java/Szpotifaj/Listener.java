package Szpotifaj;

import java.util.ArrayList;

import com.sun.prism.paint.Color;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ToggleButton;

public class Listener implements EventHandler
{
	ArrayList<ToggleButton> alreadyClicked = new ArrayList<ToggleButton>();
	Main frame;
	Icons icons;
	Object source;
	CenterPanelChanger panelChanger;
	
	Listener(Main frame, Icons icons)
	{
		this.frame = frame;
		this.icons = icons;
		panelChanger = new CenterPanelChanger(this.frame);
	}
	
	void setFirstClicked()
	{
		alreadyClicked.add(frame.przegladaj);
		icons.changeColor(alreadyClicked.get(0).getText(), 0);
	}
	@Override
	public void handle(Event e) 
	{
		source = e.getSource();
		
		if(source == frame.przegladaj)
		{
			icons.changeColor(alreadyClicked.get(0).getText(), 1);
			alreadyClicked.remove(0).setId("menuButtons");
			frame.przegladaj.setId("menuButtonsClicked");
			alreadyClicked.add(frame.przegladaj);
			icons.changeColor(alreadyClicked.get(0).getText(), 0);
			panelChanger.panelPrzegladaj();
		}
		if(source == frame.utwory)
		{
			icons.changeColor(alreadyClicked.get(0).getText(), 1);
			alreadyClicked.remove(0).setId("menuButtons");
			frame.utwory.setId("menuButtonsClicked");
			alreadyClicked.add(frame.utwory);
			icons.changeColor(alreadyClicked.get(0).getText(), 0);
			panelChanger.panelClear();
		}
		if(source == frame.albumy)
		{
			icons.changeColor(alreadyClicked.get(0).getText(), 1);
			alreadyClicked.remove(0).setId("menuButtons");
			frame.albumy.setId("menuButtonsClicked");
			alreadyClicked.add(frame.albumy);
			icons.changeColor(alreadyClicked.get(0).getText(), 0);
			panelChanger.panelClear();
		}
		if(source == frame.wykonawcy)
		{
			icons.changeColor(alreadyClicked.get(0).getText(), 1);
			alreadyClicked.remove(0).setId("menuButtons");
			frame.wykonawcy.setId("menuButtonsClicked");
			alreadyClicked.add(frame.wykonawcy);
			icons.changeColor(alreadyClicked.get(0).getText(), 0);
			panelChanger.panelClear();
		}
		if(source == frame.playlisty)
		{
			icons.changeColor(alreadyClicked.get(0).getText(), 1);
			alreadyClicked.remove(0).setId("menuButtons");
			frame.playlisty.setId("menuButtonsClicked");
			alreadyClicked.add(frame.playlisty);
			icons.changeColor(alreadyClicked.get(0).getText(), 0);
			panelChanger.panelClear();
		}
	}

}
