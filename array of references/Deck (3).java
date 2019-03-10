
/**
 * Write a description of class Deck here.
 *
 * @author jack ajizian
 * @version 7/30/2018
 */
public class Deck
{
    //vars
    private Card[] deck = new Card[52];
    
    private final String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
    private final String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    public Deck()
    {
        System.out.println("there are " + (suits.length * faces.length) + " cards in your deck\n");
        
        int c = 0;
        for (int i = 0; i < suits.length; i++)
        {
            for(int j=0; j < faces.length; j++, c++)
            {
                deck[c] = new Card(suits[i], faces[j]);
            }
        }
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < deck.length; i++)
        {
            
            sb.append("Card " + (i+1) + ": " + deck[i].toString());
        }
        return sb.toString();
    }
   
}
