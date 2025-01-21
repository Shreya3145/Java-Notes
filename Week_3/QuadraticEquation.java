package Week_3;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();
        
        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();
        
        System.out.println("Enter the value of c:");
        double c = sc.nextDouble();
        sc.close();
        
        double discriminant = (b * b) - (4 * a * c);
        
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots are real and distinct: root1 = %.2f, root2 = %.2f%n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Roots are real and equal: root = %.2f%n", root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Roots are complex: root1 = %.2f + %.2fi, root2 = %.2f - %.2fi%n", realPart, imaginaryPart, realPart, imaginaryPart);
        }

    }
}
