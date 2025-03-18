import java.util.Scanner;


public class Eighth {
	public static void main(String [] args) {
		System.out.println("Enter the year:- ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		

		if (a % 4 == 0) {
			System.out.println(a + " is Leap Year");
		}

		
		else
			System.out.println(a + " is not a Leap Year.");
	}
}