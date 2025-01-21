package Week_5;

public class PrimeFibonacci {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to generate Fibonacci series and print prime numbers in it
    public static void printPrimeFibonacci(int limit) {
        int a = 0, b = 1;
        System.out.println("Prime numbers in Fibonacci series up to " + limit + " are: ");
        
        while (a <= limit) {
            if (isPrime(a)) {
                System.out.print(a + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int limit = 100; // You can change this limit as per your requirement
        printPrimeFibonacci(limit);
    }
}
