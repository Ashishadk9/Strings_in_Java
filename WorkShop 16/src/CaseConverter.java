//Q9
import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Uppercase: " + input.toUpperCase());
    }
}
