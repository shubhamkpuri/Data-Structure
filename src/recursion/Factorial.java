package recursion;

public class Factorial {
	public int calFactorial(int num) {
		if(num <= 1) {
			return 1;
		}
		return calFactorial(num-1)*num;
	}
}
