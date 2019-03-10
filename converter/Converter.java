
/**
 * Write a description of class StringBuilderRW here.
 * StringBuilder read/write to file.  Activity 5
 * @author Jack Ajizian
 * @version 7/16/2018
 */

import java.io.*;
import java.util.*;
public class Converter

//public method()
//public method(params)
//set public void setMethod(param)
//set 
//get = public var getMethod()
{
    //feilds
    private String original;
    private StringBuilder convertedSentence;
  
    //constructor one
    public Converter()
    {
        convertedSentence = null;
    }
    
    //constructor two
    //takes string as param
    public Converter(String sentence)
    {
        original = new String(sentence);
        convertedSentence= new StringBuilder(sentence);
    }
    
    public void setSentence(String sentence)
    {
        convertedSentence = new StringBuilder(sentence);
    }
    
    public String Convert()
    {
        char oldChar;
        char newChar;
        
        for(int i = 0; i <convertedSentence.length(); i++)
        {
             
            oldChar = convertedSentence.charAt(i);
            newChar = (char) (oldChar + 1);
            convertedSentence.setCharAt(i, newChar);
        }
        
        return convertedSentence.toString();
    }
    
    
   
         
    
}
