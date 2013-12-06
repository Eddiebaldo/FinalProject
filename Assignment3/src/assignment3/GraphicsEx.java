package assignment3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ASSIGNMENT 3 :: GRAPHICS
 * @author Eddiebaldo
 *
 */
public class GraphicsEx extends JPanel{

	public void paintComponent (Graphics g){
		
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 30);
	
		g.setColor(new Color(190,81,215));
		g.fillRect(25, 65, 100, 30);
		
		g.setColor(Color.RED);
		g.drawString("Which one do you like?", 25, 120);
		
	}
	
}
