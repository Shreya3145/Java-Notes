package Week_4;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = sc.nextLong();
        System.out.println("The factors of the number are: ");
        factor(num);
        sc.close();
    }
    public static void factor(long num){
        for(long i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i+" ");
            }
        }
    }
}
