package assignment3;
import java.awt.*;
import javax.swing.*;

/**ASSIGNMET 3 :: SLIDER AND ANIMATION
 * 
 * @author Eddiebaldo
 *
 */
/**
 * drawing circle for slider
 * @author Eddiebaldo
 *
 */
public class DrawOval extends JPanel{

	/**diameter of 10 as default
	 * 
	 */
	private int d = 10;
	
	public void paintComponent(Graphics g){
		
		/**prep object for drawing
		 * 
		 */
		super.paintComponent(g);
		
		/**
		 * building method and changes diameter
		 */
		g.fillOval(10, 10, d, d);
		
		
	}
	
	public void setD(int newD){
		
		/**
		 * this is like to if/else statement
		 */
		d = (newD >= 0 ? newD : 10);
		/**
		 * it calls paint method 
		 */
		repaint();
		
		
	}
	/**
	 * house keeping method
	 */
	public Dimension getPreferredSize(){
		
		return new Dimension(200,200);
		
	}
	
	/**
	 * house keeping method
	 */
	public Dimension getMinimumSize(){
		return getPreferredSize();
	}
	
	
}
