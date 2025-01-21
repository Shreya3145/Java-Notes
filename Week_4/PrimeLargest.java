package Week_4;

import java.util.Scanner;
public class PrimeLargest {
	    public static boolean isPrime(int num) {
	    	int count=2;
			for(int i=2; i<=num/2;i++) {
				if (num%i ==0)
				{
					count++;
					break;
				}
			}
			if(count ==2) 
				return true;
			
			else
			    return false;
	    }
	    public static boolean isIncreasingOrder(int num) {
	    	int digit=0;
	    	boolean f = true;
	    	while(num !=0) {
	    		digit = num % 10;
	    		num /= 10;
	    	    if(digit >= num %10) {
	    		       continue;
	    	     }
	    	    else
	    	       f = false;
	    	       break;
	    	}
	    	return f;
	    }

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the start of the range:");
	        int start = s.nextInt();
	        System.out.println("Enter the end of the range:");
	        int end = s.nextInt();
	        System.out.println("Prime numbers between " + start + " and " + end + " whose digits are in increasing order:");
	        for (int num = start; num <= end; num++) {
	            if (isPrime(num) && isIncreasingOrder(num)) {
	                System.out.println(num);
	            }
	        }
	   
	        s.close();
	    }
	}
