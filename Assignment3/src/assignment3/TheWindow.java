package assignment3;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * ASSIGNMENT 3 :: APPLET
 * @author Eddiebaldo
 *
 */
/**
 * this is the window for applet
 * @author Eddiebaldo
 *
 */
public class TheWindow extends JFrame{

	private JSlider slider;
	private DrawOval myPanel;
	
	public TheWindow(){
		
		super("Play with Circle");
		myPanel = new DrawOval();
		myPanel.setBackground(Color.GREEN);
		
		
		/**
		 * this makes the slider go left to right
		 */
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		/**
		 * this creates the marks in bar
		 */
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				
				new ChangeListener(){
					
					public void stateChanged( ChangeEvent e){
						
						myPanel.setD(slider.getValue());
						
					}
					
				}
				
		);
		
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
		
		
		
		
	}
	
	
	
	
	
	
}
