
/**
 * Write a description of class WindChillTemperature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.lang.Math;
public class WindChillTemperature
{
    //fields
    private double tempInFahrenheit;
    private double windSpeedInMPH;
    private double windchillTempF;
    
    //constructor
    public WindChillTemperature()
    {
        tempInFahrenheit = 0;
        windSpeedInMPH=0;
        windchillTempF= 35.74 + (0.6215 * tempInFahrenheit) - (35.75 * (Math.pow(windSpeedInMPH,0.16))  + (0.4275*tempInFahrenheit*Math.pow(windSpeedInMPH,0.16)));
    }
    
    public WindChillTemperature(double tempF, double windSpeed)
    {
        tempInFahrenheit = tempF;
        windSpeedInMPH = windSpeed;
        windchillTempF= 35.74 + 0.6215 * tempF - 35.75 * Math.pow(windSpeed,0.16)  + 0.4275*tempF*Math.pow(windSpeed,0.16);
        
    }
    
    //set method 1
    public void setTempInFahrenheit(double tempF)
    {
        tempInFahrenheit = tempF;
         windchillTempF=35.74 + (0.6215 * tempF) - (35.75 * (Math.pow(windSpeedInMPH,0.16))  + (0.4275*tempF*Math.pow(windSpeedInMPH,0.16)));
        
    }
    
    //set method 2
    public void setWindSpeedInMPH(double windSpeed)
    {
     windSpeedInMPH = windSpeed;
      windchillTempF= 35.74 + (0.6215 * tempInFahrenheit) - (35.75 * (Math.pow(windSpeed,0.16))  + (0.4275*tempInFahrenheit*Math.pow(windSpeed,0.16)));
    }
    
    //get method 1
    public double getTempInFahrenheit()
    {
        return tempInFahrenheit;
    }
    
    //get method 2
    public double getWindSpeedInMPH()
    {
        return windSpeedInMPH;
    }
    
    //get method 3
    public double getWindChillTempF()
    {
        return windchillTempF;
    }
    
    //to-string method
    public String toString()
    {
        return "Temperature in Fahrenheit is: " + tempInFahrenheit +
        "\nWind speed in MPH is: " + windSpeedInMPH +
        "\nWind chill Temperature in Fahrenheit is: " + windchillTempF;
        
    }
    
    
}
