package Week_4;
import java.util.Scanner;
public class ReversePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        //reverse(num);
        //update(num);
        int rev = reverseupdate(num);
        System.out.println(rev);
        sc.close();
        
    }
    /* public static void reverse(int num){
        while(num>0){
        int num1 = num % 10; //3
        System.out.println(num1);
        num1 = num / 10; //12
        num1 = num1 % 10; //2
        System.out.println(num1);
        num1 = num / 100; //1
        System.out.println(num1);
        break;
    }
    } */
    public static void update(int num){
        int sum = 0; 
        int mul =1;
        while(num > 0){ //(num!=0)
            int rem = num % 10;
            num = num / 10;
            sum += rem;
            mul *= rem;
            System.out.println(rem);
    }
    System.out.println(sum);
    System.out.println(mul);
    } 

    public static int reverseupdate(int num){
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }
        return rev;
    }
}
