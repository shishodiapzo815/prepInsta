import java.util.Scanner;


public class Sixth {
	public static void main(String [] args) {
		System.out.println("Enter two numbers:- ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(a + " is greatest.");
		}

		else if (b > a) {
			System.out.println(b + " is greatest.");
		}

		else
			System.out.println(a + " and " + b + " are equal.");
	}
}