package recursion;

public class FibonacciSeries {
	
	int fibonacciSeries(int count) {
		if(count <= 2)
			return count-1 ;
		return fibonacciSeries(count-1)+ fibonacciSeries(count-2);
	}
}
