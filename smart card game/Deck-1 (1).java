
/**
 * Deck class for deck of cards
 * several fields
 * Has default Deck constructor
 * getTopCard method
 * shuffle method
 * 
 * @author jack ajizian
 * @version 7/30/2018
 */

import java.io.*;
import java.util.*;

//Deck class creation
public class Deck
{
    //fields
    //deck array for Card objects
    private Card[] deck = new Card[52];
    //set top card to 52
    private int topCard = 52;
    //string arrays for both suits and faces
    private final String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
    private final String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    /**
     * Deck default constructor
     * populates array deck with cards
     */
    public Deck()
    {
        //int c for array holding/counting
        int c = 0;
        //loops for populating array
        for (int i = 0; i < suits.length; i++)
        {
            for(int j=0; j < faces.length; j++, c++)
            {
                deck[c] = new Card(suits[i], faces[j]);
            }

        }
    }
    
    /**
     * getTopCard
     * @return Card object for topCard
     */
    public Card getTopCard()
    {
        //if/else loop to either keep place or move down one in deck
        if(topCard == 0)
        {
            topCard = 51;
        }
        else
        {
            topCard = topCard - 1;
        }
        return new Card(deck[topCard].getSuit(), deck[topCard].getFace());
    }
    
    /**
     * shuffle method for shuffling deck randomly
     * @return void
     */
    public void shuffle()
    {
        //some local vars
        Random rng = new Random();
        
        Card shuffledCard;
        int cardLocation;
        
        //loop for population array with random cards
        for(int i = deck.length; i > 1; i--)
        {
            cardLocation = rng.nextInt(i);
            
            shuffledCard = deck[i-1];
            deck[i-1] = deck[cardLocation];
            deck[cardLocation] = shuffledCard;
        }
        //resets topCard to top of deck whenever a shuffle is called
        topCard = 52;
    }
   
}
