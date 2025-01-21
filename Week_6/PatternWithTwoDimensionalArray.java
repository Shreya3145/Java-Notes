package Week_6;
public class PatternWithTwoDimensionalArray {
    public static void main(String[] args) {
        String[] arr[] = new String[5][5];
        int size = arr.length;
        for(int i = 0; i<= arr.length; i++) {
            for(int j = 0; j<= arr.length; j++) {
            if(j+i>=size) {
            System.out.print("* ");
            }
            else {
            System.out.print("  ");
            }
           
            }
            System.out.println();
           }
    }
    
}
