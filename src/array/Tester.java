package array;

public class Tester {

	public static void main(String[] args) {
		
//		twoSum();
//		
//		containerWtihWater();
//		
//		threeSum();
//		
//		fourSum();
		
		removeDuplicates();
	}
	
	public static void containerWtihWater() {
		Integer arr[] = {1,2,3,4,5,6};
		ContainerWithWater maxWater = new ContainerWithWater();
		maxWater.solver(arr);
	}
	
	public static void twoSum() {
		Integer arr[] = {1,2,3,4,5,6};
		Integer target = 55;
		TwoSum twoSum = new TwoSum();
		twoSum.solver(arr, target);
	}
	public static void threeSum() {
		Integer arr[] = {1,5,6,2,3,4};
		Integer target = 12;
		ThreeSum threeSum = new ThreeSum();
		threeSum.solver(arr , target);
	}
	public static void fourSum() {

		FourSum fourSum = new FourSum();
		Integer arr[] = {1,2,1,4,5,6};
		
		fourSum.solver(arr,10);
	}
	public static void removeDuplicates() {
		Integer arr[] = {1,2,2,4,4,5,6};
		RemoveDuplicates rd = new RemoveDuplicates();
		rd.solver(arr);
	}
}
