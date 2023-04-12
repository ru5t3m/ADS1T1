import java.util.Scanner;

public class T2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // ask user for n array size
        int n = input.nextInt();
        // create array with "n" number of user input values
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        // call findMinimum function to find minimum value in array
        double average = findAverage(arr);
        // output result
        System.out.println(average);
    }

    public static double findAverage(int[] arr) throws Exception {
        int n = arr.length;
        if (n == 0) {
            // if array is empty, return Exception error
            throw new Exception("n must be greater than 0 ");
        }
        int sum = 0; // set sum to zero
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // find general sum of all values
        }
        double average = (double) sum / n; // divide sum to a number of values to find average
        return average;
    }
}
