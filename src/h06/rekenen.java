package h06;
import java. awt.*;
import java.applet.Applet;

public class rekenen extends Applet {
	int seconde, minuut, uur, dag, jaar;
	
	
	public void init(){
		
			
			seconde = 1;
			minuut = seconde * 60;
			uur = minuut * 60;
			dag = uur  * 24;
			jaar = dag * 365;
			
					
		}

		public void paint (Graphics g){
			g.drawString("Er zitten " + uur + " seconden in een uur", 60, 60);
			g.drawString("Er zitten " + dag + " seconden in een dag" ,60, 80);
			g.drawString("Er zitten " + jaar + " seconden in een jaar", 60, 100);
		}
			}

