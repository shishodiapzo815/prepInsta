import java.util.Scanner;


public class Ninth {
	public static void main(String [] args) {
		System.out.println("Enter the number:- ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

		if (n > 2) {
			isPrimeNumber(n);
		}

		
		else
			System.out.println("Not a prime number.");
	}

	public static void isPrimeNumber(int x) {

		int count = 0;
		for (int i = 2; i < x ; i++) {
			if (x % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(x + " is a Prime Number");
			}
		else {
			System.out.println(x + " is not a Prime Number");
		}
	}
}