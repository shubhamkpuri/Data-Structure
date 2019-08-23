package array;

public class Tester {

	public static void main(String[] args) {
		
		twoSum();
		
		containerWtihWater();

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
}
