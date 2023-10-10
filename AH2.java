import java.util.Scanner;

public class AH2 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter Num to check : ");
			int inputNum = scanner.nextInt();
			if (solution.isPrime(inputNum)) {
				System.out.println("It is a prime number.");
			} else {
				System.out.println("It is not a prime number.");
			}
		}
	}
}


