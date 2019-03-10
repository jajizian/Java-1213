
/**
 * This class contains a main( ) method only
 * and its purpose it to demonstrate the use
 * of several methods in the String class API
 * 
 * Each team member must submit the lines of code on paper 
 * and each team must submit their completed code.
 * 
 * Jack Ajizian 
 * 7/13/2018
 */
public class StringMethods
{
    public static void main(String[ ] args)
    {
        String sentence;
        int count;
        
        sentence = new String("The Mississippi originates in Minnesota and flows to Louisiana.");
        System.out.println("The number of characters in the sentence:\n" + sentence + "\nis "+ sentence.length());
        count = 0;
        for(int k = 0; k < sentence.length( ); k++)
        {
            if(sentence.charAt(k) == 'i')
            {
                count++;
            }
        }
        System.out.println("The lowercase i appears " + count + " times.");
      //todo using the String class API methods
      /* 1) Does the sentence contain the string "nat" ?
       * 2) Does the sentence contain the string "beat" ?
       * 3) Does the sentence end with "ana"?
       * 4) Does the sentence end with "ana."?
       * 5) Where is the first occurace of 's' ?
       * 6) Where is the second occurance of 's'?
       * 7) Where is the third occurance of 's'?
       * 8) Where is the last occurace of 's'?
       * 9) Where does the  first occurance of "is" start?
       * 10)Where does the last occurance of "is" start"?
       * 11)Replace each occurance of 's' with 'z'.
       * 12) Does step 11 change the original sentence, prove it by printing.
       * 13) Print the substring of the sentence beginning at character 3 for 6 characters"
       * 14) Print the entire sentence in upper case.
       * 15) Does step 13 change the original string, prove it by printing
       */
    
    
    }
}