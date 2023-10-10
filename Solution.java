import java.util.ArrayList;

public class Solution {
	ArrayList<Integer> primeNums = new ArrayList<Integer>();

	public Solution() {
		//TODO Initializing PrimeNums by adding Prime numbers under 100 using iteration.
		primeNums.add(2);
		primeNums.add(3);
		primeNums.add(5);
		primeNums.add(7);
		primeNums.add(11);
		primeNums.add(13);
		primeNums.add(17);
	}
	
	public boolean isPrime(int num) {
		if (num == 1 || primeNums.contains(num)) {
			return true;
		}
	
		for(int pNum : primeNums) {
			if(num%pNum == 0) {
				return false;
			}
		}
		primeNums.add(num);
		return true;
	}
}
