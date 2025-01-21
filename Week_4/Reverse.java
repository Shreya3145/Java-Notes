package Week_4;
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println(rev(num));
        int reve = rev(num);
        System.out.println(reve);
        //palindrome(reve, num);
        sc.close();
        

}
public static int rev(int num) {
    int rev = 0;
        while(num>0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
return rev;
}
/* public static void palindrome(int rev, int num) {
    if(rev==num){
        System.out.println("The number is a palindrome");
    }
    else{
        System.out.println("The number is not a palindrome");
    }
}*/
}
