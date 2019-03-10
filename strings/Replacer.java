//ITSC 1213 lab 4
//jack ajizian
//lab 4 part 2
//7/13/2018

import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.*;

public class Replacer
{
       private String myString = new String();
       private StringBuilder builder;
       
       public Replacer()
       {
         myString = "Hello there my name is Jack!";
         builder = new StringBuilder(myString);
           
        }
        
        public Replacer(String stringEdit)
        {
            myString = stringEdit;
            builder = new StringBuilder(stringEdit);
            
        }
        
        public void replaceThis(char x, String sequence)
        {
            //for loop to convert spaces?
            for (int i=0; i<builder.length(); i++)
        {
            if(builder.charAt(i) == x)
            {
                builder.replace(i,i, sequence);
            }
        }
    }
    
        //set to change orig to new given by user
        public void setOrigString (String newString)
        {
            myString = newString;
            builder = new StringBuilder(newString);
        }
    
        //get for original
        public String getOriginalString(String oString)
        {
            return myString;
        }
        
        //get for builder
        public StringBuilder getBuilderString(StringBuilder bString)
        {
            return builder;
        }
        
        
        
   
        
          
    
        
    

}
