
/**
 * HangMan class
 * constructors, methods (set, get, toString)
 * 
 * @author Jack Ajizian
 * @version 7/24/2018
 */

import java.io.*;
import java.util.*;
import java.lang.Object;
import java.io.RandomAccessFile;

public class GameWord
{
    //fields
   private String phrase;
   private StringBuilder inProgress;
   private int numberWrongGuesses;
   private StringBuilder state;
   private boolean gameOver;
   
  /**
     * default constructor
     */
   public GameWord( )
   {
       //set fields to 0
       inProgress = new StringBuilder( );
       phrase = new String( );
       numberWrongGuesses = 0;
       state = new StringBuilder( );
       gameOver = false;
    }
    
    /**
     * constructor with args
     * @param phraseToGuess for guessing .txt file phrases
     */
    public GameWord(String phraseToGuess)
    {
        phrase = new String(phraseToGuess);
        state = new StringBuilder( );
        inProgress = new StringBuilder( );
        for(int k = 0; k < phrase.length( ); k++)
        {
            inProgress.append( "_ " );
        }
        numberWrongGuesses = 0;
        gameOver = false;
    }
      /**
     * setPhrase method
     * @param phraseToGuess for guessing .txt file phrases
     */
    public void setPhrase(String phraseToGuess)
    {
        phrase = new String(phraseToGuess);
        state = new StringBuilder( );
        inProgress = new StringBuilder( );
        for(int k = 0; k < phrase.length( ); k++)
        {
            inProgress.append( "_ " );
        }
        numberWrongGuesses = 0;
        state = new StringBuilder( );
        gameOver = false;
    }
    
    /**
     * get method for game over
     * @return boolean
     */
    public boolean getGameOver( )
    {
        return gameOver;
    }
    
    /**
     * find method
     * @param symbol for user input
     */
    public void find(char symbol)
    {
        int count = 0;
        int pos = 0;
        pos = phrase.indexOf(symbol);
        while(pos != -1)
        { 
          count++;
          inProgress.setCharAt(pos*2,symbol);
          pos = phrase.indexOf(symbol, pos + 1);;
        }
        if(count == 0)
        {
            numberWrongGuesses++;
            updateState( );
        }
        
        
        
    }
    
    
     /**
     * check win method
     * @return boolean
     */
  public boolean checkWin( )
   {
      boolean match = true;
       for(int k = 0, m = 0; k < phrase.length( ) && match; k++, m += 2)
      {
          if(phrase.charAt(k) != inProgress.charAt(m))
          {
              match = false;
         
          }
      }
      return match;
    }
   
     /**
     * updateState method 
     * Creates and Displays the hangman throughout the game
     * Actual loss message here at the bottom
     */
   private void updateState( )
   { 
      
          
       switch(numberWrongGuesses)
       {
           case 1: state.append("\n\t\t\t\t\t 0");
                   break;
           case 2: state.append( "\n\t\t\t\t       /");
                   break;
           case 3: state.append(" |");
                   break;
           case 4: state.append( " \\");
                   break;
           case 5: state.append("\n\t\t\t\t         |");
                   break;
           case 6: state.append("\n\t\t\t\t        /");
                   break;
           case 7: state.append(" \\\n\n\t\t\t\t      OH NO!!\nYou lost! Feel free to try again!");
                   gameOver = true;
                   
        
      }
      
  }
  
   /**
     * toString method
     * @return String
     */
  public String toString(  )
  {
      return new String("\n***************************************\n" 
            + inProgress + "\n" + state.toString( ));
  }
 
}