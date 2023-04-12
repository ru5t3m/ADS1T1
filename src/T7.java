import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ask user to input size of an array
        int n = input.nextInt();
        int[] arr = new int[n];
        // input elements
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        // reverse the array using recursion
        reverseArray(arr, 0, n - 1);
        // output the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // recursive function to reverse an array
    public static void reverseArray(int[] arr, int start, int end) {
        // base case: if start >= end, the array is already reversed
        if (start >= end) {
            return;
        }
        // swap the first and last elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // recursively call the function with the second and second-to-last elements
        reverseArray(arr, start + 1, end - 1);
    }
}
