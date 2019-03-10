
/**
 * Dice Class (1 Die)
 * die simulator
 *
 * @author Jack Ajizian
 * @version 7/16/2018
 */
import java.util.*;
import java.io.*;

public class Die
{
    //two fields
    private int numSides;
    private int faceValue;
    Random rnd = new Random();
    
    // constructor 1
    public Die()
    {
        //set number of sides to 6
        numSides = 6;
        
        //use random class to set value of face
        faceValue = rnd.nextInt(5)+1;
        
    }
    
    //constructor 2
    public Die(int face)
    {
        //set number of sides to 6
        numSides = 6;
        
        //use random class to set value of face
        face = rnd.nextInt(5)+1;
        faceValue = face;
    }
    
    //set 1
    public void setFaceValue(int face)
    {
        face = faceValue;
       
    }
    
    //set 2
    public void setNumSides(int sides)
    {
        sides = numSides;
    }
    
    //get 1
    public int getFaceValue()
    {
        return faceValue;
    }
    
    //get 2
    public int getNumSides()
    {
        return numSides;
    }
    
    //roll method, changes value of face
    public int roll(int face)
    {
        //set number of sides to 6
        numSides = 6;
        
        //use random class to set value of face
        face = rnd.nextInt(6)+1;
        faceValue = face;
        
        return face;
    }
    
    public String toString()
    {
        return "You have rolled a " + faceValue
        + " on a " + numSides + " sided die";
    }
    
}
