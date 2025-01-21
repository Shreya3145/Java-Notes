package Patterns;

public class Pattern5 {
        public static void main(String[] args) {
            // Define all rows in an array for reuse
            int[] row1And5 = {1, 2, 3, 4, 5};
            char[] row2And4 = {'A', 'B', 'C', 'D', 'E'};
            int[] row3 = {1, 2, 4, 4, 5};
    
            // Print all rows
            printArray(row1And5);
            printArray(row2And4);
            printArray(row3);
            printArray(row2And4);
            printArray(row1And5);
        }
    
        // Helper method to print int array
        private static void printArray(int[] array) {
            for (int num : array) System.out.print(num + " ");
            System.out.println();
        }
    
        // Helper method to print char array
        private static void printArray(char[] array) {
            for (char ch : array) System.out.print(ch + " ");
            System.out.println();
        }
    }