package recursion;

public class PrintHelloWorld {
	
	
	void helloWorld(int count) {
		if(count < 1) {
			//When count becomes less than 1 it will prin hello world in console.
			 System.out.println("Hello World");
			return;
		}
		System.out.println("Count is  -> " + count);
		helloWorld(count-1);
		
	}
	// Reverse means 10 , 9 ,8 ... till 0
	void helloWorldEachTimeReverse(int count) {
		if(count < 1) {
			return;
		}
		System.out.println("Hello World \nCount is -> "+ count);
		helloWorldEachTimeReverse(count-1);
	}
	// Forward means 0, 1,2 ... 10
	void helloWorldEachTimeForward(int count) {
		if(count < 1) {
			return ;
			
		}
		helloWorldEachTimeForward(count-1);
		System.out.println("Hello World \nCount is -> "+ count);
	}
}
