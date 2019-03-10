//Jack Ajizian
//ITSC 1213 lab 3
//Driver Class for Employee Salary

import java.util.Scanner;
public class Driver
{
    public static void main(String[] args)
    {
        //scanner
     Scanner input = new Scanner(System.in);
     //reference var
     Paycheck payout;
     payout = new Paycheck();
     
     //local variables
     String name;
     int hours;
     double pay;
     double gross;
     int difference;
     char goAgain= 'y';
     
     while(goAgain == 'y')
     {
     
     System.out.println("Please enter your name:");
     name = input.next();
     
     System.out.println("Please enter your hours worked:");
     hours = input.nextInt();
     
     System.out.println("Please enter your pay rate:");
     pay = input.nextDouble();
     
      if (hours > 40)
        {
            //this might need evaluation
            difference = hours - 40;
            
            gross = (40*pay) + (difference*(pay*1.5));
        }
        else 
        {
            gross = pay * hours;
        }
        
        payout.setEmployeeName(name);
        payout.setHoursWorked(hours);
        payout.setHourlyPay(pay);
        
        
        
        
     System.out.println("Employee: " + name +
     "\nHours Worked: " + hours + 
     "\nRate of Pay: " + pay +
     "\nGross Pay: $" + gross);
     
     //prompt user to go again or not
     System.out.println("Enter 'y' if you would like to go again");
     goAgain=input.next().charAt(0);
    }
     
    }
}