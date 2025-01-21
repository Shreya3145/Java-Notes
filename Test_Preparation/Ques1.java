package Test_Preparation;
public class Ques1 {
    public static void main(String[] args) {
        int n = 5244;
        int digit; 
        int val = 1;
        while(n > 0){
            digit = n % 10;
            val = digit * val;
            n = n/10;
        }
        System.out.println(val);

    }
    
}
