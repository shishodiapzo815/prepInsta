import java.util.Scanner;


public class Tenth {
	public static void main(String [] args) {
		System.out.println("Enter the numbers:- ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) {
			a = a+b;
			b = a-b;
			a = a-b;
		}

		if (a >= 2 && b >=2) {
			isPrimeNumber(a, b);
		}

		
		else
			System.out.println("Range must start from 2");
	}

	public static void isPrimeNumber(int x, int y) {

		for (int i = x; i <= y; i++) {

			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}
}