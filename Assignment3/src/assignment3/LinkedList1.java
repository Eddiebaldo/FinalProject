package assignment3;
import java.util.*;

import javax.swing.JOptionPane;
/**
 * adds 2 lists in one
 * @author Eddiebaldo
 *
 */
/**
 * LinkedList java collections
 * @author Eddiebaldo
 *
 */
public class LinkedList1  {

	
	
	
	/**
	 * printMe method
	 * @param l
	 */
	public static void printMe(List<String> l ){
		for(String b: l)
			JOptionPane.showMessageDialog(null, b);
			
		
	}
	
	//removeStuff
	public static void removeStuff(List<String> l, int from, int to){
		l.subList(from, to).clear();
	}
	public static void reverseMe(List<String> l){
		ListIterator<String> iterator = l.listIterator(l.size());
		while(iterator.hasPrevious())
			JOptionPane.showMessageDialog(null,  iterator.previous());
		
	}
	
	
	
	
}
