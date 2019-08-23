package array;

import java.util.HashMap;
import java.util.Map;

/* Find 3 numbers such that their sum is equal to target
 * and print the indexes/indices of those numbers
 */
public class ThreeSum {
	
	public void solver(Integer arr[],Integer target ) {
		
		// map for num and index pair
		Map<Integer , Integer> map  = new HashMap<Integer, Integer>();
		
		Boolean isAnswered = false;
		
		out:
		for (int i = 0; i < arr.length-2; i++) {
			/* create newTarget by subtracting the 
			 * current value of arr[i]  from target 
			 * and then apply two sum algorithm with some little modification
			 */
			Integer newTarget = target - arr[i];
			
			for (int j =i+1; j < arr.length; j++) {
				Integer val = map.get(newTarget - arr[j]);
				
				if(val == null) {
					/* no match found , add the current item and
					 * index to map
					 */
					map.put(arr[j], j);
				}else if(val != j) { //the found index is not same as current index(j)
					
					/* match found, update the isAnswered
					 *  and print index of numbers
					 *  and break out of both loops using labeled loop
					 */
					isAnswered=true;
					System.out.println("Index of three numbers are " +i+"  "+ val +"  "+j );
					break out;
				}
			}
		}
		
		if(!isAnswered) {
			System.out.println("No such 3 numbers with sum  "+target);
		}
	}
}
