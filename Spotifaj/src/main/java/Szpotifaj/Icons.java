package Szpotifaj;

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

public class Icons {
	IconNode chevronLeft, chevronRight, search, archive, music, note, folderOpen, mic, plusSquare;
	IconNode prevSong, nextSong, playButton, playButton2, pauseButton;

	Icons() {
		IconFontFX.register(FontAwesome.getIconFont());

		// przycisk wstecz
		chevronLeft = new IconNode(FontAwesome.CHEVRON_LEFT);
		chevronLeft.setIconSize(20);
		chevronLeft.setFill(Color.GRAY);

		// przecisk next
		chevronRight = new IconNode(FontAwesome.CHEVRON_RIGHT);
		chevronRight.setIconSize(20);
		chevronRight.setFill(Color.GRAY);

		// ikona na pasku wyszukiwania (lupka)
		search = new IconNode(FontAwesome.SEARCH);
		search.setIconSize(15);
		search.setFill(Color.GRAY);

		// ikona przy przysiku przegl¹dania
		archive = new IconNode(FontAwesome.STACK_OVERFLOW);
		archive.setIconSize(22);
		archive.setFill(Color.GRAY);

		// ikona przy przyciku playlisty
		music = new IconNode(Entypo.NOTE_BEAMED);
		music.setIconSize(22);
		music.setFill(Color.GRAY);

		// ikona przycisku play
		playButton = new IconNode(FontAwesome.PLAY_CIRCLE_O);
		playButton.setIconSize(33);
		playButton.setFill(Color.GRAY);

		playButton2 = new IconNode(FontAwesome.PLAY_CIRCLE_O);
		playButton2.setIconSize(20);
		playButton.setFill(Color.GRAY);

		// ikona przycisku pauzy
		pauseButton = new IconNode(FontAwesome.PAUSE_CIRCLE_O);
		pauseButton.setIconSize(33);
		pauseButton.setFill(Color.GRAY);

		note = new IconNode(Entypo.NOTE);
		note.setIconSize(22);
		note.setFill(Color.GRAY);

		// ikona przy przycisku utwory
		folderOpen = new IconNode(FontAwesome.FOLDER_OPEN_O);
		folderOpen.setIconSize(22);
		folderOpen.setFill(Color.GRAY);

		// ikona przy przycisku wykonawcy
		mic = new IconNode(FontAwesome.MICROPHONE);
		mic.setIconSize(22);
		mic.setFill(Color.GRAY);

		// ikona przy nowej playliscie
		plusSquare = new IconNode(FontAwesome.PLUS_SQUARE_O);
		plusSquare.setIconSize(24);
		plusSquare.setFill(Color.GRAY);

		prevSong = new IconNode(FontAwesome.ANGLE_DOUBLE_LEFT);
		prevSong.setIconSize(29);
		prevSong.setFill(Color.GRAY);

		nextSong = new IconNode(FontAwesome.ANGLE_DOUBLE_RIGHT);
		nextSong.setIconSize(29);
		nextSong.setFill(Color.GRAY);
	}

	public void changeColor(String s, int i) {
		if (s == "  Przegl¹daj" && i == 0)
			archive.setFill(Color.WHITE);
		else if (s == "  Przegl¹daj" && i == 1)
			archive.setFill(Color.GRAY);
		else if (s == "  Utwory" && i == 0)
			note.setFill(Color.WHITE);
		else if (s == "  Utwory" && i == 1)
			note.setFill(Color.GRAY);
		else if (s == "  Albumy" && i == 0)
			folderOpen.setFill(Color.WHITE);
		else if (s == "  Albumy" && i == 1)
			folderOpen.setFill(Color.GRAY);
		else if (s == "  Wykonawcy" && i == 0)
			mic.setFill(Color.WHITE);
		else if (s == "  Wykonawcy" && i == 1)
			mic.setFill(Color.GRAY);
		else if (s == "  Playlisty" && i == 0)
			music.setFill(Color.WHITE);
		else if (s == "  Playlisty" && i == 1)
			music.setFill(Color.GRAY);
	}
}
