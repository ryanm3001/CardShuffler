import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

// CardShufflelTest tests class CardShuffler, verifying the resulting shuffled deck has 52 cards, and that the deck has no duplicate elements.
// This test should not stand alone without also testing for randomness of the shuffle. This can be done by shuffling about one thousand decks
// and then verifying that each element has about equal probability of appearing at each of the positions within the deck.

public class CardShuffleTest {
    
	
	/* verifyExactly52Cards() insures that shuffleDeck() returns a deck of exactly 52 cards.
	 * It uses noDuplicates() and makeDeckOf52() below.
	 */
	@Test public void verifyExactly52Cards()
	{
		assertEquals(52, new CardShuffler().shuffleDeck(makeDeckOf52()).size());
		assertEquals(52, new CardShuffler().shuffleDeck(makeDeckOf52()).size());
		assertEquals(52, new CardShuffler().shuffleDeck(makeDeckOf52()).size());	
        }
	
	
	/* noDuplicatesTest() shuffles a regular deck, then verifies that all 3 shuffled decks are 
	 * free of duplicate elements. It uses makeDeckOf52() from below to generate
	 * the regular deck of cards.
	 */
	@Test public void noDuplicatesTest()
	{
		assertEquals(true, noDuplicates(new CardShuffler().shuffleDeck(makeDeckOf52())));
		assertEquals(true, noDuplicates(new CardShuffler().shuffleDeck(makeDeckOf52())));
		assertEquals(true, noDuplicates(new CardShuffler().shuffleDeck(makeDeckOf52())));
	}
	
	
	// Supporting method: makeDeckOf52() simply creates an ArrayList with elements 0-51
        public List<Integer> makeDeckOf52()
        {
    	    ArrayList<Integer> deck = new ArrayList<Integer>();
    	
    	    for(Integer x = 0; x < 52; x++)
	    {	
	        deck.add(x);
	    }
    	    return deck;
        }
   
    
	/* Supporting method: noDuplicates() returns true if there 
	 * no duplicates in deckShuffled. It returns false if a duplicate
	 * element in the List is found. It also prints to console
	 * announcing what duplicate integer was found or if none were found. 
	 */
        public boolean noDuplicates(List<Integer> deckShuffled)
        {
    		
            Integer currentValue = 0;

            int i = 0;
            int length = deckShuffled.size();

            for(i = 0; i < length; i++) 
            {
                currentValue = deckShuffled.get(i);
                deckShuffled.set(i, -1);
                
		if(deckShuffled.contains(currentValue)) 
                {
                    System.out.println("No Duplicates Test: Duplicate found >" + currentValue);
        	    return false;
                } 
                else 
                {
                    deckShuffled.set(i, currentValue);
                }
            }
	    
        System.out.println("No Duplicates Test: No duplicates found");
        return true;
        }
}
