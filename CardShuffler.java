import java.util.*;

// CardShuffler shuffles a deck of 52 cards.
public class CardShuffler {
	  
	    public List<Integer> shuffleDeck(List<Integer> remainingDeck)
	    {
	        List<Integer> shuffledList = new ArrayList<Integer>(52);
	        Random randomGenerator = new Random();

	        for (int i = 0; i < 52; i++)
	        {
	            int random = randomGenerator.nextInt(52-i);   // random will have a smaller and smaller range of integers to choose from
	            
	            shuffledList.add(remainingDeck.get(random));  /* gets the element at the index of remainingDeck 
	                                                           that corresponds with the randomly generated integer,
	                                                           and adds that element to shuffledList
	                                                           */
	            
	            remainingDeck.remove(random);                 /* removes that element from remainingDeck, no duplicate
	                                                           integer can be allowed in shuffledList 
	                                                           */
	        }
	        
	        return shuffledList;                              /* now that the for loop has gone through all 52 iterations,
	                                                           shuffledDeck is now populated with 52 unique elements
	                                                           */
	    }
	    
}