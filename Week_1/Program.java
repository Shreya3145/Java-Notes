package Week_1;
public class Program {
    public static void main(String[] args) { //local scope
        int a = 10; //local variable
        {
            int b = 20;
            System.out.println(b); // nested block
            System.out.println(a);
        }
        {
            int c = 30; 
            System.out.println(c); // nested block
            System.out.println(a);

        }

}
}
