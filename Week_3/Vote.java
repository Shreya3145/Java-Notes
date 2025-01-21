package Week_3;
import java.util.Scanner;
public class Vote {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        vote(age);
    }
    public static void vote(int age){
        System.out.println("Welcome");
        if(age>=18)
         System.out.println("Eligible to vote");
        System.out.println("Bye");
    }
}
