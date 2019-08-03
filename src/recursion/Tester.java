package recursion;

public class Tester {

	public static void main(String[] args) {
		PrintHelloWorld printHelloWorld = new PrintHelloWorld();
		printHelloWorld.helloWorld(5);
		System.out.println("******** Forward *******");
		printHelloWorld.helloWorldEachTimeForward(10); // 1, 2, 3 ... 10
		System.out.println("******** Reverse *******");
		printHelloWorld.helloWorldEachTimeReverse(10); // 10, 9 , 8 ... 0 
	}

}
