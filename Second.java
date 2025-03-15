import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.err.println("Entere a number:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.err.println("Even Number");
        }

        else {
            System.out.println("Odd Number");
        }
    }
}