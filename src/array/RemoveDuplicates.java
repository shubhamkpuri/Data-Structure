package array;

/*Given sorted array 
 * we have to remove all duplicates inplace 
 * and return the new length of the array
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class RemoveDuplicates {
	
	public void solver(Integer arr[]) {
		
		System.out.println("Elements Before removing duplicates");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int newLength = remover(arr);
		System.out.println("\nNew Length of the array is : "+ newLength);
		System.out.println("Elements After removing duplicates ");
		for (int i = 0; i < newLength; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public int remover(Integer[] arr) {
		int j=0;
		/* Simplest approach is 
		 * start from first element if the arr[i] is not equal to arr[j]
		 * then increase j by and copy the value of arr[i] to arr[j]
		 */
		for (int i = 0; i < arr.length; i++) {
			if(arr[j] != arr[i]) {
				arr[++j] = arr[i];
			}
		}
		return j;
	}
}
