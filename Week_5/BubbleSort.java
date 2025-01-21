package Week_5;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter the elements to bubble sort");
	int[] arr = new int[5];
	for(int i=0; i<arr.length; i++) {
		arr[i]=s.nextInt();
	}
	s.close();
	System.out.println("Before sorting " + Arrays.toString(arr));
	bubbleSort(arr);
	System.out.println("After sorting " + Arrays.toString(arr));
}
public static void bubbleSort(int[] arr) {
	int temp;
	for(int i=0; i<(arr.length -1); i++) {
		for(int j=0; j<(arr.length-1-i); j++) {
		if(arr[j]>arr[j+1]) {
			temp = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
		//System.out.println("pass-"+ i + " is " + Arrays.toString(arr));
		
		}
}
}
