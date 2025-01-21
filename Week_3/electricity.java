package Week_3;
import java.util.Scanner;
public class electricity {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of units");
        int numberOfUnits = sc.nextInt();
        electricitybill(numberOfUnits);
    }
    public static void electricitybill(int n) {
        if(n<=50){
            System.out.println("Rs. 0.50\\unit, the total charge is: " + n*0.50);
        }
        else if(n>=51 && n<= 150){
            System.out.println("Rs. 0.75\\unit, the total charge is: " + (n-50)*0.75+(0.50*50));
        }
        else if(n>=151 && n<= 250){
            System.out.println("Rs. 1.20\\unit, the total charge is: " + ((n-50)*1.20)+(0.75*100)+(0.50*50));
        }
        else{
            System.out.println("Rs. 1.50\\unit,and an addition surcharge is added(20%), the total charge is: " + ((n-250)+(1.20*100)+(0.75*100)+(0.50*50)+(1.50+0.2)));
        }
        
    }
}