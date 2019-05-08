
/**
 * Write a description of class Card here.
 *
 * @author (your name) Ethan Tai
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private int rank;
    private int suit; // 1 = heart, 2 = spade, 3 = diamond, 4 = club
        

    /**
     * Constructor for objects of class Card
     */
    public Card(int suit, int rank)
    {
        this.rank=rank;
        this.suit=suit;
    }
    
    /**
     * getters and setters
     */
    public int getRank()
    {
        return rank;
    }
    
    public int getSuit()
    {
        return suit;
    }
    
    public void setRank(int rank) 
    {
        this.rank = rank;
    }
    
    public void setSuit(int suit) 
    {
        this.suit = suit;
    }
}
