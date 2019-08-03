package recursion;

public class GCD {
	 int solver (int a, int b) {
		if(a == 0) {
			return b;
		}
		return solver(b%a, a);
	}
}
