import java.util.Scanner;


public class Eleventh {
	public static void main(String [] args) {
		System.out.println("Enter the number:- ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		do {
			sum = sum + n%10;
			n = n/10;
		}while(n != 0);
		System.out.println("Sum of digits = " + sum);
	}
}