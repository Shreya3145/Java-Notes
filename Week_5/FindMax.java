package Week_5;
import java.util.Scanner;
public class FindMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = 0;

        System.out.println("Enter the values: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++){
        if(arr[i]<arr[i+1]){
            max = arr[i+1];
        }
    }
    System.out.println("The maximum element in an array is " + max);
}
}