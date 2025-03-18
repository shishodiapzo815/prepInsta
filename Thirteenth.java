import java.util.Scanner;


public class Thirteenth {
	public static void main(String [] args) {
		System.out.println("Enter the number:- ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int revNum = 0;
		do {
			revNum = revNum * 10 + num%10;
			num = num/10;
		}while(num != 0);

		if (n == revNum) {
			System.out.println(revNum + " is a Palindrome number");
		}

		else {
			System.out.println(revNum + " is not a Palindrome number");
		}
		
	}
}