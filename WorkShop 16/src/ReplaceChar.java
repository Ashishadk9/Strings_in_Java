//Q7
import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to replace: ");
        char oldChar = sc.nextLine().charAt(0);

        System.out.print("Enter replacement character: ");
        char newChar = sc.nextLine().charAt(0);

        String result = str.replace(oldChar, newChar);
        System.out.println("Result: " + result);
    }
}
