import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ask user for input string
        String s = input.nextLine();
        // check if the string is all digits and output the answer
        if (isStringAllDigits(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    // recursion to check if a string consists only of digits
    public static boolean isStringAllDigits(String s) {
        // if the string is empty
        if (s.length() == 0) {
            System.out.println("String is empty, try again!");
            return true;
        }
        // check if the first character is a digit
        if (Character.isDigit(s.charAt(0))) {
            // recursively call the function with the remainder of the string
            return isStringAllDigits(s.substring(1));
        } else {
            // the character is not a digit, so the string does not consist only of digits
            return false;
        }
    }
}
