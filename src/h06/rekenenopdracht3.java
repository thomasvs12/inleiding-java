package h06;
import java.applet.Applet;
import java.awt.*;

public class rekenenopdracht3 extends Applet {
int a, b, c, uitkomst;


public void init (){
	a = 800000000;
	b = 900000000;
	c = 4;
	uitkomst = (a * b * c);
	

		}
public void paint (Graphics g){
g.drawString("DE UITKOMST IS:"+ uitkomst, 60, 60);	
}

}

