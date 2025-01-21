package Week_4;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter the base and exponent: ");
        long base = sc.nextLong();
        System.out.println("Enter the exponent: ");
        long exponent = sc.nextLong();
        System.out.println(power(base, exponent));
    }
    public static long power(long base, long exponent) {
        long result = 1;
        for(int i = 1; i <= exponent; i++){
            result *= base;
        }
        return result;
    }
    
}
