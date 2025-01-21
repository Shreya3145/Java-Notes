package Patterns;

public class Pattern3 {
        public static void main(String[] args) {
            int number = 1; 
            char letter = 'A'; 
    
            for (int i = 0; i < 5; i++) { 
                for (int j = 0; j < 5; j++) { 
                    if (i % 2 == 0) { 
                        System.out.print(number + " ");
                        number++;
                    } else { 
                        System.out.print(letter + " ");
                        letter++;
                    }
                }
                System.out.println(); 
            }
        }
    }
