package Szpotifaj;

import javafx.application.Application;

public class Starter {

	public static void main(String[] args) {
		ListsMusic.threadList.add(new Thread() {
            @Override
            public void run() {
                Application.launch(Main.class);
            }
        });
        ListsMusic.threadList.get(0).start();
	}

}
