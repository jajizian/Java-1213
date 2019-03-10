
/**
 * Geometry driver
 *
 * @author Jack Ajizian
 * @version 7/23/2018
 */

import java.util.*;

public class Driver
{
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        char input = ' ';
        double area=0;
        double radius=0;
        double length=0;
        
        double width = 0;
        double base = 0;
        double height = 0;
        
        
    
        System.out.println("Please enter 1, 2, 3, or 4 for the following options:");
        System.out.println("\n 1: Calculate the area of a circle.");
        System.out.println("\n 2: Calculate the area of a rectangle.");
        System.out.println("\n 3: Calculate the area of a triangle.");
        System.out.println("\n 4: Close program.");
        
       input = kb.next().charAt(0);
        
        switch(input)
        {
            //case 1
            case '1':  
            System.out.println("Enter the radius of the circle: ");
            radius = kb.nextDouble();
            
            
            
            area=Geometry.circleArea(radius);
            
            if(area == 0.0)
            break;
            
            System.out.println("The area of your circle is: " + area);
            break;
            
            //case 2
            case '2':  
            System.out.println("Enter the length of the base of the rectangle: ");
            length = kb.nextDouble();
            
            System.out.println("Enter the width of the rectangle: ");
            width = kb.nextDouble();
            
            
            
            area=Geometry.rectangleArea(length, width);
            
            if(area == 0.0)
            break;
            
            System.out.println("The area of your rectangle is: " + area);
            break;
            
            //case 3
            case '3':  
            System.out.println("Enter the length of the base of the triangle: ");
            base = kb.nextDouble();
            
            System.out.println("Enter the height of the triangle: ");
            height = kb.nextDouble();
            
            
            
            area=Geometry.triangleArea(base, height);
            
            if(area == 0.0)
            break;
            
            System.out.println("The area of your triangle is: " + area);
            break;
            
            case '4' :
            System.out.println("Goodbye.");
            break;
            
            
        }
        
    }
   
}
