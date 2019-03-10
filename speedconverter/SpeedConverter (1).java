
/**
 * class for converting between mph, mpm, fph, and fpm
 *
 * @author Jack Ajizian
 * @version 7/23/2018
 */
public class SpeedConverter
{
    //fields
    //double's because not sure how precise user will want values
    private double milesPerHour;
    private double milesPerMinute;
    private double feetPerHour;
    private double feetPerMinute;
    
    //constant variables
    private final double FEET_PER_MILE = 5280;
    private final double MINUTES_PER_HOUR = 60;
    
    //default constructor
    /**
     * default constructor.  no return or param
     */
    public SpeedConverter()
    {
        //sets all fields besides constants to 0
        milesPerHour=0;
        milesPerMinute=0;
        feetPerHour=0;
        feetPerMinute=0;
    }
    
    /**
     * @param one double parameter for miles per hour, labeled as "mph"
     */
    //constructor with arguments
    public SpeedConverter(double mph)
    {
        //set mph param to milesPerHour variable
        mph = milesPerHour;
        
        //calculate value for miles per minute:
        milesPerMinute = (mph / MINUTES_PER_HOUR);
        
        //calculate value for feet per hour:
        feetPerHour = (mph*FEET_PER_MILE);
        
        //calculate value for feet per min
        feetPerMinute = (mph*FEET_PER_MILE) / MINUTES_PER_HOUR;
       
        
    }
    
    //set method for changing mph and recalculate fields
    /**
     * @param one double parameter for miles per hour, labeled as "mph"
     * @return return is void
     */
    public void setMPH(double mph)
    {
        //set mph param to milesPerHour variable
        milesPerHour = mph;
        
        //recalculate value for miles per minute:
        milesPerMinute = (mph / MINUTES_PER_HOUR);
        
        //recalculate value for feet per hour:
        feetPerHour = (mph*FEET_PER_MILE);
        
        //recalc value for feet per min
        feetPerMinute = (mph*FEET_PER_MILE) / MINUTES_PER_HOUR;
    }
    
    /**
     * @return returns a double for milesPerHour
     */
    //get method 1
    public double getMPH()
    {
        return milesPerHour;
    }
    
    /**
     * @return returns a double for milesPerMinute
     */
    //get method 2
    public double getMPM()
    {
        return milesPerMinute;
    }
    
    /**
     * @return returns a double for feetPerHour
     */
    //get method 3
    public double getFPH()
    {
        return feetPerHour;
    }
    
    /**
     * @return returns a double for feetPerMinute
     */
    //get method 4
    public double getFPM()
    {
        return feetPerMinute;
    }
    
    /**
     * @return returns a string for the toString method displaying the values of the variables 
     * based off what the user entered for mph
     */
    //toString method
    public String toString()
    {
        //displays the converted variables based on what user has entered in a tidy message!
        return "Given that your mph is: " + milesPerHour + 
                "\nThe milesPerMinute is: " + milesPerMinute +
                "\nThe feetPerHour is: " + feetPerHour +
                "\nThe feetPerMinute is: " + feetPerMinute;
    }
    

    
    
}
