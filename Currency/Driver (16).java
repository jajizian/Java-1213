//Jack Ajizian
//ITSC 1213
//7/11/2018
//Driver for our currency class

import java.util.Scanner;

public class Driver
{
    //main
    //Currency (our other class) is a variable now
    public static void main (String[] args)
    {
        //this is a reference variable
        //holds the address of Currency object

        Scanner input = new Scanner(System.in);

        Currency money;
        money = new Currency();
        //local vairables
        double cash;
        String type;
        char goAgain;
        goAgain = 'y';

      
        while(goAgain == 'y')
        {
            
            //prompt user for a new amount, read it in
            //prompt user for a new type of currency, read it in
            System.out.println("Please enter your currency amount");
            cash = input.nextDouble();
            
            System.out.println("What type of currency is it?");
            System.out.println("The valid currency inputs are as follows: " +
            "\n dollar" + 
            "\n euro" + 
            "\n pound" + 
            "\n rupee" + 
            "\n aussie" + 
            "\n canada"); 
            type = input.next();
               
            //call the set method for currency
            //System.out.println(money.toString());
            money = new Currency(cash, type);
            System.out.println(money.toString());

            //prompt user to go again or not
            System.out.println("Enter a y to go again or anything else to quit.");
            //ensures scanner only reads first char input from user
            goAgain = input.next().charAt(0);
        }

      
      
      
      
    }
}
