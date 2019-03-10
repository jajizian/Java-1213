
/**
 * lab 6 step 4
 * read one line of data from a file at a time
 *
 * @author Jack Ajizian
 * @version 7/18/2018
 */

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Driver
{
    public static void main (String[] args) throws IOException
    {
        char stringe = 'e';
        char stringE = 'E';
        int counte = 0;
        int countE = 0;
        int numVowel=0;
        char blank = ' ';
        int blankCount=0;
        String upperCase;
        
        String text = new String();
        String bigString = "";
        Scanner keyboard;    //will be used to get input from the user
        PrintWriter output;   //will be used to write data to a file

        // Create a Scanner object for keyboard input.
        keyboard = new Scanner(System.in);

    
        // Open the file to accpet data
        output = new PrintWriter("sample2.txt");
        //Get data from user and write it to the file.
        
        //print the 7 lines of data into the notepad file
         for (int i = 1; i < 8; i++)
        {
            // Get the name of a friend.
            System.out.print("Enter line " + i + " into your text file: ");
            text = keyboard.nextLine();
            bigString += text;
           
            output.println(text);
        }

        //prints location of e
        //System.out.println("Your first occurence of \"e\" is at location index " + text.indexOf('e'));

        //prints number of times "e" is in your string     
        for (int i=0; i<bigString.length(); i++)

        {

            if(bigString.charAt(i) == stringe)

            {

                counte++;

            }

        }
        System.out.println("Your string contains " + counte + " e's");
        
        //counts and prints E's
        for (int i=0; i<bigString.length(); i++)

        {

            if(bigString.charAt(i) == stringE)

            {

                countE++;

            }

        }
        System.out.println("Your string contains " + countE + " E's");
        
        //count and print number of vowels
        for (int i=0; i<bigString.length(); i++)

        {
            switch(bigString.charAt(i))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                
                numVowel++;
                break;
                
            }

            

        }
        System.out.println("Your string contains " + numVowel + " vowels.");
        
        //print number of characters in file
        System.out.println("The file contains " + bigString.length() + " characters, including 'blanks'");
       
        //count and print number of times a non-space character is preceded by a space character
        for (int i=0; i<bigString.length(); i++)

        {

            if(bigString.charAt(i) == blank)

            {

                blankCount++;

            }

        }
        System.out.println("The file has " + blankCount + " chars followed by a space.");
        
        //print contents of file on screen in all caps
        System.out.println("The file in full caps is " +bigString.toUpperCase());
        
        


       
        // Close the file so the end of file marker is written//to the data file
        output.close();
        //inform the user the task is complete
        System.out.println("Data written to the file.");
    }
}
