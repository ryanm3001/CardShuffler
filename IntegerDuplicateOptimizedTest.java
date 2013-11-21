import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class IntegerDuplicateOptimizedTest {
                                                                       //Duplicate, position of identical integers
	Integer[] array1 = {33,4124,2232,4034,609,737,444,33};         //33, beginning and end
	Integer[] array2 = {442,4124,2232,442,609,737,444,33};         //442, beginning and middle
	Integer[] array3 = {5292,4124,2232,4034,55,737,444,33,55};     //55, middle and end
	Integer[] array4 = {1233,4124,8412,4034,8412,737,444};	       //8412, middle and middle, separated
	Integer[] array5 = {891233,891233,2232,4034,609,737,444,33};   //891233, beginning, concurrent
	Integer[] array6 = {33,4124,2232,12354,12354,3920,737,444};    //12354, middle, concurrent
	Integer[] array7 = {33,4124,2232,4034,609,737,5,814233,814233};//814233, end, concurrent


	
	@Test public void DupIntTestOpt()
	{
		assertEquals((Integer)33, new IntegerDuplicateOpt().findIntDuplicateOptimized(array1));
		assertEquals((Integer)442, new IntegerDuplicateOpt().findIntDuplicateOptimized(array2));
		assertEquals((Integer)55, new IntegerDuplicateOpt().findIntDuplicateOptimized(array3));
		assertEquals((Integer)8412, new IntegerDuplicateOpt().findIntDuplicateOptimized(array4));
		assertEquals((Integer)891233, new IntegerDuplicateOpt().findIntDuplicateOptimized(array5));
		assertEquals((Integer)12354, new IntegerDuplicateOpt().findIntDuplicateOptimized(array6));
		assertEquals((Integer)814233, new IntegerDuplicateOpt().findIntDuplicateOptimized(array7));
        }
}
