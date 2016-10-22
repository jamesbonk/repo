package Szpotifaj;

import javafx.event.Event;
import javafx.event.EventHandler;

public class PrzegladajListener implements EventHandler
{
	Main frame;
	
	PrzegladajListener(Main frame)
	{
		this.frame = frame;
	}
	
	@Override
	public void handle(Event e) {
		Object event = e.getSource();
		
		if(event==frame.listener.panelChanger.hip_hopButton){
		
			DbAccess dbacces = new DbAccess("hip-hop");
			dbacces.start();
			try {
				Thread.sleep(5000);;
			} catch (InterruptedException e1) {
				System.out.println("chuja");
			}
			frame.listener.panelChanger.panelClear();
			frame.listener.panelChanger.changeContent();
		}
		
		if(event==frame.listener.panelChanger.jazzButton){
			
			DbAccess dbacces = new DbAccess("jazz");
			dbacces.start();
			try {
				Thread.sleep(5000);;
			} catch (InterruptedException e1) {
				System.out.println("chuja");
			}
			frame.listener.panelChanger.panelClear();
			frame.listener.panelChanger.changeContent();
		}
		
		if(event==frame.listener.panelChanger.klasycznaButton){
		
			DbAccess dbacces = new DbAccess("classical");
			dbacces.start();
			try {
				Thread.sleep(5000);;
			} catch (InterruptedException e1) {
				System.out.println("chuja");
			}
			frame.listener.panelChanger.panelClear();
			frame.listener.panelChanger.changeContent();
		}
		
		if(event==frame.listener.panelChanger.popButton){
			
			DbAccess dbacces = new DbAccess("pop");
			dbacces.start();
			try {
				Thread.sleep(2000);;
			} catch (InterruptedException e1) {
				System.out.println("chuja");
			}
			frame.listener.panelChanger.panelClear();
			frame.listener.panelChanger.changeContent();
		}
		
		if(event==frame.listener.panelChanger.reggaeButton){
			
			DbAccess dbacces = new DbAccess("reggae");
			dbacces.start();
			try {
				Thread.sleep(5000);;
			} catch (InterruptedException e1) {
				System.out.println("chuja");
			}
			frame.listener.panelChanger.panelClear();
			frame.listener.panelChanger.changeContent();
		}
		
		if(event==frame.listener.panelChanger.rockButton){
			
			DbAccess dbacces = new DbAccess("rock");
			dbacces.start();
			try {
				Thread.sleep(5000);;
			} catch (InterruptedException e1) {
				System.out.println("chuja");
			}
			frame.listener.panelChanger.panelClear();
			frame.listener.panelChanger.changeContent();
		}
	}

}
