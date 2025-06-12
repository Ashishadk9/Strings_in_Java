import java.util.Scanner;
//Q5
public class SubstringCheck {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter substring: ");
        String subStr = sc.nextLine();

        if (mainStr.contains(subStr)) {
            System.out.println("Substring exists in main string");
        } else {
            System.out.println("Substring does not exist in main string");
        }
    }
}
