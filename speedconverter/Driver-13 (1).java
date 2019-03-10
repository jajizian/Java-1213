
/**
 *Driver for SpeedConverter
 *allows user to enter a mph value and displays the other variables accordingly
 *
 * @author Jack Ajizian
 * @version 7/23/2018
 */

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Driver
{
   public static void main(String[] args) throws IOException
   {
       //keyboard scanner
       Scanner kb = new Scanner(System.in);
       
       //double variable for user input
       //initialized at 0 so speedconverter instance initializes
       double mph=0;
       
       //creation of speedconverter instance, using default constructor as asked
       SpeedConverter test = new SpeedConverter();
       
       //end variable for ending the loop
       char end = 'Q';
       //goAgain variable for continuing loop
       char goAgain = ' ';
       
       
       //loop begins, any entries will continue it as long as the user does not enter Q
       while (goAgain != 'Q')
       {
           //ask user for speed in mph they would like to test
           System.out.println("Please enter the speed in miles per hour you would like to test: ");
           //set mph to what they input
           mph = kb.nextDouble();
           
           //run setMPH method via test instance
           test.setMPH(mph);
           
           //print out the values based off what the user entered, calling the toString method via test instance
           System.out.println(test.toString());
           
           //ask user to go again or close the program
           System.out.println("\nEnter any character or digit to continue.  \nEnter a Q to close the program." +
                               "\nThe Q must be capitalized!");
                               
           //ensures users next input is not Q in order to continue looping                    
           goAgain = kb.next().charAt(0);
           
        
        }
       
        //goodbye message when user closes program
        System.out.println("Goodbye!");
    }
}
