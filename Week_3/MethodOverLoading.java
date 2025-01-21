package Week_3;
import java.util.Scanner;
public class MethodOverLoading {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Welcome");
            System.out.println("Eligibe to Vote");
            System.out.println("Bye");

        }
        else{
            System.out.println("Welcome");
            System.out.println("Bye");
        }


        
    }
}