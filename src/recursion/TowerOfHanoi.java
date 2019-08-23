package recursion;

public class TowerOfHanoi {
	//	Recursive Approach to solve Tower of Hanoi
	public void solver(int n,char source, char dest , char	auxl) {
		if(n>=1) {
			// Move top n-1 from source(A) to destination(B) using auxiliary(C)
			solver(n-1, source, auxl,dest);
			
			// Move remaining disks from A to C
			System.out.println("Moving rod Number "+ n+ "  from "+ source + " to "+ dest);
			
			// Move n-1 from B to C using A as auxiliary
			solver(n-1, auxl , dest,source);
		}
	}
}
