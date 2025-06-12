//Q6
import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character to find: ");
        char ch = sc.next().charAt(0);

        int index = str.indexOf(ch);

        if (index == -1) {
            System.out.println("Character not found");
        } else {
            System.out.println("First occurrence at index: " + index);
        }
    }
}

