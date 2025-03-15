import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:- ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        if (i <= n) {
            while (i <= n) { 
                sum+=i;
                i++;
            }
        }
        else {
            while (n <= i) { 
                sum+=n;
                n++;
            }
        }
        System.out.println("Sum of input range = " + sum);
    }
}