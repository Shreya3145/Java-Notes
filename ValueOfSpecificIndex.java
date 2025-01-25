//Find out an index of a specified element from a given array?
import java.util.Arrays;
import java.util.Scanner;
public class ValueOfSpecificIndex {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3, 4, 2, 6, 1, 4};
        System.out.println("This is the array"+Arrays.toString(arr));

        System.out.print("Enter an element whose index will be returned: ");
        int key = sc.nextInt();

        valueFind(arr, key);
    }
    public static void valueFind(int[] arr, int key){
        boolean found = false;
        for(int i = 0; i< arr.length; i++){
            if(key == arr[i]){
            System.out.println("The value is found at index: "+i);
            found = true;
            }

        }
        if(!found){
            System.out.println("The element doesn't exist in the array!");
        }
    }
}
