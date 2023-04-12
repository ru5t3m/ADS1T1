import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ask user for input values of n and k
        int n = input.nextInt();
        int k = input.nextInt();
        // compute the binomial coefficient using recursion
        int binomial = binomialCoef(n, k);
        // output the result
        System.out.println(binomial);
    }
    // recursive function to compute the binomial coefficient
    public static int binomialCoef(int n, int k) {
        // base case: if k is 0 or k equals n, the binomial coefficient is 1
        if (k == 0 || k == n) {
            return 1;
        }
        // binomial coefficient using the formula
        return binomialCoef(n - 1, k - 1) + binomialCoef(n - 1, k);
    }
}
