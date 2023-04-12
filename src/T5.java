import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ask user for input number
        int n = input.nextInt();
        // calculate nth Fibonacci number
        int nth = fibonacci(n);
        // output result
        System.out.println(nth);
    }
    // recursive function to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
