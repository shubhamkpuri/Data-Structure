package array;

import java.util.HashMap;
import java.util.Map;

// Given an of integers, return indices of the two number such that there sum is target
public class TwoSum {
	public void solver(Integer[] arr, Integer target) {
		
		// If length is less than 2 we cannot find two numbers with sum equals target
		if(arr.length <=1)
			System.out.println("Array is of invalid length");
		
		Boolean isAnswered = false;
		
		// map for num and index pair
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		
		for (int i = 0; i < arr.length; i++) {
			/* checks if the map has an element which is equal 
			 * equal to the difference between the target and
			 * current element
			 */
			Integer val = map.get(target - arr[i]);
			
			if(val == null) {
				/* no match found , add the current item and
				 * index to map
				 */
				map.put(arr[i], i);
			}else {
				/* match found, update the isAnswered
				 *  and print index of numbers
				 */
				isAnswered =true;
				System.out.println("Index of two numbers are " + val +"   "+i);
				break;
			}
				
		}
		// if answer not found 
		if(!isAnswered) {
			System.out.println("No such two numbers with sum "+target);
		}
	}
}
