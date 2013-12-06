package interfaceImplementation;
import javax.swing.JOptionPane;


/**
 * ASSIGNMENT 3 :: INTERFACE IMPLEMENTATION
 * @author Eddiebaldo
 *
 */
public class Bad implements Info{
	private int Id = 7;
	
	public void tell() {
		JOptionPane.showMessageDialog(null, "You consider yourself to be bad");
		
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Thats bad");
		
	}
}
