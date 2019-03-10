
/**
 * Write a description of class Card here.
 *
 * @author jack ajizian
 * @version 7/30/2018
 */
import java.io.*;
import java.util.*;

public class Card
{
    private String suit;
    private String face;
    private int value;
    
    public Card()
    {
         suit = " ";
         face = " ";
         value = 0;
        
    }
    
    public Card(String pSuit, String pFace, int pValue)
    {
        suit = pSuit;
        face = pFace;
       value = pValue;
    }
    
    //deck caller constructor
    public Card(String s, String f)
    {
        suit = s;
        face = f;
        value = 0;
        
        switch(face.toLowerCase())
        {
            case "jack":
            case "queen":
            case "king":
                value = 10;
                break;
                
            case "ace":
                value = 11;
                break;
                
            default:
                value = Integer.parseInt(face);
                break;
        }
       
        
    }
    
    public boolean equals(Card other)
    {
        return this.suit.equals(other.suit) && this.face == other.face;
    }
    
    public int compareTo(Card other)
    {
        if(this.value < other.value)
        {
            return -1;
        }
        else if(other.value < this.value)
        {
            return 1;
        }
        return 0;
    }
    
    public String toString()
    {
        return "\nSuit is: " + suit +
                "\nFace is: " + face +
                "\nValue is: " + value + "\n\n";
    }
    
    //get methods
    public String getSuit()
    {
        return suit;
    }
    
    public String getFace()
    {
        return face;
    }
    
    public int getValue()
    {
        return value;
    }
    
    //set method
    public void setAll(String pSuit, String pFace, int pValue)
    {
        suit = pSuit;
        face = pFace;
        value = pValue;
    }
}
