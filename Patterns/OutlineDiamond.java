package Patterns;

public class OutlineDiamond {
    public static void main(String[] args) {
        int rows = 5;
    for(int i=1; i<=rows; i++) {
        for(int j=rows; j>i; j--) {
                System.out.print(" ");
        }
        for(int k=1; k <= i; k++) {
            if (k == 1 || k == i) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
            System.out.println();    
        }

    for(int i=rows; i>=1; i--) {
        for(int j=rows; j>i; j--) {
            System.out.print(" ");
            
        }
        for(int k=1; k<=i; k++) {
            if (k == 1 || k == i) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
            
        }
        System.out.println();
        
    }
        
    }
    
    
}
