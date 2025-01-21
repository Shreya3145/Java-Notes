package Week_5;

import java.util.Arrays;

public class MatrixMul {
    public static void main(String[] args) {
        int arr1[][] = {{1, 1, 1},{2, 2, 2},{3, 3, 3}};
        int arr2[][] = {{1, 1, 1},{2, 2, 2},{3, 3, 3}};
        int res[][] = new  int[3][3];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length;j++){
                int sum = 0;
                for(int k=0; k<arr1.length;k++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                res[i][j] = sum;
            }
        }
    System.out.println(Arrays.deepToString(res));
        
    
    }
    
}
