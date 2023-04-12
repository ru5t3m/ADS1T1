import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ask user for input number
        int n = input.nextInt();
        // calculate n!
        int nfact = factorial(n);
        // output result
        System.out.println(nfact);
    }

    // recursive function to calculate n!
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
