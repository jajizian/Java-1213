//jack ajizian
//itsc1213
//lab 4 - strings
//7/13/2018

import java.util.Scanner;
public class Strings
{
    public static void main (String[] args)
    {
        //vars
        char stringE = 'e';
        int countE = 0;
        
        String myString = new String();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string for your new string object.");
        myString = input.nextLine();
        
        //string user entered
        System.out.println("Your string has been inputed as: \n" + myString);
        
        //characters in string
        System.out.println("There are " + myString.length() + " characters in your string.");
        
        //first char in string
        System.out.println("The first letter of your string is " + myString.charAt(0) + ".");
        
        //last letter of string
        System.out.println("The last letter of your string is " + myString.substring(myString.length()-1) + ".");
        
                //consider if/else for this
        //prints whether string contains char "e"
        System.out.println("Your first occurence of \"e\" is at location index " + myString.indexOf('e'));
        
        
                //consider if/else for this
        //prints whether string contains "ay"
        System.out.println("Your first occurence of \"ay\" starts at location index " + myString.indexOf("ay"));
        
        //prints number of times "e" is in your string
        for (int i=0; i<myString.length(); i++)
        {
            if(myString.charAt(i) == stringE)
            {
                countE++;
            }
        }
        System.out.println("Your string contains " + countE + " e's");
        
        //last location of e
        System.out.println("Your last e is located at index " + myString.lastIndexOf('e'));
        
        //location of second e
        System.out.println("Your second occurrence of 'e' is located at index " + myString.indexOf('e', myString.indexOf('e')+1));
        
        //chars in sentence besides spaces
        System.out.println("Not counting spaces, your string contains " 
        + myString.replace(" ", "").length() +
        " characters");
        
        //add the words "you know" to the string
        System.out.println(myString + " you know");
        
        //upper case string
        System.out.println(myString.toUpperCase());
        
        //extract and print substring of five char from string
        System.out.println(myString.substring(0,5));
        
        //replace all a's with x's
        System.out.println(myString.replace('a', 'x'));
    }
    
    
    

}
