import java.util.Scanner;


public class Seventh {
	public static void main(String [] args) {
		System.out.println("Enter three numbers:- ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println(a + " is greatest.");
		}

		else if (c >= b && a <= c) {
			System.out.println(c + " is greatest.");
		}

		else
			System.out.println(b + " is greatest.");
	}
}