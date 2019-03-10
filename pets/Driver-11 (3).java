
/**
 * Pet class Driver
 *
 * @author Jack Ajizian
 * @version 7/20/2018
 */

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Driver
{
  public static void main(String[] args) throws IOException
  {
      Pet p1 = new Pet();
      Pet p2 = new Pet();
      Pet p3 = new Pet();
      Pet max;
      Pet min;
      
      Pet[] p = new Pet[3];
      for (int i = 0; i < p.length; i++)
      {
          p[i] = new Pet();
        }
      
      
      //read in data from rescue.txt
      String text;
      Scanner input = new Scanner(new File("rescue.txt"));
     
      
      //tokenizer
      StringTokenizer tokens;
      int j = 0;
   
        while(input.hasNext( ) && j < p.length)
        //loop while there is more data to read
        {
            text = input.nextLine();
            tokens = new StringTokenizer(text, " , ");
            p[j].setAll(tokens.nextToken(), tokens.nextToken(), Double.parseDouble(tokens.nextToken()));
           
            System.out.println(p[j].toString());
            j++;
            
            
        }
        
    
        if (p[0].equals(p[1]))
        {
            System.out.println("pet 1 and pet 2 are the same");
        }
        else
        {
            System.out.println("pet 1 and pet 2 are not the same");
        }
        
        
       //Write the code to determine the "greatest" Student object using the compareTo( ) method
       if(p[0].compareTo(p[2]) > 0 )
       {
           System.out.println("Pet 1 costs more than pet 3");
        
        }
        else if(p[0].compareTo(p[2]) < 0)
        {
            System.out.println("Pet 1 costs less than pet 3");
        
        }
        else 
        {
            System.out.println("pet 1 and pet 3 cost the same");
        }
       
        
       
        
        input.close();
        //call the close method when done reading from the file
      
      
  }
}
