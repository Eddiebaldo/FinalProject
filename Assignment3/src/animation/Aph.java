package animation;
import java.awt.*;
import javax.swing.*;

import assignment3.Screen;

/**
 * ASSIGNMENT 3 :: ANIMATION
 * @author Eddiebaldo
 *
 */
public class Aph {
	
	
	private Screen screen;
	private Image bg;
	private Animation a;
	
	/**
	 * loads pictures from HDD to java and adds scene
	 */
	public void loadPics(){
		bg = new ImageIcon("C:\\Users\\Eddiebaldo\\Videos\\Programming\\eco 202 homework\\bg.jpg").getImage();
		Image face1 = new ImageIcon("C:\\Users\\Eddiebaldo\\Videos\\Programming\\eco 202 homework\\faceEyesOpen.png").getImage();
		Image face2 = new ImageIcon("C:\\Users\\Eddiebaldo\\Videos\\Programming\\eco 202 homework\\faceEyesClose.png").getImage();
		a = new Animation();
		a.addScene(face1, 250);
		a.addScene(face2, 250);
		
		
	}
	
	/**
	 * main engine to run
	 * @param dm
	 */
	public void run(DisplayMode dm){
		screen = new Screen();
		try{
			screen.setFullScreen(dm, new JFrame());
			loadPics();
			movieLoop();
		}finally{
			screen.restoreScreen();
		}
		
		
		
		
		
	}
	
	/**
	 * main movie loop
	 */
	public void movieLoop(){
		long startingTime = System.currentTimeMillis();
		long cumTime = startingTime;
		
		while(cumTime - startingTime <5000){
			long timePassed = System.currentTimeMillis() - cumTime;
			cumTime += timePassed;
			a.update(timePassed);
			
			Graphics g = screen.getFullScreenWindow().getGraphics();
			draw(g);
			g.dispose();
			
			try{
				Thread.sleep(20);
				
			}catch(Exception ex){}
			
			
		}
	}

	
	public void draw(Graphics g){
		g.drawImage(bg, 0, 0, null);
		g.drawImage(a.getImage(), 0, 0, null);
	}
}
