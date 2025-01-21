package Week_4;
import java.util.Scanner;
public class Prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        prime(n);
    }
    public static void prime(int n){
        int count = 2;
        if(n<=1){
            System.out.println("It's not a prime number");
        }
        else {
            for(int i = 2; i <= n /2 ; i++) {
                if(n%i==0) {
                    count++;
                
                }
            }
        
    }
        if(count ==2) {
             System.out.println("It's a prime number");
        }
        else {
             System.out.println("It's not a prime number");
        }

    
    }
}
