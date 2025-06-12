//Q3
import java.util.Scanner;

public class SubstringExtractor {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("Enter Start:");
        int start = scanner.nextInt();
        System.out.print("Enter end: ");
        int end = scanner.nextInt();
        //substring
        String substring = inputString.substring(start, end);
        //display extracted substring
        System.out.println("Extracted substring:" + substring);
    }
}
