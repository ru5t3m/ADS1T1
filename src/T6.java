import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ask user for input numbers
        int a = input.nextInt();
        int n = input.nextInt();
        // calculate a^n
        int apowern = power(a, n);
        // output result
        System.out.println(apowern);
    }
    // recursive function to calculate a^n
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }
}
