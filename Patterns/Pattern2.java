package Patterns;

public class Pattern2 {
        public static void main(String[] args) {
            int size = 5; 
    
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j) {
                        System.out.print((char) ('A' + i) + " ");
                    } else {
                        // Print numbers based on logic
                        System.out.print(3 + Math.abs(i-j) + " ");
                    }
                }
                System.out.println();
            }
        }
    }
