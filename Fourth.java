import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        System.out.println("Enter a number:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int sum = 0;
        while (i <= n) { 
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of " + n + " natural numbers = " + sum);
    }
}