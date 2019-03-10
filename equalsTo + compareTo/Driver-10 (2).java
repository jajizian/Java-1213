import java.io.*;
import java.util.*;

/**
 * This is a driver class used to
 * test the methods of the Student class
 * in learning about equals( ) amd compareTo( )
 * 
 * @author Jack Ajizian
 * @version 7/20/2018
 */
public class Driver
{
    
    public static void main(String[ ] args)throws IOException
    {
        Student s1; //reference variable will hold the address of a Student object
        Student s2; //reference variable will hold the address of a Student object
        Student s3; //reference variable will hold the address of a Student object
        //added fields
        Student max;
        Student min;
        //write the code to create the three Student objects using the constructor that accepts all the values
        
        s1 = new Student("Smith", "Joe", 0001, 3.5, 70); 
        s2 = new Student("Smith", "Alex", 0002, 2.9, 60); 
        s3 = new Student("Jones", "Bill", 0001, 4.0, 90); 
        
        
        
        //write the code to determine if s1 and s3 should be considered equal. Be sure to test
        //scenarios where they are equal and where they are not equal. Also, print results
        if (s1.equals(s3))
        {
            System.out.println(s1.toString() + " is considered equal to: \n" +
                                s3.toString());
        }
        else
        {
            System.out.println(s1.toString() + " is not considered equal to: \n" + 
                                s3.toString());
        }
        
        
       //Write the code to determine the "greatest" Student object using the compareTo( ) method
       if(s1.compareTo(s2) > 0 )
       {
           max = s1;
        }
        else
        {max = s2;
        }
        if(s3.compareTo(max) > 0)
        {
            max = s3;
        }
        System.out.println("The max of s1, s2, and s3 is: " + max.toString());
       
       //Write the code to determine the "least" Student object using the compareTo( ) method
         if(s1.compareTo(s2) < 0 )
       {
           min = s1;
        }
        else
        {min = s2;
        }
        if(s3.compareTo(min) < 0)
        {
            min = s3;
        }
        System.out.println("The min of s1, s2, and s3 is: " + min.toString());
       
        
        

  }//end of main( )
}