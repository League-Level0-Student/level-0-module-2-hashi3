//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane; 



public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
	
	public static void main(String[] args) {
       int holder = 0;
       holder = new Random().nextInt(4);

    		System.out.println(holder); 
    		
    		JOptionPane.showInputDialog("ask me a question");
    		String message="";
    	
    	if(holder == 0) 
    	{ 
    		message = "yes";
    		
    	}
    	else if ( holder == 1)
    	{ 
    		JOptionPane.showMessageDialog(null, "no");
    		
    	}
    	
    	else if (holder == 2 )
    	{
    		message = "Maybe you should ask google";
    		

    	}
    	else {
    		message = " I don't know ";   		

    	}
    	JOptionPane.showMessageDialog(null, message);
    }

	private static void JOpshowInputDialog(String string) {
		// TODO Auto-generated method stub
		
	}
}
