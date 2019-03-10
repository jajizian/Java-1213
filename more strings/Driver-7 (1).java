
/**
 * lab 6 part 3
 * output file
 *
 * @author jack ajizian
 * @version 7/18/2018
 */
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Driver
{
    public static void main (String[] args) throws IOException
    {
        
        String text;    // Friend's name
        //int numFriends;       // Number of friends
        Scanner keyboard;    //will be used to get input from the user
        PrintWriter output;   //will be used to write data to a file
        
        // Create a Scanner object for keyboard input.
        keyboard = new Scanner(System.in);
     
        
    
        // Open the file to accpet data
        output = new PrintWriter("sample2.txt");
        //Get data from user and write it to the file.
        
        // Get the number of friends.
       // System.out.print("Enter line 1 to your file: ");
        //text = keyboard.nextLine();
        
        for (int i = 1; i < 8; i++)
        {
            // Get the name of a friend.
            System.out.print("Enter line " + i + " into your text file: ");
            text = keyboard.nextLine();
            // Write the friend's name to the file.
            //Notice this is very similar to System.out.println
            
            output.println(text);
        }
// Close the file so the end of file marker is written//to the data file
output.close();
//inform the user the task is complete
System.out.println("Data written to the file.");
    }
}
