
/**
 * Pet class Driver
 * Creates array of 6 pet objects
 * Reads from file rescue.txt
 * Converts file text into Tokens, using comma as delimiter
 * Sets pet array from tokens 
 * Prints out the toString and the tokens
 * Runs equals check for first and second pet
 * Runs compareTo check for first and last pet
 * 
 *
 * @author Jack Ajizian
 * @version 8/3/2018
 */

import java.io.*;
import java.util.*;

//Driver class creation
public class Driver
{
    //main creation
    public static void main(String[] args) throws IOException
    {
        //creates Pet array named p, sets it to hold 6 elements
        Pet[] p = new Pet[6];
       
        //for loop that loops through the 6 array elements and creates 6 new Pet object references for each slot of array
        for(int i =0; i < p.length; i++)
        {
            p[i] = new Pet();
        }
        
        //Scanner variable, named input.  reads from rescue.txt file
        Scanner input = new Scanner(new File("rescue.txt"));
        //String variable for holding the text from rescue.txt file
        String text;
        
        //StringTokenizer variable creation, named tokens
        StringTokenizer tokens;
        //int j placeholder, used as a counter to while looping through text file
        int j = 0;
        
        //while loop creation, while scanner has more text to read and counter is less than the array length:
        while(input.hasNext() && j < p.length)
        {
            //sets String text to whatever the scanner reads next line
            text = input.nextLine();
            //uses second StringTokenizer method, params text from above as the String, and "," comma delimiter
            tokens = new StringTokenizer(text, ",");
            //array p at count j calls setAll method, converts tokens into String name, String type and double cost
            p[j].setAll(tokens.nextToken(), tokens.nextToken(), Double.parseDouble(tokens.nextToken()));
            
            //prints out the array at position j using toString method
            System.out.println(p[j].toString());
            //incrememnts counter j
            j++;
        }
        
        //equals test print out
        System.out.println("Equals test: ");
        //if else statement to check if pet 1 and 2 are the same calling the equals() method
        if(p[0].equals(p[1]))
        {
            //prints out if they are the same type and name
            System.out.println("Pet 1 and Pet 2 are the same type and name");
        }
        else
        {
            //prints out if they are not the same type and name
            System.out.println("Pet 1 and Pet 2 are not the same type and name");
        }
        
        //compareTo test print out
        System.out.println("\nCompare test: ");
        //if else if else statement to check if first pet is more expensive than last, less expensive, or if they are same cost
        if(p[0].compareTo(p[5]) > 0)
        {
            //prints if pet 1 is more expensive than pet 6
            System.out.println("Pet 1 costs more than Pet 6");
        }
        else if(p[0].compareTo(p[5]) < 0)
        {
            //prints if pet 1 costs less than pet 6
            System.out.println("Pet 1 costs less than Pet 6");
        }
        else
        {
            //prints if pet 1 and pet 6 are same price
            System.out.println("Pet 1 and Pet 6 cost the same");
        }
        
    }
}
