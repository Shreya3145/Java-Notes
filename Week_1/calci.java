package Week_1;
public class calci {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        add(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);
        mod(a, b);
        
    }
    public static void add(int a, int b){
        System.out.println(a + b);

    }
    public static void sub(int a, int b){
        System.out.println(a - b);
        
    }
    public static void mul(int a, int b){
        System.out.println(a * b);
        
    }
    public static void div(int a, int b){
        System.out.println(a / b);
    }
    public static void mod(int a, int b){
        System.out.println(a % b);
    }
    
}
