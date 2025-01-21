package Week_4;
import java.util.Scanner;
public class Reverse2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            reverse(num);
            sc.close();
            
        }
        public static void reverse(int num){
            while(num>0){
            int num1 = num % 10; //3
            System.out.println(num1);

            int num2 = num / 10; //12
            num2 = num2 % 10; //2
            System.out.println(num2);

            int num3 = num / 100; //1
            System.out.println(num3);
            
            if(num1 > num2 && num2 > num3){
            System.out.println("Increasing order");
            }
            else{
                System.out.println("Not in Increasing order");
            }
            break;
        }
    
} 
}

