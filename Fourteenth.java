import java.util.Scanner;
import java.lang.Math;


public class Fourteenth {
	public static void main(String [] args) {
		System.out.println("Enter the number:- ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int digit = 0;
		int count = 0;
		int sum = 0;
		while(n != 0) {
			n = n/10;
			count++;
		}

		n = num;

		while(n != 0) {
			digit = n%10;
			sum = sum + (int)(Math.pow(digit, count));
			n = n/10;
		}

		if (sum == num) {
			System.out.println(num + " is a Armstrong number");
		}

		else {
			System.out.println(num + " is not a Armstrong number");
		}
	}
}