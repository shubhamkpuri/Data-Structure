package recursion;

public class Tester {

	public static void main(String[] args) {
		helloWorld();
		
		factorial();
	}
	
	static void helloWorld() {
		PrintHelloWorld printHelloWorld = new PrintHelloWorld();
		printHelloWorld.helloWorld(5);
		System.out.println("******** Forward *******");
		printHelloWorld.helloWorldEachTimeForward(10); // 1, 2, 3 ... 10
		System.out.println("******** Reverse *******");
		printHelloWorld.helloWorldEachTimeReverse(10); // 10, 9 , 8 ... 0 
	}
	
	static void factorial() {
		//Factorial using recursion for small numbers
		Factorial factorial = new Factorial();
		Integer num = factorial.calFactorial(5);
		System.out.println(num);
		
		// Use BigIntegers for calculating factorial for bigger numbers like 100 or so
		
	}
}
