package interfaceImplementation;
import javax.swing.JOptionPane;


/**
 * ASSIGNMENT 3 :: INTERFACE IMPLEMENTATION
 * @author Eddiebaldo
 *
 */
public class Good implements Info{

	private String name ;
	
	
	
	public Good(String name) {
		
		this.name = name;
	}
	public Good() {
		
	}


//prints option
	public void say(){
		JOptionPane.showMessageDialog(null, "You consider yourself to be good");
		
	}



	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Thats good");
		
	}
}
