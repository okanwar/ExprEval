/************************************************************************
* Name: Om Kanwar                                                 COMP 151
* Date: 9/19/17                                              Assignment #1
 
This program, ExprEval, reads in from the keyboard simple arithmetic
expressions and displays their value.
*************************************************************************
*/


import java.util.Scanner; //import packages necessary for code
import java.io.*;


public class ExprEval { //declare class name
	
	public static void main(String[] args)
			throws IllegalExprException {

		
	Scanner keyboard = new Scanner(System.in); // this allows input to be received from the keyboard
	String regex = "\\d+";
	
	
     while (true) // allows input to be looped, unless system is told to exit
     {	
    	 	System.out.println("Please enter input\n");
        	String text = keyboard.nextLine().trim();
  
  
        		 	
    if (text.isEmpty() && text == "") // exits if input is empty
    	System.exit(0);
    
    if(text.length() == 0)  //exits if only whitespace is in input
    		{System.exit(0);}
    
  try {
    
    
    	if (text.contains("-")) // Splits string if - is present
    		{ 
    		
    			String[] parts = text.split("(-)");
    			String part1 = parts[0]; 
    			String part2 = parts[1];
    			double input1 = Double.parseDouble(part1); //converts from string type to double type
    			double input2 = Double.parseDouble(part2);
    			double output = input1 - input2;
    			System.out.println(output);
    		
    		} //end of block
    	
    	else if (text.contains("+"))   // splits string if + is present
    	{
    		String[] parts = text.split("[+]");
    		String part1 = parts[0]; 
    		String part2 = parts[1];
    		double input1 = Double.parseDouble(part1); //converts from string type to double type
    		double input2 = Double.parseDouble(part2);
    		double output = input1 + input2;
    			System.out.println(output);
    	} //end of block
    	
    		
    	else if(!text.isEmpty() & (text.matches(regex))) //outputs input in double format if no operators present
    			{	
    				double input1 = Double.parseDouble(text);
    				System.out.println(input1);
    			}  //end of block
    
    else {
    	throw new IllegalExprException();
    }
  } //end of try
   catch (Exception e) {
	  System.out.println("Invalid Expression");
  } 
     } //end of while loop	  
  
} //end of main
} //end of class