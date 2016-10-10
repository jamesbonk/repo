package Szpotifaj;

import javafx.scene.control.Button;

public class CenterPanelChanger 
{
	Main frame;
	Button hip_hopButton;
	CenterPanelChanger(Main frame)
	{
		this.frame = frame;
		panelPrzegladaj();
	}
	
	void panelPrzegladaj()
	{
		hip_hopButton = new Button("",frame.imgReader.hip_hop);
		frame.centerPane.add(hip_hopButton, 0, 0, 1, 1);
	}
}
