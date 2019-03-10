
/**
 * 
 * Using StringTokenizer with delimiters
 *
 * @author (Jack Ajizian)
 * @version (7/26/2018)
 */
import java.util.*;
import java.io.*;
import java.lang.*;

public class Driver
{
    public static void main(String[] args) throws IOException
    {
        //variables
        //made multiple strings and tokenizers in case we need to access them individually later on in program/text file
        Scanner input = new Scanner(System.in);
        String text1;
        String text2;
        String text3;
        
        StringTokenizer token1;
        StringTokenizer token2;
        StringTokenizer token3;
        StringTokenizer token4;

        //file reader
        Scanner file = new Scanner(new File("delimiters.txt"));

        
        //part 1

        //read in text from user
        System.out.println("Please enter a line of text with multiple words with spaces between them.");

        //converts user input into string
        text1 = new String(input.nextLine()); 
        //creates new stringtokenizer object with text1 as string, and space as delimiter
        token1 = new StringTokenizer(text1, " ");

        //prints out how many tokens are in the line
        System.out.println("\nThere are " + token1.countTokens() + " tokens in your line of text.");
        //prints each token individually using a loop
        System.out.println("\nHere are the tokens printed individually: ");
        while(token1.hasMoreTokens())
        {
            System.out.println(token1.nextToken());
        }

        //count and print tokens if delimiter also counts as a token
        //create new tokenizer with returnDelims param as true
        token1 = new StringTokenizer(text1, " ", true);
        System.out.println("\nThere are " + token1.countTokens() + " tokens in your line of text," 
            + " counting the delimiter space as a token.");
        //prints each token including space delim
        while(token1.hasMoreTokens())
        {
            System.out.println(token1.nextToken());
        }

        //part 2
        //read in a new line of text that uses a comma as a delimiter
        System.out.println("\n\n\nPlease enter a line of text with multiple words."
            + " Use a comma between the words, no spaces.");

        //converts user input into string
        text2 = new String(input.nextLine()); 
        //creates new stringtokenizer object with text2 as string, and space as delimiter
        token2 = new StringTokenizer(text2, ",");

        //prints out how many tokens are in the line
        System.out.println("\nThere are " + token2.countTokens() + " tokens in your line of text.");
        //prints each token individually using a loop
        System.out.println("\nHere are the tokens printed individually: ");
        while(token2.hasMoreTokens())
        {
            System.out.println(token2.nextToken());
        }

        //count and print tokens if delimiter also counts as a token
        //create new tokenizer with returnDelims param as true
        token2 = new StringTokenizer(text2, ",", true);
        System.out.println("\nThere are " + token2.countTokens() + " tokens in your line of text," 
            + " counting the delimiter , as a token.");
        //prints each token including space delim
        while(token2.hasMoreTokens())
        {
            System.out.println(token2.nextToken());
        }

        //part 3
        //read in a new line of text that uses an underscore and a comma as delims
        System.out.println("\n\n\nPlease enter a line of text with multiple words."
            + "\nEnter an underscore followed immediately by a comma between your words."
            + "\nExample: hello_,there_");

        //converts user input into string
        text3 = new String(input.nextLine()); 
        //creates new stringtokenizer object with text3 as string, and space as delimiter
        token3 = new StringTokenizer(text3, "_,");

        //prints out how many tokens are in the line
        System.out.println("\nThere are " + token3.countTokens() + " tokens in your line of text.");
        //prints each token individually using a loop
        System.out.println("\nHere are the tokens printed individually: ");
        while(token3.hasMoreTokens())
        {
            System.out.println(token3.nextToken());
        }

        //count and print tokens if delimiter also counts as a token
        //create new tokenizer with returnDelims param as true
        token3 = new StringTokenizer(text3, "_,", true);
        System.out.println("\nThere are " + token3.countTokens() + " tokens in your line of text," 
            + " counting the delimiters _ and , as tokens");
        //prints each token including space delim
        while(token3.hasMoreTokens())
        {
            System.out.println(token3.nextToken());
        }

        //part 4
        //reading from text file named delimiters.txt
        System.out.println("\n\n\nReading from the delimiters.txt file: ");
        //total token variable
        int totalTokens = 0;
        //for loop to go through lines in file
        for (int x = 1; file.hasNextLine(); x++)
        {
            //make new token object w/ comma delim
            token4 = new StringTokenizer(file.nextLine(), ",");
            //print line number with tokens per line
            System.out.println("Line " + x + " has " + token4.countTokens() + " tokens.");
            //add up tokens while counting through lines
            totalTokens += token4.countTokens();

        }

        //print out total tokens per file, not counting comma delim
        System.out.println("The file has " + totalTokens + " total tokens");

    }
}
