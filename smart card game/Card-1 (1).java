
/**
 * Card Class
 * Creates 3 field values for card suit, face, and value
 * Has 2 constructor method, one default, one that has string suit and face params
 * 3 get methods for field values
 * 1 toString method printing out field values
 * compareTo method for card value
 * equals method for suit and face
 *
 * @author Jack Ajizian
 * @version 7/30/2018
 */

import java.io.*;
import java.util.*;

//Card class creation
public class Card
{
    //fields
    private int value;
    private String suit;
    private String face;
    
    /**
     * Default constructor
     */
    public Card()
    {
        //set fields to 0 or " "
        value = 0;
        suit = " ";
        face = " ";
    }
    
    /**
     * Card constructor
     * @param String s for suit
     * @param String f for face
     */
    public Card(String s, String f)
    {
        //sets fields to params
        suit = s;
        face = f;
        value = 0;
        
        //switch for card values
        //sent to lower case because cards are camel case in string creating in deck class
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
    
    /**
     * getSuit method
     * @return String for suit
     */
    public String getSuit()
    {
        return suit;
    }
    
    /**
     * getFace method
     * @return String for face
     */
    public String getFace()
    {
        return face;
    }
    
    /**
     * getValue method
     * @return int for card value
     */
    public int getValue()
    {
        return value;
    }
    
    /**
     * toString method
     * @return String for printing out fields
     */
    public String toString()
    {
        return "\nSuit is: " + this.suit +
                "\nFace is: " + this.face +
                "\nValue is: " + this.value + "\n";
    }
    
    /**
     * compareTo method
     * @return int for placeholder
     * @param new Card object named other
     */
    public int compareTo(Card other)
    {
        //if else loop for comparing values
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
    
    /**
     * equals method
     * @return boolean for t/f
     * @param new Card object named other
     */
    public boolean equals(Card other)
    {
        return this.suit.equals(other.suit) && this.face == other.face;
    }
}
