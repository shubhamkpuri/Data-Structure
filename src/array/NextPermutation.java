package array;

import java.util.Arrays;
/*Given an array of integers
 * you need to find next bigger permutation  
 * If not possible then print array in reverse order
 */
public class NextPermutation {
	/*function to swap integers in array */
	void swap(Integer[] arr, int i ,int j) {
		Integer number = arr[j];
		arr[j]= arr[i];
		arr[i]= number;

	}
	public void solver(Integer[] arr) {
		Integer i = arr.length-1;
		/* Find the index of the number
		 *  whose right hand immediate number is bigger than itself
		 */
		while(i>0 && arr[i]<=arr[i-1]  ) {
			i--;
		}
		/*if index is 0 means array is already sorted in decreasing order
		 * So no permutation will bigger than this
		 * print array in reverse order
		 */
		if(i==0) {
			for (int j = arr.length-1; j >=0 ; j--) {
				System.out.print(arr[j]+" ");
			}
			return ;
		}
		/* else 
		 * Find the immediate bigger number in right hand side of then number
		 */
		int x = arr[i-1],smallest = i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j] > x && arr[j] <= arr[smallest]) {
				smallest= j;
			}
		}
		/*swap the bigger digit from right hand side with index value */
		swap(arr,i-1,smallest);
		/* Sort the all the number right to the index in increasing order*/
		Arrays.sort(arr,i,arr.length);
		
		for (Integer element : arr) {
			System.out.print(element+" ");
		
		}
			
	}
}
