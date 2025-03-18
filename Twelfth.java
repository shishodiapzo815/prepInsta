import java.util.Scanner;


public class Twelfth {
	public static void main(String [] args) {
		System.out.println("Enter the number:- ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int revNum = 0;
		do {
			revNum = revNum * 10 + num%10;
			num = num/10;
		}while(num != 0);
		System.out.println("Reverse of Input Number = " + revNum);
	}
}