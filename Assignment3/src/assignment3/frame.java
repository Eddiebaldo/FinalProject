package assignment3;

/**COVERS ASSIGNMENT 1, 2, 3 AND 4 AND FINAL
 * 
 */








/**IMPORTS TO USE 
 * 
 */

import gender.Female;
import gender.Gender;
import interfaceImplementation.Bad;
import interfaceImplementation.Good;
import interfaceImplementation.Info;

import javax.swing.*;

import animation.Aph;

import data.Address;
import data.Attendance;
import data.DateTime;
import data.data;
import data.validate;
import data.validateId;
import emailClasses.emailGmail;
import emailClasses.emailYahoo;
import emailClasses.preferredEmail;













import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class frame extends JFrame{

	
	/**
	 * NEW OBJS TO USE FROM OTHER CLASSES
	 */
	validate validateObj = new validate();
	validateId validateIdObj = new validateId();
	DateTime DateTimeObj = new DateTime();
	Female FemaleObj = new Female ();
	Gender GenderObj = new Gender();
	readFile readF = new readFile();
	
	
	/**
	 * ASSIGNMENT 3 ::: For Window 10 button "Play with Circle",  Pulls slider
	 */
	TheWindow w = new TheWindow();
	
String request ="";
String FirstName = "";
String LastName = "";
String Gender = "";
String Email = "";
String Id = "";
String survey = "";


String StNumber = "";
String StName = "";
String AptNumber = "";
String City = "";
String State = "";
String ZipCode = "";

String DateTime="";
String AId="";


/**
 * ARRAYLISTS TO SAVE DATA
 */
ArrayList <data> data = new ArrayList <data>();
ArrayList <Address> Address = new ArrayList <Address>();
ArrayList <Attendance> Attendance = new ArrayList <Attendance>();
	
	
		  /**Standard Window
		   * 
		   */
	      
	      JFrame frame0 = new JFrame("Eddie's Club");
	      JPanel pane0 = new JPanel();
          JPanel buttonPanel0 = new JPanel();
	      JLabel p0 = new JLabel("What would you like to do? ");
	     
	     
	      
	      /**ASSIGNMENT 3 :: For Window 10 button "Play with Circle" :: Frame for Button "Play with Circle"
	       * 
	       */
	      JFrame frame10 = new JFrame("Play with Circle");
	      JPanel pane10 = new JPanel();
	      JPanel buttonPanel10 = new JPanel();
	      JLabel p10 = new JLabel("Play with Circle");
	      
        /**This is what demo takes and runs as aCal
         * 
         */
	       public frame() {
	     
	    	 /**
	    	  * Standard window  
	    	  */
	    	 frame0.setLayout(new BorderLayout() );
	    	 frame0.add(pane0, BorderLayout.NORTH);
	    	 frame0.add(buttonPanel0, BorderLayout.CENTER);
	         frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         frame0.setSize(800,600);
	         frame0.setVisible(true);
	         pane0.add(p0); 
	         
	         
             /**ASSIGNMENT 3 ::: For Window 10 button "Play with Circle" :: Window for Button "Play with Circle
              * 
              */
	         frame10.setLayout(new BorderLayout());
	         frame10.add(pane10, BorderLayout.NORTH);
	         frame10.add(buttonPanel10, BorderLayout.CENTER);
	         frame10.setSize(700, 500);
             frame10.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             frame10.setVisible(false);
             pane10.add(p10);
             
	       
	         
             /**
              * Standard window :: buttonPanel layout 
              */
             buttonPanel0.setLayout(new GridLayout(0,3));
	         			
	         /**
	          * buttons and their actions 
	          */
	         JButton b1 = new JButton ("Enroll");
	         b1.setActionCommand("Enroll");
	         b1.addActionListener(new button1ActionFor1stWindow());
	         
	         JButton b2 = new JButton ("Unenroll");
	         b2.setActionCommand("Unenroll");
	         b2.addActionListener(new button2ActionFor2ndWindow());
	         
	         JButton b3 = new JButton ("Check Enrollments");
	         b3.setActionCommand("Check Enrollments");
	         b3.addActionListener(new button3ActionFor3rdWindow());
	         
	         JButton b4 = new JButton ("Loggin your attendance");
	         b4.setActionCommand("Loggin your attendance");
	         b4.addActionListener(new button4ActionFor4thWindow());
	        
	         JButton b5 = new JButton ("Check Loggins");
	         b5.setActionCommand("Check Loggins");
	         b5.addActionListener(new button5ActionFor5thWindow());
	         
	         JButton b6 = new JButton ("Graphics");
	         b6.setActionCommand("Graphics");
	         b6.addActionListener(new button6ActionFor6thWindow());
	         
	         JButton b7 = new JButton ("Interface");
	         b7.setActionCommand("Interface");
	         b7.addActionListener(new button7ActionFor7thWindow());
	         
	         JButton b8 = new JButton ("Html Applet");
	         b8.setActionCommand("Html Applet");
	         b8.addActionListener(new button8ActionFor8thWindow());
	         
	         JButton b9 = new JButton ("Encryption");
	         b9.setActionCommand("Encryption");
	         b9.addActionListener(new button9ActionFor9thWindow());
	         
	         JButton b10 = new JButton ("Play with Circle");
	         b10.setActionCommand("Play with Circle");
	         b10.addActionListener(new buttonActionForButtonPlayWithCircle());
	         
	         JButton b11 = new JButton ("Animation");
	         b11.setActionCommand("Animation");
	         b11.addActionListener(new clearAction());
	         
	         JButton b12 = new JButton ("Survey");
	         b12.setActionCommand("Survey");
	         b12.addActionListener(new button12ActionFor12thWindow());
	         
	         JButton b13 = new JButton ("Search");
	         b13.setActionCommand("Search");
	         b13.addActionListener(new button13ActionFor13thWindow());
	         
	         JButton b14 = new JButton ("Sort");
	         b14.setActionCommand("Sort");
	         b14.addActionListener(new button14ActionFor14thWindow());
	       
	         /**
	          * Standard Window : Adds buttons to buttonPanel 
	          */
	         buttonPanel0.add(b1);
	         buttonPanel0.add(b2);
	         buttonPanel0.add(b3);
	         buttonPanel0.add(b4);
	         buttonPanel0.add(b5);
	         buttonPanel0.add(b6);
	         buttonPanel0.add(b7);
	         buttonPanel0.add(b8);
	         buttonPanel0.add(b9);
	         buttonPanel0.add(b11);
	         buttonPanel0.add(b10);
	         buttonPanel0.add(b12);
	         buttonPanel0.add(b13);
	         buttonPanel0.add(b14);
	       
	         
	 }
	       class button14ActionFor14thWindow implements ActionListener {
		    	  public void actionPerformed(ActionEvent e){
		    		  String buttonPressed = e.getActionCommand();
		    		  if (buttonPressed.equalsIgnoreCase("Sort")){
		    			  
		    			//SORT BY ID
		    				ArrayList unsortList = new ArrayList();
		    				for (int y = 0; y<data.size(); y++ ){
		    					//unsortList.add(data.get(y).toString());
		    					unsortList.add(data.get(y).IdOnly());
		    					System.out.println(data.get(y).toString());
		    				
		    				System.out.println("before");
		    					for(Object str : unsortList){
		    						System.out.println(str);
		    					}
		    					Collections.sort(unsortList);
		    					
		    					System.out.println("after");
		    					for(Object str : unsortList){
		    						System.out.println(str);
		    					}
		    				}
		    			  
		    		  }
		    	  }
	       }
	       
	       class button13ActionFor13thWindow implements ActionListener {
		    	  public void actionPerformed(ActionEvent e){
		    		  String buttonPressed = e.getActionCommand();
		    		  if (buttonPressed.equalsIgnoreCase("Search")){
		    				//search array by first name
		    				//String search = JOptionPane.showInputDialog(null, "what to search");
		    				String search ="";
		    				search = JOptionPane.showInputDialog(null, "what to search");
		    				
		    				for (int y=0; y<data.size(); y = y+1){
		    					if(search.equalsIgnoreCase(data.get(y).getFirstName())){
		    						//System.out.println("this is it"+ data.get(y).toString());
		    						JOptionPane.showMessageDialog(null, "this is the name "+data.get(y).getFirstName() + data.get(y).toString());
		    					}
		    				}
		    				
		    				
		    			}
		    	  
		    	  }
	       }
	       
	       //ASSIGNMENT 3 :: ANIMATION
	      //this controls the clear button is pressed it clears the text box 
	      class clearAction implements ActionListener {
	    	  public void actionPerformed(ActionEvent e){
	    		  String buttonPressed = e.getActionCommand();
	    		  if (buttonPressed.equals("Animation")) {
	    			  DisplayMode displayMode = new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
	    				Aph b = new Aph();
	    				b.run(displayMode);
	                      
	               }
	    	  }
	    	  
	      }
	     
	      /**
	       * ASSIGNMENT 3 :: HTML APPLET
	       * @author Eddiebaldo
	       *
	       */
	      class button8ActionFor8thWindow implements ActionListener {
	    	  public void actionPerformed(ActionEvent e){
	    		  String button8PressedFor8thWindow = e.getActionCommand();
	    		  if (button8PressedFor8thWindow.equals("Html Applet")){
try{
String htmlFilePath = "C:/Assignment4/bin/index.html"; // path to  new file
File htmlFile = new File(htmlFilePath);


/** open the default web browser for the HTML page
 * 
 */
Desktop.getDesktop().browse(htmlFile.toURI());
}catch(java.io.IOException f ){
	
}			  
	    		  }
	    	  }
	      }

	      /**checks enrollments
	       * 
	       * @author Eddiebaldo
	       *
	       */
	      class button3ActionFor3rdWindow implements ActionListener {
	    	  public void actionPerformed(ActionEvent e){
	    		  String button3PressedFor3rdWindow = e.getActionCommand();
	    		  
	      
	      if (button3PressedFor3rdWindow.equals("Check Enrollments")){
				
				if(data.size()==0){
				JOptionPane.showMessageDialog(null, "No One is Enrolled");
				
				
						
			}else{
				
				for (int y = 0; y<data.size(); y++ ){
JOptionPane.showMessageDialog(null, "Current Students Enrolled:" +data.get(y).IdOnly());
					
Id = JOptionPane.showInputDialog(null,"To view more info enter student ID: ");
					
					if(validateIdObj.IdCheck(Id).equals("Valid Student ID")){
						JOptionPane.showMessageDialog(null,"Current Students:"+ data.get(y).toString());
						
					
				}
			}
				
			}}}}
	      
	      /**ASSIGNMENT 3 :: INTERFACE
	       * 
	       * @author Eddiebaldo
	       *
	       */
	      class button7ActionFor7thWindow implements ActionListener {
	    	  public void actionPerformed(ActionEvent e){
	    		  String button3PressedFor3rdWindow = e.getActionCommand();
	    		  
	      if (button3PressedFor3rdWindow.equals("Interface")){
	    	  
	    	  
	    	  Good good1 = new Good();
	    		good1.say();
	    		
	    		String ten = JOptionPane.showInputDialog(null, "Is this true");
	    		
	    		if (ten.equalsIgnoreCase("yes")){
	    			Good good2 = new Good("Awesome");
	    			good2.say();
	    			Info info1 = new Good();
	    			info1.showInfo();
	    		}
	    		Bad bad1 = new Bad();
	    		bad1.tell();
	    		
	    		
	    		
	    		Info info2 = good1;
	      }
	      }
	      }
	 
	      class button9ActionFor9thWindow implements ActionListener {
	    	  public void actionPerformed(ActionEvent e){
	    		  String button9PressedFor9thWindow = e.getActionCommand();
	    		  
	    		  
	    		  if (button9PressedFor9thWindow.equals("Encryption")){
	    			/**
	    			 * ASSIGNMENT 4 :: OBJECT FILE, use of animal and age
	    			 */
		  				/**ASSINGMENT 4 :: EXCEPTIONS
		  				 * 
		  				 */
		  				animalAndAge  a = new animalAndAge();
		  				String animal;
		  				a.animal = JOptionPane.showInputDialog("Favorite animal:");
		  				int ageOfStudent;
		  				a.age = Integer.parseInt( JOptionPane.showInputDialog("How old are you?:"));
		  				
		  				//ASSIGNMENT 4 :: ENCRYPTION
		  				JOptionPane.showMessageDialog(null, "We are going to encrypt the name of your favorite animal");
		  				String passcode = Bitshifter.encrypt(a.animal);
		  				JOptionPane.showMessageDialog(null,"encrypted " + passcode);
		  				JOptionPane.showMessageDialog(null,"decrypted " + Bitshifter.decrypt(passcode));
		  				
		  				
		  				
		  				String fileName = "C:\\Assignment4help\\src\\animalAndAge.txt";
		  				try {
		  					ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
		  					os.writeObject(a);//write object
		  					os.close();
		  				} catch (FileNotFoundException r) {
		  					// TODO Auto-generated catch block
		  					r.printStackTrace();
		  				} catch (IOException r) {
		  					// TODO Auto-generated catch block
		  					r.printStackTrace();
		  				}
		  				
		  				
		  				try {
		  					ObjectInputStream is = new ObjectInputStream (new FileInputStream(fileName	));
		  					animalAndAge p = (animalAndAge) is.readObject();//reads object
		  					JOptionPane.showMessageDialog(null,"Favorite Animal " + p.animal);
		  					is.close();
		  				} catch (FileNotFoundException re) {
		  					// TODO Auto-generated catch block
		  					re.printStackTrace();
		  				} catch (IOException re) {
		  					// TODO Auto-generated catch block
		  					re.printStackTrace();
		  				} catch(ClassNotFoundException re){
		  					re.printStackTrace();
		  				}
		  				
		  			/**
		  			 * ASSIGNMENT 4 END:: OBJECT FILE, use of animal and age
		  			 */
		  			/**
		  			 * ASSINGMENT 4 END:: EXCEPTIONS
		  			 */
	    		  }
	    	  }
	      }
	      
	      
	      /**
	       * this controls the action when 1st button is pressed
	       * @author Eddiebaldo
	       *
	       */
	      class button1ActionFor1stWindow implements ActionListener {
	    	  public void actionPerformed(ActionEvent e){
	    		  String button1PressedFor1stWindow = e.getActionCommand();
	    		  
	    		  
	    		  if (button1PressedFor1stWindow.equals("Enroll")){
	    			  
	    			/**
	    			 * ASSIGNMENT 4 :: HASHMAP java collections
	    			 */
	    			  HashMap<Integer, String> map = new HashMap<Integer, String>();
	    				
	    				map.put(1, "We will need name");
	    				map.put(2, "We will need address");
	    				map.put(3, "We will ask some questions");
	    				map.put(4, "It should take around 20 mins");
	    				
	    				
	    				
	    				
	    				for(Map.Entry<Integer, String> entry : map.entrySet()){
	    					int key = entry.getKey();
	    					String value = entry.getValue();
	    					
	    					JOptionPane.showMessageDialog(null, key + " : " + value);
	    				
	    					
	    				}
	    			  
	    			  
	    			  FirstName = JOptionPane.showInputDialog("Please enter your first name:");
	  				LastName = JOptionPane.showInputDialog("Please enter your last name:");
	  				
	  				
	  				
	  				
	  				
	  				/**name what is not a fruit
	  				 * 
	  				 */
	  				/**
	  				 * ASSIGNENT 4 :: LINKEDLIST java collections
	  				 */
	  				JOptionPane.showMessageDialog(null, "Write the ones that are not fruits");
	  				String[] things1 = {"apples", "nuts", "orange", "bananas" };
	  				List<String> list1 = new LinkedList<String>();
	  				for(String x: things1)
	  					list1.add(x);
	  				
	  				String[ ] things2 = {"sausage", "bacon", "goats", "grapes"};
	  				List<String > list2 = new LinkedList<String>();
	  				
	  				for(String y : things2)
	  					list2.add(y);
	  				list1.addAll(list2);
	  				list2 = null;
	  				
	  				LinkedList1 link = new LinkedList1();
	  				link.printMe(list1);
	  				//link.removeStuff(list1, 2,5);
	  				//link.printMe(list1);
	  				//link.reverseMe(list1);//reverse and print
	    		  
	  			
	  				/**
	  				 * ASSIGNMENT 4 :: HASHSET java collections
	  				 */
	  				String fruits1;
	  				String fruits2;
	  				String fruits3;
	  				
	  				fruits1 = JOptionPane.showInputDialog("What is one of the items that is not a fruit: ");
	  				fruits2 = JOptionPane.showInputDialog("What is another item that is not a fruit: ");
	  				fruits3 = JOptionPane.showInputDialog("Name one more please:\n" + "if you can't remember, repeat one of your previous answers");
	  				String[ ] things = {fruits1, fruits2, fruits3};
	  				List<String> list = Arrays.asList(things);
	  				
	  				
	  				/**
	  				 * it deletes duplicates from list
	  				 */
	  				Set<String> set = new HashSet<String>(list);
	  				JOptionPane.showInputDialog("These are the ones you could see, right?" , set);
	  			
	  			/**
	  			 * ASSIGNMENT 4 END:: HASHSET java collections
	  			 */
	  				
	  				/**ASSIGNMENT 3 :: INHERITANCE
	  				 * 
	  				 */
	  				Gender = JOptionPane.showInputDialog("Are you a female or male");
	  				
	  				if(Gender.equalsIgnoreCase("female")){
						FemaleObj.GenderQ();
						
					}else {
						GenderObj.GenderQ();
					}
	  				
	  				
	  				JOptionPane.showMessageDialog(null, "We're going to need your email");
	  				
	  				preferredEmail sEmail[] = new preferredEmail[2];
	  				/**
	  				 * Polymorphism Arrays
	  				 */
	  				sEmail[0] = new emailYahoo();
	  				sEmail[1] = new emailGmail();
	  				
	  				for(int x=0; x<2; ++x){
	  					sEmail[x].suggestedEmail();
	  					
	  				}
	  				/**
	  				 * Enumerator
	  				 */
	  				for(EnumEx people: EnumEx.values())
	  					 JOptionPane.showMessageDialog(null, people.getnameE());
	  			/**
	  			 * ASSIGNMENT 3 :: INHERITANCE
	  			 */
	  				
	  				Email = JOptionPane.showInputDialog("Pleas enter your email:");
	  				
	  				Id = JOptionPane.showInputDialog("Pleas enter your student ID:");	  
	  				String t = JOptionPane.showInputDialog("Would you like to provide your Address?\n" + "y - yes\n" + "n -no\n");
	  				
	  				if (t.equalsIgnoreCase("y")){
	  					/**
	  					 * ASSIGNMENT 4 :: EXCEPTION
	  					 */
	  					int x = 1;
	  					try{
	  					x = Integer.parseInt( JOptionPane.showInputDialog("press 1 to continue"));
	  					}catch(Exception error){
	  						JOptionPane.showInputDialog("You can't do that");
	  						
	  					}	
	  					
	  					StNumber = JOptionPane.showInputDialog("Please enter your Street Number: ");
	  					
	  					StName = JOptionPane.showInputDialog("Please enter your Street Name: ");
	  					
	  					AptNumber = JOptionPane.showInputDialog("Type 'n/a' if you don't have one/n" +"Please enter your Apt Number: ");
	  					
	  					JOptionPane.showMessageDialog(null, "We're going to need your City Name");
	  				
	  					JOptionPane.showMessageDialog(null, "If you don't live in one of this cities you can't participate" );
	  					
	  					/**
	  					 * ASSIGNMENT 4 :: TEXT FILE
	  					 */
	  					readF.openFile();
	  					readF.readFile();
	  					readF.closeFile();
	  					
		  				
		  				
	  					City = JOptionPane.showInputDialog("Please enter your City Name: ");
	  					
	  					
	  					State = JOptionPane.showInputDialog("Please enter your State Name: ");
	  					
	  					ZipCode = JOptionPane.showInputDialog("Please enter your ZipCode Name: ");
	  					
	  					
	  					data valid = new data(FirstName, LastName, Email, Id, Gender);
						data.add(valid);
	  				
	  					Address validforAddress = new Address(StNumber,StName, AptNumber, City, State, ZipCode);
	  					Address.add(validforAddress);
	  					for (int y = 0; y<Address.size() && y<data.size(); y++  ){
	  						JOptionPane.showMessageDialog(null, Address.get(y).toString());
	  						JOptionPane.showMessageDialog(null,data.get(y).toString() );
	  					}
	  					}else {
	  						JOptionPane.showMessageDialog(null, "Thank You for Enrolling");
	  					}
	  				
	  				if ((validateObj.NameCheck(FirstName).equals("Valid Name"))
							&& (validateObj.NameCheck(LastName)
									.equals("Valid Name"))
							&& (validateObj.EmailCheck(Email)
									.equals("Valid Email"))
							&& (validateIdObj.IdCheck(Id)
									.equals("Valid Student ID"))) {
						data valid = new data(FirstName, LastName, Email, Id, Gender);
						data.add(valid);
						
						for (int y = 0; y<data.size(); y++ ){
							JOptionPane.showMessageDialog(null, "Current Student: " + data.get(y).toString());
						
						}
						}else{
							JOptionPane.showMessageDialog(null,"not valid info");
						}JOptionPane.showMessageDialog(null,
								"thank you for enrolling\n" + "Added Address\n"
										+ Address.toString());
						JOptionPane.showMessageDialog(null,
								"thank you for enrolling\n" + "Added Info\n"
										+ data.toString());

					}
	    		  
	    		  
	    		  
	    	  }
	      }
	      
	      /**
	       * ASSIGNMENT 3 :: GRAPHICS
	       * @author Eddiebaldo
	       *
	       */
	      class button6ActionFor6thWindow implements ActionListener{
	    	  public void actionPerformed(ActionEvent e){
	    		  String button1PressedFor1stWindow = e.getActionCommand();
	    		  
	    		  
	    		  if (button1PressedFor1stWindow.equals("Graphics")){
	    		  
	    			  JFrame f = new JFrame("Graphics");
	    			  f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    			  GraphicsEx p = new GraphicsEx();
	    			  f.add(p);
	    			  f.setSize(400, 250);
	    			  f.setVisible(true);
	    		  
	    		  }
	    	  }
	      }
	      
	      //ASSIGNMENT 3 :: APPLET AND SLIDER
	      //this controls the play with circle button
	      class buttonActionForButtonPlayWithCircle implements ActionListener {
	    	  public void actionPerformed(ActionEvent e){
	    		  String buttonPlayWithCirclePressedFor1stWindow = e.getActionCommand();
	    		  
	    		  //this is where the action happens
	    		  if (buttonPlayWithCirclePressedFor1stWindow.equals("Play with Circle")){
	    			  
	    			  	w.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    				w.setSize(230,280);
	    				w.setVisible(true);
	    			  
	    			  
	    		  } 
	    	  }  
	      }
	      
	      /**
	       * ASSIGNMENT 3 :: OVERLOADING
	       * @author Eddiebaldo
	       *
	       */
	      /**
	       * this controls the survey button
	       * @author Eddiebaldo
	       *
	       */
	      class button12ActionFor12thWindow implements ActionListener {
	     
	    	  public void actionPerformed(ActionEvent e){
	    		  String button12PressedFor12thWindow = e.getActionCommand();
	    		  
	    		  //this is where the action happens
	    		  if (button12PressedFor12thWindow.equals("Survey")){
	    			  
	    			  JOptionPane.showMessageDialog(null, "Please help us with Eddie's Club description/rate");
	    			  
	    			  surveyRating.surveyRating(8);
	        		 try{ 
	        		  survey =  JOptionPane.showInputDialog("Please write 1 for 'yes' or 2 for 'no' ");
	        		  if(survey.equals( 1)){
	  					JOptionPane.showMessageDialog(null, "Thank you");
	  				}
	  				else{
	  					survey =  JOptionPane.showInputDialog("Please describe Eddie's Club in one word \n");
	  					
	  					surveyRating.surveyRating(survey, "Thank you");		
	  				}
	    		  } catch(Exception errorForLogin){
			    		  JOptionPane.showMessageDialog(null, "You need a correct email");
			    	 
	    		  }
	        	  }
	          
	          
	          	}
	     
	      }  

	      /**
	       * this controls the check loggins button
	       * @author Eddiebaldo
	       *
	       */
	      class button4ActionFor4thWindow implements ActionListener {
	     
	    	  public void actionPerformed(ActionEvent e){
	    		  String button4PressedFor4thWindow = e.getActionCommand();
	    		  
	    		  //this is where the action happens
	    		  if (button4PressedFor4thWindow.equals("Loggin your attendance")){
	    			  
	    			  JOptionPane.showMessageDialog(null, "You will need your student ID");
	    			  
	    			  AId = JOptionPane.showInputDialog( "Please enter your student ID");
	    			 
	    			  if(validateIdObj.IdCheck(AId).equals("Valid Student ID")){
	    				  JOptionPane.showMessageDialog(null,  " Logged in" + DateTimeObj.getDateTime() );
	    				  DateTime = DateTimeObj.getDateTime(); 
	    				  Attendance validforAttendance = new Attendance(DateTime, AId);
	    				  Attendance.add(validforAttendance);
	    				  JOptionPane.showMessageDialog(null, "Thank You for Checking in");
	    			  
	    				  for (int y = 0; y<Attendance.size() ; y++  ){
	    					  JOptionPane.showMessageDialog(null,"Checked in: " + Attendance.get(y).toString()) ;}
	    				  }
	    		
	    					}
	    		  
	    	  
	    		  
	    			  
	    		  
	    	  }
	    	  
				
	     
	      }
	     
	      /**
	       * this controls the loggins
	       * @author Eddiebaldo
	       *
	       */
	      class button5ActionFor5thWindow implements ActionListener {
	    	  public void actionPerformed(ActionEvent e){
	    		  String button5PressedFor5thWindow = e.getActionCommand();
	    		  
	    		  //this is where the action happens
	    		  if (button5PressedFor5thWindow.equals("Check Loggins")){
	    			
	    				
	    				if(Attendance.size()==0){
	    				JOptionPane.showMessageDialog(null,"No One Has Checked in yet");
	    				
	    		  }else{
	    			  
	    				for (int y = 0; y<Attendance.size(); y++ ){
	    					JOptionPane.showMessageDialog(null,"Current Students Checked in:" + Attendance.get(y).AIdOnly());
	    					AId = JOptionPane.showInputDialog("To view more info enter student ID: ");
	    					
	    					if(validateIdObj.IdCheck(AId).equals("Valid Student ID")){
	    						JOptionPane.showMessageDialog(null,"Date and Time for Check ins:" + Attendance.get(y).toString());
	
	    					}
	    					}
	    			}
	    			  
	    		  	}
	    		  
	    		 }
	      }
	      
	      /**
	       	* this controls the action when 2nd button is pressed
	     	*
	     	*/
	      class button2ActionFor2ndWindow implements ActionListener {
	    	  public void actionPerformed(ActionEvent e){
	    		  String button2PressedFor2ndWindow = e.getActionCommand();
	    		  
	    		
	    		  
	    		  if (button2PressedFor2ndWindow.equals("Unenroll")){
	    				boolean found = false;
	    				Id = JOptionPane.showInputDialog("Please enter student ID");

	    				if (validateIdObj.IdCheck(Id).equals("Valid Student ID")) {
	    					 for(int y = 0; y<data.size(); y++){
	    					if (Id.equals(Id)) {
	    						Id = JOptionPane.showInputDialog(null, "are you sure"
	    								+ "y=yes");
	    						switch (Id) {
	    						case "y":
	    							data.remove(Id);
	    							found = true;
	    							JOptionPane.showMessageDialog(null, "deleted");
	    							break;
	    						default:
	    							JOptionPane.showMessageDialog(null, "not deleted");

	    						}

	    					}

	    				 else {
	    					JOptionPane.showMessageDialog(null, "not valid ID");
	    					found = true;
	    				}
	    				if (found == false) {
	    					JOptionPane.showMessageDialog(null, "It doesn't exist");
	    				}}
	    		  
	    		  
	    		  
	    		  
	    		  
	    	  } 
	    			 
	    		  }
	    		 

	      
}}}

	      
       
	       
	       
	       
	       
	       
	     
	      
