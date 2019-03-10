
//jack ajizian
//ITSC 1213
//7/13/2018
//Activity 4- MileageConverter

public class MileageConverter
{
    //fields
    private double miles;
    private double feet;
    
    
      //constructor one
    public MileageConverter()
    {
        //set fields to 0
        miles = 0;
        feet=0;
      
    }
    
    //constructor two- with parameters
    public MileageConverter(double distance, char y)
    {
        //set value of two fields to be consistent
             
        //swtich statement for char (y=m then do setMiles, y=f then setFeet)
        //setFeet(xyz)
     switch (y)
     {
         case 'f' : setFeet(distance);
         
         break;
         
         case 'm' : setMiles(distance);
         break;
        }
      
        
    }
   
    //set method
    public void setMiles(double distanceInMiles)
    {
        miles = distanceInMiles;
        feet = miles * 5280;
    }
    
    //set method
    public void setFeet(double distanceInFeet)
    {
        feet = distanceInFeet;
       miles = feet/5280;
    }
    
    //get method
    public double getFeet()
    {
        return feet;
    }
    
    //get method
    public double getMiles()
    {
        return miles;
    }
    
    //toString method
    public String toString()
    {
        return "You have traveled a total of " + miles + " miles." + 
        "\nIn feet this translates to a total of " + feet + "feet.";
    }
}
