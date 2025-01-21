package Week_4;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a starting number: ");
        int s= sc.nextInt();
        System.out.println("Enter a ending number: ");
        int e = sc.nextInt();
        sc.close();
        prime(s, e);
    }
    public static void prime(int s, int e){
        for(int i = s; i <= e; i++){
            int count = 0;
            for(int j = 2; j <= i/2; j++){
                if(i%j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0 && i != 1){
                System.out.println(i);
            }
        }
    }
}
