package assignment3;

/**
 * ASSIGNMET 3 :: APPLET , basic applet
 */
import java.applet.Applet;
import java.awt.*;
	

public class HtmlApplet extends Applet{

	
	
	

		public void paint ( Graphics g){
			
			g.drawString("Please complete the survey!", getWidth()/2, getHeight()/2);
			
		}
		
		
	}