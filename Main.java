
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private static boolean gameWon = false;
    
    public static void main(String[] args){
        Deck deck = new Deck();
        deck.shuffle();
        
        Card[] playerDeck = new Card[26];
        Card[] aIDeck = new Card[26];
        
        deal(deck, playerDeck, aIDeck);
        
        do {
            int tempAI = (int )(Math. random() * 26 + 1);
            int tempPlayer = (int )(Math. random() * 26 + 1);
            
            int tempPlayerHIT = playerDeck[tempPlayer].getRank();
            int tempAIHIT = aIDeck[tempAI].getRank();
            
            //AI card:
            System.out.println("The AI chooses" + tempAIHIT);
            System.out.println(tempPlayerHIT);
            
            System.out.println("The Player chooses");
            System.out.println(tempPlayerHIT);
            
            //sees which one hits closer to 21
            if ((21 - tempPlayerHIT) < (21 - tempAIHit) {
                gameWon = true;
            }
            
        }while (gameWon = false);
    }
    
           //deals out the cards into two equal decks
            public void deal(Card[] deck, Card[] d1, Card[] d2){
                for (int i=0; i<d1.length; i++) {
                    d1[i] = deck[i];
         
            }
              for (int i=d1.length; i<deck.length; i++) {
                    d2[i] = deck[i];
         
            }
        }
    }
