package Week_3;
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Byte data: ");
        byte b = scan.nextByte();

        System.out.println("Enter a Short data: ");
        short s = scan.nextShort();

        System.out.println("Enter an Integer data: ");
        int i = scan.nextInt();

        System.out.println("Enter a Long data: ");
        long l = scan.nextLong();

        System.out.println("Enter a Float data: ");
        float f = scan.nextFloat();

        System.out.println("Enter a Double data: ");
        double d = scan.nextFloat();

        System.out.println("Enter a Boolean value");
        boolean bo = scan.nextBoolean();

        System.out.println("Enter a String: ");
        String str = scan.nextLine();

        System.out.println("Enter a character data: ");
        char ch = scan.next().charAt(0);

        System.out.println(b);
        System.out.println(s);
        System.out.println(f);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(bo);
        System.out.println(str);
        System.out.println(ch);


    }
}
