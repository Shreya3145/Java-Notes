package Week_4;
public class SumOfFirst20PrimeNumbers {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numPrimesToPrint = 20;
        int count = 0;
        int num = 2;

        while (count < numPrimesToPrint) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}