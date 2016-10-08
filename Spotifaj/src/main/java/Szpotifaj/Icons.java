package Szpotifaj;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import jiconfont.icons.Entypo;
import jiconfont.icons.FontAwesome;
import jiconfont.javafx.IconFontFX;
import jiconfont.javafx.IconNode;

public class Icons 
{
	ImageView chevronLeft,chevronRight,search,archive,music,play,note,folderOpen,mic,plusSquare;
	
	Icons()
	{
		IconFontFX.register(FontAwesome.getIconFont());
		

		Stop[] stops = new Stop[]{new Stop(0, Color.GRAY), new Stop(1, Color.GRAY)};
		LinearGradient fill = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, stops);
		
		Stop[] stops2 = new Stop[]{new Stop(0, Color.BLACK), new Stop(1, Color.BLACK)};
		LinearGradient fill2 = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, stops2);
		
		Color stroke = Color.GRAY;
		Image image1 = IconFontFX.buildImage(FontAwesome.CHEVRON_LEFT, 20, fill, stroke);
		Image image2 = IconFontFX.buildImage(FontAwesome.CHEVRON_RIGHT, 20, fill, stroke);
		Image image3 = IconFontFX.buildImage(FontAwesome.SEARCH, 15, fill2, Color.BLACK);
		Image image4 = IconFontFX.buildImage(Entypo.ARCHIVE, 15, fill, stroke);
		Image image5 = IconFontFX.buildImage(Entypo.NOTE_BEAMED, 21, fill, stroke);
		Image image6 = IconFontFX.buildImage(FontAwesome.PLAY_CIRCLE_O, 15, fill, stroke);
		Image image7 = IconFontFX.buildImage(Entypo.NOTE, 21, fill, stroke);
		Image image8 = IconFontFX.buildImage(FontAwesome.FOLDER_OPEN_O, 21, fill, stroke);
		Image image9 = IconFontFX.buildImage(FontAwesome.MICROPHONE, 21, fill, stroke);
		Image image10 = IconFontFX.buildImage(FontAwesome.PLUS_SQUARE_O, 23, fill, stroke);
		
		chevronLeft = new ImageView(image1);
		chevronRight = new ImageView(image2);
		search = new ImageView(image3);
		archive = new ImageView(image4);
		music = new ImageView(image5);
		play = new ImageView(image6);
		note = new ImageView(image7);
		folderOpen = new ImageView(image8);
		mic = new ImageView(image9);
		plusSquare = new ImageView(image10);
	}
	
}
