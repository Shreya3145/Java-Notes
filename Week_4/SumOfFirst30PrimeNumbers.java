package Week_4;
public class SumOfFirst30PrimeNumbers {
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
        int numPrimesToConsider = 30;
        int count = 0;
        int num = 2;
        int sum = 0;

        while (count < numPrimesToConsider) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("Sum of the initial " + numPrimesToConsider + " prime numbers: " + sum);
    }

}