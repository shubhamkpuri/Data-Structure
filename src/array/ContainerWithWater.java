package array;

/* Given n buildings whose height is mentioned in the array
 *  we need to find two buildings which will hold maximum water between them
 */
public class ContainerWithWater {
	void solver(Integer arr[]) {
		
		Integer leftPointer =0, rightPointer = arr.length-1;
		Integer maxArea =0;
		
		while(leftPointer < rightPointer) {
			/* find out maxArea from
			 * current maxArea and 
			 * the area covered by the pointer ( (r - l) * min( arr[l], arr[r]) )
			 */
			maxArea = Math.max(maxArea, 
					(rightPointer - leftPointer) * Math.min(arr[leftPointer], arr[rightPointer]));
			
			/* move the pointer whose building height is smaller */
			if(arr[leftPointer] > arr[rightPointer])
				rightPointer-- ;
			else
				leftPointer++;
		}
		
		System.out.println("Maximum water can be stored in area "+ maxArea);
		
	}
}
