package Patterns;
import java.util.Scanner;
public class LetterPattern2 {
    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		printpattern(n);
        sc.close();
	}
    public static void printpattern(int num) {
    	char ch='A';
    	char ch1='A';
    	for(int i = 1;i <=num ; i++) {
    		for(int j = 1;j <= num; j++) {
    			if(i==j) {
    				System.out.print(ch + " ");
    				ch++;
    			}
    			else if(i==2 && j==1) {
    				System.out.print('A' + " ");
    			}
    			else if(i>=j) {
    				System.out.print(ch1++ + " ");
    			}
    			else {
    				System.out.print("  ");
    			}
    		}
    		System.out.println();
        }
    
    }
    }