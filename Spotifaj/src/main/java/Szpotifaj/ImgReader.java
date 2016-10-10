package Szpotifaj;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javafx.scene.image.ImageView;

public class ImgReader 
{
	public ImageView rock, pop, klasyczna,reggae,hip_hop,jazz;
	
	ImgReader()
	{	
		hip_hop = new ImageView("img/hip_hop.jpg");
	}
}
