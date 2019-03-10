
/**
 * Geometry project
 *
 * @author Jack Ajizian
 * @version 7/23/2018
 */
public class Geometry
{
    //fields
    //pi
    private final static double PI = 3.14159;
    
    //circle area method
    public static double circleArea(double radius)
    {
         if (radius < 0)
        {
            System.err.print("please rerun and enter a positive value");
        }
        
        return (radius <= 0) ? 0 : PI * (radius * radius);
    }
    
    //rectangle area
    public static double rectangleArea(double length, double width)
    {
        if (length < 0 || width < 0)
        {
            System.err.print("please rerun and enter only positive values");
        }
        return (length <= 0 || width <=0) ? 0 : length*width;
    }
    
    //triangle area
    public static double triangleArea(double base, double height)
    {
        if (base < 0 || height < 0)
        {
            System.err.print("please rerun and enter only positive values");
        }
        return (base <= 0 || height <=0) ? 0 : 0.5 * (base * height);
    }
    
    
    
   
   
}
