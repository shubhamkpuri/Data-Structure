package array;

import java.util.*;
/* Find four numbers in the given list such that there sum is equals to target
 * 
 */

class Pair{
	int x;
	int y;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setXY(int x,int y) {
		this.x = x;
		this.y= y;
		
	}
	
}

class SpecialData{
	
	List<Pair> pairList = new ArrayList<>();
	void setIndexes(int x,int y) {
		Pair pair = new Pair();
		pair.setXY(x, y);
		pairList.add(pair);
	}

	public List<Pair> getPairList() {
		return pairList;
	}
	
	
}
public class FourSum {
	public void solver(Integer arr[],Integer target) {
		Map<Integer,SpecialData> ds= new HashMap<>();
		Boolean isAnswered = false;
		
		out:
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				SpecialData sd = new SpecialData();
				
				int sum = arr[i]+arr[j];
				/*If the target- sum already present in map
				 * then whether the indexes of all four are different
				 * if so then this combination is out answer
				 */
				if(ds.get(target- sum)!= null) {
					List<Pair> pl =ds.get(target- sum).getPairList();
					for (Pair pair :pl) {
							if(i!= pair.getX() && i!= pair.getY()&& j!= pair.getX() && j!= pair.getY()) {
								isAnswered =true;
								System.out.println("The indexes for four sum are :"+i+" "+j+" "+pair.getX()+" "+pair.getY());
								break out;
							}
						}
					
				}
				/* If sum is not present in map 
				 * then create List<Pair> and insert into map with sum as key
				 */
				if(ds.get(sum) == null) {
					sd.setIndexes(i,j);
					ds.put(sum,sd);
				}else {
					/* If it already present in map
					 * Then get the list of pair and 
					 * add the new indexes in last
					 */
					ds.get(sum).setIndexes(i, j);
//					ds.put(sum,ds.get(sum));
				}
				
			}
		}
		if(!isAnswered )
		System.out.println("No such pair exist");

	}
}
