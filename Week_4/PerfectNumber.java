package Week_4;
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The factors of the number are: ");
        factor(num);
        sc.close();
    }
    public static void factor(int num){
        int sum =0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                System.out.println(i+" ");
                sum += i;
            }
        }
        if(sum==num){
            System.out.println("It's a Perfect number!");
        }
        else{
            System.out.println("Not a Perfect number!");
        }
        System.out.println("The Sum of the factors is: "+sum);
    }
}
