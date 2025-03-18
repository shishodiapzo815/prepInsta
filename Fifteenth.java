import java.util.Scanner;


public class Fifteenth {
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

		Fifteenth obj = new Fifteenth();

		if (a >= 1 && b >=1) {
			for (int i = a; i <= b; i++) {
				int digits = obj.countDigits(i);
				obj.isArmstrong(i, digits);
			}
		}

		
		else {
			System.out.println("Range must start from 1");
		}
		
	}

	/*Count number of digits function*/

	public int countDigits(int num) {

		int count = 0;
		while (num != 0) {

			num /= 10;
			count++;
		}
		return count;
	}

	//Check Number is armstrong

	public void isArmstrong (int num, int digits) {

		int digit = 0;
		int sum = 0;
		int n = num;
		while(n != 0) {
			digit = n % 10;
			sum = sum + (int)(Math.pow(digit, digits));
			n /= 10;
		}
		if (sum == num) {
			System.out.println(num);
		}
	}
}