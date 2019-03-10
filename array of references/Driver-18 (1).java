
/**
 * invoice driver
 *
 * @author jack ajizian
 * @version 7/30/2018
 */

import java.util.*;
import java.io.*;

public class Driver
{
    public static void main(String[] args) throws IOException
    {
        Invoice [] inRef;
        Scanner keyboard = new Scanner(System.in);
        Scanner fileName = new Scanner(new File("invoicedata.txt"));
        StringTokenizer tokens;
        
        //locals
        String id;
        String desc;
        double price;
        boolean isFin;
        int numInvoice = 10;
       
        inRef = new Invoice[numInvoice];
        
        for (int i = 0; i < inRef.length; i++)
        {
            tokens = new StringTokenizer(fileName.nextLine(), ",");
            
            id = tokens.nextToken();
            desc = tokens.nextToken();
            price = Double.parseDouble(tokens.nextToken());
            isFin = Boolean.parseBoolean(tokens.nextToken());
            
            inRef[i] = new Invoice(id, desc, price, isFin);
        }
        
        System.out.println("\nHere is the invoice data: ");
        for (int i = 0; i < inRef.length; i++)
        {
            System.out.println(inRef[i].toString());
        }
        
        System.out.println("\nThe first invoice compared to the last invoice is as follows: ");
        if((inRef[0]).compareTo(inRef[9]) > 0)
        {
            System.out.println("invoice 1 is more expensive than invoice 10");
        }
        else
        {
            System.out.println("invoice 10 is more expensive than invoice 1");
        }
        
        if((inRef[1]).equals(inRef[4]))
        {
            System.out.println("invoice 2 is equal to invoice 5");
        }
        else
        {
            System.out.println("invoice 2 is not equal to invoice 5");
        }
        
        
        
        
        
            
        
        
        
    }

}
