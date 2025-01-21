package Week_3;
import java.util.Scanner;
public class Employee {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the basic salary of the employee: ");
            int basicSalary = sc.nextInt();
            double g = grossSalary(basicSalary);
            System.out.println(g);

        }
        public static double grossSalary(int basicSalary){
            double hra = 0.0, da = 0.0;
           if(basicSalary < 1500){
                hra = basicSalary * 0.1;
                da = basicSalary * 0.9;
              }
              else if(basicSalary >=500){
                hra = 500;
                da = basicSalary * 0.98;
           }
           return basicSalary + hra + da;
    }
}
