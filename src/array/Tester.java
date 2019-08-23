package array;

public class Tester {

	public static void main(String[] args) {
		
		twoSum();
		
		containerWtihWater();
		
		threeSum();
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
		Integer arr[] = {1,2,3,4,5,6};
		Integer target = 13;
		ThreeSum threeSum = new ThreeSum();
		threeSum.solver(arr, target);
	}
}
