//Jack Ajizian
//ITSC 1213
//Activity 4
//Driver Class for MileageConverter

import java.util.Scanner;
public class Driver
{
   public static void main (String[] args)
   {
       //scanner
       Scanner input = new Scanner(System.in);
       
       //reference var
       MileageConverter converter;
       converter = new MileageConverter();
       
       //local var
      
       double userDistance;
      
       char userUnit;
       int goAgain=0;
       
       while(goAgain != -1)
       {
            
           System.out.println("Please enter \"f\" or \"m\" for your distance meaasured.");
           userUnit = input.next().charAt(0);
       
            System.out.println("Please enter the distance traveled for the unit you previously entered.");
            userDistance = input.nextDouble();
          
             if(userUnit == 'f')
           {
               converter.setFeet(userDistance);
            }
            else
            {
                converter.setMiles(userDistance);
           
            }
            
            
          System.out.println(converter.toString());
            
    
            System.out.println("Enter \"-1\" if you would like to stop." + "\nEnter any other integer to continue.");
            goAgain = input.nextInt();
            
        }
       
       
       
    }
}