import java.util.Scanner;

public class T1 {
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
        int minimum = findMinimum(arr);
        // output result
        System.out.println(minimum);
    }

    public static int findMinimum(int[] arr) throws Exception {
        int n = arr.length; // set new local variable that indicates an array length
        if (n == 0) {
            // if array is empty, return Exception error
            throw new Exception("n must be greater than 0 ");
        }
        int minimum = arr[0]; //minimum value set
        for (int i = 1; i < n; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i]; //compare other values to the minimum and define another minimum value if a number is less
            }
        }
        return minimum; //"output" minimum
    }
}
