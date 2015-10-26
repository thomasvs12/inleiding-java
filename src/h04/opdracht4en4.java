package h04;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class opdracht4en4 extends Applet {
	int jeroen = 100;
	int hans = 80;
	int vladerie = 40; 
	
	
	
	  public void init() {
	
	  }
	 
	  public void paint(Graphics g) {
		  g.drawLine(10,150,150,150);
		  g.drawLine(10,10,10,150);
		  g.setColor(Color. BLUE);
		  g.drawRect(25,(int)(150- jeroen * 1.25),25,(int)(jeroen * 1.25));
		  g.fillRect(25,(int)(150- jeroen * 1.25),25,(int)(jeroen * 1.25));
		  
		  g.setColor(Color.YELLOW);
		  g.drawRect(65,(int)(150- hans * 1.25),25,(int)(hans * 1.25));
		  g.fillRect(65,(int)(150- hans * 1.25),25,(int)(hans * 1.25));
		  
		  g.setColor(Color. RED);
		  g.drawRect(100,(int)(150- vladerie * 1.25),25,(int)(vladerie * 1.25));
		  g.fillRect(100,(int)(150- vladerie * 1.25),25,(int)(vladerie * 1.25));
		  
		  
}
}