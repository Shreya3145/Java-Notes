package Patterns;
public class LetterPattern {
    public static void main(String[] args) {
        int n = 5; 
        char letter = 'A'; 
        for (int i = 1; i <= n; i++) {
            letter = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
    }
}
