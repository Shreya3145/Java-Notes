package Test_Preparation;

import java.util.Scanner;

public class Ques3 {
     @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of small bars: ");
        int smallBars = sc.nextInt();

        System.out.print("Enter the number of big bars: ");
        int bigBars = sc.nextInt();

        System.out.print("Enter the goal weight: ");
        int goalWeight = sc.nextInt();
        int result = makeChocolate(smallBars, bigBars, goalWeight);
        System.out.println(result);
     }
     public static int makeChocolate(int smallBars, int bigBars, int goalWeight) {
        int max = 0;
        max = goalWeight % 5;
        if(max==0){
            return -1;
        }
        else{
            int s = max;
            return s;
        }
     }
    
}
