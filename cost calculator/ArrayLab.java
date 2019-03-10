
/**
 * Write a description of class ArrayLab here.
 * 
 * Lab 1 Array Review 7.6.2018 (first day)
 * Jack Ajizian
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.util.Random;
public class ArrayLab
{
    public static void Lab1PartA (String[] args)
    {
        Scanner UserInput = new Scanner(System.in);
        
        
        int[] Array1 = new int[10];
        int[] Array2 = new int[10];
        
        for(int i = 0; i < Array1.length; i++)
        {
            System.out.println("Input values into array");
            Array1[i] = UserInput.nextInt();
        
        }
        
       for (int i=0, j=Array1.length-1; j > -1 && i < Array1.length; j--,i++)
       {
           Array2[j] = Array1[i];
           
        }
        
        for(int i = 0; i < Array1.length; i++)
        {
            System.out.println(Array1[i]);
           
        }
        
        for (int j=0; j < Array2.length; j++)
        {
             System.out.println(Array2[j]);
        }
      
    }
    
    public static void Lab1PartB (String[] args)
    {
        
        
        int oddNum=0;
        int evenNum=0;
        
        int[] Array = new int[15];
        
        for (int i = 0; i < Array.length; i++)
        {
            Array[i] = (int)(Math.random() * 20);
            
            System.out.println(Array[i]);
            
            if(Array[i] % 2 == 1)
            {
                oddNum++;
            }
            if(Array[i] % 2 ==0)
            {
                evenNum++;
            }
         
        }
           System.out.println("there are " + oddNum + " odd numbers");
            System.out.println(" there are " + evenNum + " even numbers");
        
    }
    
     public static void Lab1PartC (String[] args)
     {
         Scanner UserInput = new Scanner(System.in);
         
         int[] EmployeeID = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         double[] Sales = {300, 258, 600, 670, 305, 800, 402, 601,719, 690};
         
         double HighestSale=0;
         double LowestSale=10000;
         int HighestID=0;
         int LowestID=0;
         double AverageSale=0;
         int UserSearch=0;
         
         for (int i = 0; i < EmployeeID.length; i++)
         {
            if( Sales[i] > HighestSale)
            {
                HighestSale=Sales[i];
                HighestID=EmployeeID[i];
            }
            
            if(Sales[i] < LowestSale)
            {
                LowestSale=Sales[i];
                LowestID=EmployeeID[i];
            }
         }
         
         for (int i=0; i<EmployeeID.length; i++)
         {
             System.out.println("Employee ID: " + EmployeeID[i]);
             System.out.println("Sales: $" + Sales[i]);
         }
         System.out.println("The Highest Sale Employee Is Employee ID " + HighestID + " with a sale of " + HighestSale);
        System.out.println("The Lowest Sale Employee Is Employee ID " + LowestID + " with a lowest sale " + LowestSale);
        
        for(int i=0; i<Sales.length; i++)
        {
            AverageSale += Sales[i];
            
        }
        System.out.println("The average sale of all ten employees is " + (AverageSale/10));
        System.out.println("Employees 1, 2, 5, and 7 had sales below average");
        System.out.println("Employees 3, 4, 6, 8, 9, and 10 had sales above average");
        
        System.out.println("Enter Employee ID");
        
        int checkID=0;
        checkID = UserInput.nextInt();
        
    
        for (int i =0; i < EmployeeID.length; i++)
        {
            if (checkID !=1 && checkID !=2 && checkID !=3 && checkID !=4 && checkID !=5 && checkID !=6 && checkID !=7 && checkID !=8 && checkID !=9 && checkID !=10) 
            
            {
                System.out.println("You have not entered a correct employee ID number.  Try 1-10");
                return;
            }
            
            if(checkID == EmployeeID[i])
            {
                System.out.println("Employee " + checkID + " has a sale value of $" + Sales[i]);
            }
        }
        
     }
     
}
    
 
      
    