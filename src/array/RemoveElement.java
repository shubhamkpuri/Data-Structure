package array;

/*Given array 
 * we have to remove all occurance of element k inplace 
 * and return the new length of the array
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */

public class RemoveElement {
public void solver(Integer arr[],Integer k) {
		
		System.out.println("Elements Before removing" );
		for (int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	
		int newLength = remover(arr,k);
		
		System.out.println("\nNew Length of the array is : "+ newLength);
		System.out.println("Elements After removing every occurance of ");
		for (int i = 0; i < newLength; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public int remover(Integer[] arr,Integer k) {
		
		
		/* Simplest approach is 
		 * start from first element if the arr[i] is not equal to k
		 * then increase j by and copy the value of arr[i] to arr[j]
		 */
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != k) {
				arr[j++] = arr[i];
			}
		}
		return j;
	}
}
