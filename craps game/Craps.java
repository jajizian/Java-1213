
/**
 * Craps game
 * lab 5 
 *
 * @author Jack Ajizian
 * @version 7/16/2018
 */
import java.util.*;
import java.io.*;
public class Craps
{
   public static void main (String[] args)
   {
     //variables
     Die dice1 = new Die();
     Die dice2 = new Die();
     Scanner input = new Scanner(System.in);
     //int dice1;
     //int dice2;
    
     int point;
     int score;
     int score2;
     char goAgain = 'y';
     
     
     while (goAgain == 'y')
     {
         System.out.println("roll the dice");
         dice1.roll(6);
         dice2.roll(6);
         System.out.println("\n score for dice1 = " + dice1
         + "\n score for dice2 = " + dice2);
         score = dice1.getFaceValue() + dice2.getFaceValue();
         
         if (score == 11 || score == 7)
         {
             System.out.println("\n Your score is = " + score);
             System.out.println("You win!");
             System.out.println("\nEnter y if you would like to play again.  \nAny other key will close the game.");
            goAgain = input.next().charAt(0);
             
             
         }
         
         if (score == 2 || score == 3 || score == 12)
         {
             System.out.println("\n Your score is = " + score);
             System.out.println("You lose!");
             System.out.println("\nEnter y if you would like to play again.  \nAny other key will close the game.");
            goAgain = input.next().charAt(0);
             
             
         }
         
         else if(score == 4 || score == 5 || score == 6 || score == 8 || score == 9 || score == 10)
         {
             point = score;
             System.out.println("\n Your points = " + point);
             
             //dont use true anymore, set a boolean value
             while (true)
             {
                 //set to reset to 0
              dice1.roll(6);
              dice2.roll(6);
              score2 = dice1.getFaceValue() + dice2.getFaceValue();
              System.out.println("\n score for dice1 = " + dice1
         + "\n score for dice2 = " + dice2);
              System.out.println("\n Your updated score is " + score2);
              
              if(score2 == point)
              {
                  System.out.println("\n You win!");
                  break;
                }
                if (score2 == 7)
                {
                    System.out.println("\n You lose!");
                    break;
                    }
     
            }
            
            System.out.println("\nEnter y if you would like to play again.  \nAny other key will close the game.");
            goAgain = input.next().charAt(0);
        }
            
            
         
         
         
        
     
     
     
       
       
       
    }
}}
