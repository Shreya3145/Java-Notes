package Test_Preparation;
import java.util.Scanner;

public class Ques2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        boolean isSummer = sc.nextBoolean();
        if((temp>60 && temp<90 && isSummer == false)||(isSummer && temp >= 60 && temp <= 100)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
}

