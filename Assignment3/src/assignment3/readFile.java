package assignment3;
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

/**
 * ASSIGNMENT 4 :: TEXT FILE
 * @author Eddiebaldo
 *
 */
public class readFile {

	private Scanner x;
	
	/**
	 * creates file orange
	 */
	public void openFile(){
		try{
			x = new Scanner(new File("C:\\Assignment4help\\src\\orange.txt"));
			
		}
		catch(Exception e){
			System.out.println("not found");
			
		}
	}
	/**
	 * prints data in orange file
	 */
		public void readFile(){
			while(x.hasNext()){
				String a = x.next();
				String b = x.next();
				String c = x.next();
				
				JOptionPane.showMessageDialog(null, a+ " " +b+ " "+ c);
			}
		}
		//closes file
		public void closeFile(){
			x.close();
		}

}
