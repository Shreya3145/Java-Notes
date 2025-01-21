package Patterns;
public class Pattern1 {
    public static void main(String[] args) {
        char letter = 'A';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
            System.out.print(letter++ + " ");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= 10; i++) {
            System.out.print(2 * i + " ");
            if (i == 5) 
            System.out.println(); 
        }
    }

}
