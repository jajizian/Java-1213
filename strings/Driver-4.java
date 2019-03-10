
//itsc1213
//jack ajizian
//lab4part2
//7/13/2018

import java.util.*;
public class Driver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       String myString = new String();
       Replacer xyz = new Replacer();
        StringBuilder builder = new StringBuilder();
        
        System.out.println("Enter your string:");
        myString = input.nextLine();
        
        xyz.replaceThis(' ', "blank");
        System.out.println(xyz);
        
        
        
        
        
    }
   
}
