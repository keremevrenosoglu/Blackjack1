
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    int cardValue;
    String cardSuit;
    String cardRank;
    /**
     * Constructor for objects of class Card
     */
    public Card(int value, String suit, String rank)
    {
        cardValue = value;
        cardSuit = suit;
        cardRank = rank;
    }
    
    public int getValue(int value) 
    {
       return value;
    }
    
    public String getSuit(String suit)
    {
        return suit;
    }
    
    public String toString()
    {
        return "This card is a " + cardRank + " of " + cardSuit;
    }
    
}
