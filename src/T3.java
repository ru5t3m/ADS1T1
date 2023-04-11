import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user for input number
        int n = input.nextInt();

        // output result
        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    // function to check if a number is prime
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
}
