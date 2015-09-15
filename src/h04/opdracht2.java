package h04;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class opdracht2 extends Applet {
	
	
	//een (lege) methode die de Applet initialiseert
	  public void init() {
	
	  }
	  //een methode die de inhoud van het scherm tekent
	  public void paint(Graphics g) {
		  g.setColor(Color.RED); 
		  g.drawRect(20,20,85,50);
		  g.fillRect(20,20,85,50);
		  g.setColor(Color.BLACK);
		  g.drawLine(20,20,20,250);
		  g.setColor(Color.BLUE);
		  g.drawRect(20, 120, 85, 50);
		  g.fillRect(20,120, 85, 50);
	  }
}