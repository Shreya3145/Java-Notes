package Week_5;
import java.util.Scanner;
public class FindOccurenceOfAllElements {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of elements of 1st array");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the element one by one");
		for (int i=0; i<arr.length; i++) {
			arr[i]=s.nextInt();
		}
		s.close();
		for (int i=0; i<arr.length; i++) {
			int count = 1;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = Integer.MIN_VALUE;
					count++;
				}
			}
			if(arr[i] != Integer.MIN_VALUE)
			 System.out.println(arr[i] + ": " + count + " Occurence");
			
		}
	}		
}