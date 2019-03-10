
/**
 * This is lab 6
 * Reading and Writing to/from a file
 * @author Jack Ajizian
 * @version 7/18/2018
 */

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Driver
{
    public static void main (String[] args) throws IOException
    {
        Scanner input;
        String text;
        //char letter = 'A';
        //System.out.println((char)(letter + 1));
        
        //In the line blow, replace the "xxxxxxxx" with the
        //location and the name of the file you created using Notepad
        input = new Scanner(new File("sample.txt"));
        
        
        //create a Scanner object sending a File reference to the constructor
        //the hasNext( ) method of the Scanner class returns
        //true if there is more data in the file that has not
        //yet been read
        
        while(input.hasNext( ))
        //loop while there is more data to read
        {
            //read an entire line of text from the file
            //and print it to the screen
            System.out.println(input.nextLine( ));
        }
        
        
        input.close();
        //call the close method when done reading from the file
    }
}
