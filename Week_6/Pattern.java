package Week_6;
public class Pattern {
    public static void main(String[] args) {
        String[] arr[] = {{"*", "*", "*", "*", "*"}}; 

        int rows = arr[0].length; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[0][j]+" "); 
            }
            System.out.println(); 
        }
    }
}