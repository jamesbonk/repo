package Szpotifaj;

import javafx.scene.image.ImageView;

public class ImgReader 
{
	public static ImageView rock, pop, klasyczna,reggae,hip_hop,jazz;
	
	ImgReader()
	{	
		String Path = this.getClass().getResource("img").toExternalForm();
		hip_hop = new ImageView(Path+"/hip_hop.jpg");
		pop = new ImageView(Path+"/pop.png");
		klasyczna = new ImageView(Path+"/klasyczna.jpg");
		reggae = new ImageView(Path+"/reggae.png");
		rock = new ImageView(Path+"/rock.png");
		jazz = new ImageView(Path+"/jazz.png");
	}
}
