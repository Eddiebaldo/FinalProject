package assignment3;

/**
 * ASSIGNMENT 3 :: OVERLOADING
 */
import javax.swing.JOptionPane;

public class surveyRating {

	public static void surveyRating(int a){
		
		JOptionPane.showMessageDialog(null, "Is this an accurate rating of Eddie's Club :\n " + a);
		
	}
	public static void surveyRating(String a , String b){
		
		JOptionPane.showMessageDialog(null,"Thank you for describing Eddie's Club with this kind word:\n"+ a );
		
		JOptionPane.showMessageDialog(null,b + " for your time");
	}
}
