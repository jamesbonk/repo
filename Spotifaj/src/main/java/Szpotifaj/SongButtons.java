package Szpotifaj;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class SongButtons 
{
	Icons icons;
	List<ToggleButton> playButtonList = new ArrayList<ToggleButton>(); 
	ToggleGroup playButtonGroup = new ToggleGroup();
	
	SongButtons(Icons icons)
	{
		this.icons = icons;
	}
	
	void addIcon()
	{
		ToggleButton temp = new ToggleButton("",icons.playButton2);
		temp.setToggleGroup(playButtonGroup);
		playButtonList.add(temp);
	}
}
