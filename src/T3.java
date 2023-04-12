import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ask user for input number
        int n = input.nextInt();
        // output result
        if (isPrime(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    // function to check if a number is prime
    public static boolean isPrime(int n, int i) {
        // if a number is 1 or less, it cannot be prime by default
        if (n <= 1) {
            return false;
        }
        // number 2 is Prime by default
        if (n == 2){
            return true;
        }
        //
        if (n % i == 0){
            return false;
        }
        if (i * i > n){
            return true;
        }
        return isPrime(n, i+1);
    }
}
