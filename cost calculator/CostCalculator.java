
//jack ajizian
//lab 2 7/9/2018
//cost calculator and working with BlueJ IDE
public class CostCalculator
{
    //fields
    private double miles;
    private double gallons;
    private double costPerGallon;
    private double mileage;
    private double costForTrip;
    
    //constructor
    public CostCalculator(double inMiles, double inGallons, double inCostPer)
    {
        miles = inMiles;
        gallons = inGallons;
        costPerGallon = inCostPer;
        
        mileage = miles/gallons;
        costForTrip = gallons * costPerGallon;
    }
    
}
