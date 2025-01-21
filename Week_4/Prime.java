package Week_4;
import java.util.Scanner;
public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 1) {

            System.out.println("It's not a prime number");
        } 
        else {

            boolean isPrime = true;

            for (int i = 2; i * i <= n; i++) { 

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        if (isPrime) {

                System.out.println("It's a prime number");

            } else {

                System.out.println("It's not a prime number");
            }
        }
    }
}
