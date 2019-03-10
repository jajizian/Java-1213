
/**
 * This is a driver class to test the methods of the
 * LinearMeasurement class.
 * 
 * @author L. Lehmann 
 * @version v1
 */
import java.util.*;
public class Driver
{
    public static void main(String[ ] args)
    {
        //object 1 with num/denom
        LinearMeasure m1;
        int num1;
        int denom1;
        
        //object 2 with num/denom
        LinearMeasure m2;
        int num2;
        int denom2;
        
        Scanner input = new Scanner(System.in);
        
        //get num1 
        System.out.println("Enter numerator for m1:");
        num1 = input.nextInt();
        
        //get denom1
        System.out.println("Enter denominator for m1:");
        denom1 = input.nextInt();
        
        System.out.println("Enter numerator for m2:");
        num2 = input.nextInt();
        
        System.out.println("Enter denominator for m2:");
        denom2 = input.nextInt();
        
        
        
        m1 = new LinearMeasure(num1, denom1);
        m2 =new LinearMeasure(num2, denom2);
       
        //prints input'd fractions
       System.out.println("Fraction 1 is: " + m1.toString());
       System.out.println("Fraction 2 is: " + m2.toString());
        
       //multiply
       System.out.println("\nThe fractions multiplied are: " + m1.multiply(m2).toString());
       
       //division
       System.out.println("\nThe fractions divided are: " + m1.divide(m2).toString());
     
       //add
       System.out.println("\nThe fractions added together are: " + m1.add(m2).toString());
       
       //subtract
       System.out.println("\nThe fractions subtracted together are: " + m1.subtract(m2).toString());
       
       //compareTo
       System.out.println("\n" + m1.toString() + " compared to " + m2.toString() + " = ");
       if(m1.compareTo(m2) == -1)
       {
           System.out.println(m1.toString() + " > " + m2.toString());
        }
        else if (m1.compareTo(m2) == 0)
        {
            System.out.println(m1.toString() + " == " + m2.toString());
        }
        else
        {
            System.out.println(m1.toString() + " < " + m2.toString());
        }
        
        //equals
        System.out.println("\n\n Is " + m1.toString() + " equal to " + m2.toString() + " ?");
        if(m1.equals(m2))
        {
            System.out.println("Yes, the two are equal.");
        }
        else
        {
            System.out.println("No, they are not equal.");
        }
       
    
    }
}
