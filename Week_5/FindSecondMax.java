package Week_5;
import java.util.Arrays;
import java.util.Scanner;
public class FindSecondMax{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = 0;

        
        System.out.println("Enter the values: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++){
        Arrays.sort(arr);
        if(arr[i]<arr[i+1]){
            max = arr[arr.length-2];
        }
    }
    sc.close();
    System.out.println("The second maximum element in an array is " + max);
}
}
