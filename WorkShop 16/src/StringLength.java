import java.util.Scanner;
//Q4
public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input in string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        // find the length
        int length = inputString.length();
        System.out.println("Length of the string: " + length);
        System.out.print("Enter an index to get the character: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < length) {
            char character = inputString.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } else {
            System.out.println("Invalid index.enter a value between 0 and " + (length - 1) + ".");
        }
    }
}
