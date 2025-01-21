package Week_3;
import java.util.*;
public class Quadratic {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To find quadratic equation enter a, b and c values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (b*b)-(4*a*c);
        quad(a,b,c,d);
    }
    public static void quad(int a, int b, int c,int d){
        if(d>0){
            double root1 = ((-b+Math.sqrt(d))/2*a);
            double root2 = ((-b-Math.sqrt(d))/2*a);
            System.out.println("Root 1:"+root1);
            System.out.println("Root 2:"+root2);

        }
        else if(d==0){
            double root =(-b/2*a);
            System.out.println("Root :"+root);

        }else{
            double root1 =(-b/2*a);
            double img = Math.sqrt(Math.abs(d));
            System.out.println("Root 1:"+root1);
            System.out.println("Root 2:"+img);
        }
    }
    
}
