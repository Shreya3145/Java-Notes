package Week_3;
import java.util.Scanner;
public class CollegeDetails {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter blood group: ");
        char bloodGroup = sc.next().charAt(0);

        System.out.println("Enter your department: ");
        String dept = sc.nextLine();

        System.out.println("Enter your cgpa: ");
        double cgpa = sc.nextDouble();

        System.out.println("Leave a review: ");
        String review = scan.nextLine();  

        CollegeDetails details = new CollegeDetails();
        details.name(name);
        details.age(age);
        details.bloodGroup(bloodGroup);
        details.dept(dept);
        details.cgpa(cgpa);
        details.review(review);
        
        
    }
    public String name(String name){
        return name;
    }
    public int age(int age){
        return age;
    }
    public char bloodGroup(char bloodGroup){
        return bloodGroup;
    }
    public String dept(String dept){
        return dept;
    }
    public double cgpa(double cgpa){
        return cgpa;
    }
    public String review(String review){
        return review;
    }
                        
}
