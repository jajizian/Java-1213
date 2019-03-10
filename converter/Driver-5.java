
/**
 * Write a description of class Driver here.
 * Driver for converter of stringbuilder
 *Activity 5
 *
 * @author Jack Ajizian
 * @version 7/16/2018
 */

import java.io.*;
import java.util.*;
public class Driver
{
   public static void main(String[] args) throws Exception
   {
       Converter con = new Converter();
       String line;
       
       // String filename;
        
        Scanner keyboard;
        PrintWriter output; //used to write data to a file
        
        //open file to accept data
        output = new PrintWriter("sample.txt");
        
       
       //READ FILE
       Scanner input;
        char letter = 'A';
        System.out.println((char)(letter+1));
        
        //in line below, replace xxxxx with the location/name of file u made
        input = new Scanner(new File("sample.txt"));  
        //create a scanner objecting sending a file reference to the constructor
        //the hasNext() method of scanner class returns true if there is more data in the file that has not yet been read
        while (input.hasNext()) //loop while there is more data to read
        {
            line = input.nextLine();
            con.setSentence(line);
            con.Convert();
            output.println(con.toString());
            
        }
        input.close(); //call the close method when done reading from file
        
       
        
        keyboard = new Scanner(System.in);
      
        //consume remaining newline characer
        keyboard.nextLine();
        
           //get name and location to write the data to
        //remember location
        //System.out.println("Enter the location and mame of file to write to:");
        //filename = keyboard.nextLine();
       // filename = "C:/Users/jajizian/Documents/sample.txt";
        
       
        
        
        output.close();
        
        //inform task is done
        System.out.println("Data written to the file.");
        
    }
}
