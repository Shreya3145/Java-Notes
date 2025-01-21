package Week_2;
public class Calculator{
    public static void main(String[] args) {
        System.out.println(add(20,10));
        System.out.println(sub(20, 10));
        System.out.println(mul(7,7));
        System.out.println(div(10, 5));
        System.out.println(mod(4, 3));
    }
    public static int add(int a, int b){
        int res = a+b;
        return res;
    }
    public static int sub(int a, int b){
        int res = a-b;
        return res;
    }
    public static int mul(int a, int b){
        int res = a*b;
        return res;
    }
    public static int div(int a, int b){
        int res = a/b;
        return res;
    }
    public static int mod(int a, int b){
        int res = a%b;
        return res;
    }

}