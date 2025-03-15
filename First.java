import java.util.Scanner;

public class First{
    public static void main(String[] args) {
        System.out.println("Enter a number:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Number is Negative");
        }

        else {
            System.out.println("Number is Positive");
        }
    }
}