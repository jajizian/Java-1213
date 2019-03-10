
/**
 * Write a description of class Driver here.
 *
 * @author jack ajizian
 * @version 8/6/2018
 */

import java.io.*;
import java.util.*;

public class Driver
{
    public static void main(String[] args)
    {
        
        
        Person persons[] = new Person[4];
                
        persons[0] = new Customer("Billy Jean", "261 Willow Creek Way", "(336) 290-3101", 0001, true);
        persons[1] = new Customer("Bobby Flay", "183 Hawthorne Dr.", "(336) 291-3604", 0002, false);
        persons[2] = new PreferredCustomer("Jack Smith", "607 Sleepy Lake Cr.", "(380) 806-5915", 0003, false, 693.80);
        persons[3] = new PreferredCustomer("Jolene Harding", "910 High Mountain ave.", "(350) 971-3261", 0004, true, 1079.57);
        
       
        for(int i =0; i < persons.length; i++)
        {
            System.out.println(persons[i].toString());
        }
    }
}
