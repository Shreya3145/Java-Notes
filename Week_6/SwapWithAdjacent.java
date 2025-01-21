package Week_6;

import java.util.Arrays;

public class SwapWithAdjacent{
    public static void main(String[] args) {
        int num = 1234567;
        int[] arr = new int[7];
        int i = arr.length-1;
    
    while(num>0){
        
        int digit =  num % 10;
        arr[i] = digit;
        num /= 10;
        i--;
    }
    
    int temp = Integer.MIN_VALUE;

    for (int j = 0; j < arr.length-1; j=j+2){
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }

    System.out.println(Arrays.toString(arr)); // 2 1 4 3 6 5 

    for(int a : arr){
        while(a > 0){
            int digit =  a % 10;
            System.out.print(digit);
            a /= 10;
        }

    }
    }

}