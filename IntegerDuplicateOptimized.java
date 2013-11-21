import java.util.HashMap;

/* This class has the same end result as IntegerDuplicate class. This is
* optimized utilizing a HashMap to traverse the data much faster.
*/
public class IntegerDuplicateOptimized {
	
    public Integer findIntDuplicate(Integer[] intArray)
    {
    	
    	HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
    	
    	for(Integer i = 0; i < intArray.length; i++)
    	{
    		Integer element = (Integer)intArray[i];
    		if(hashmap.containsKey(element))
    		{	
    			return element;
    		}
    		else
    		{
    			hashmap.put(element, 1);
    		}	
    	}
    	return -1;
    }

}
