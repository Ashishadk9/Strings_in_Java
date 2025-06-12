//Q10
import java.util.Scanner;

public class StringOperations {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        // Take two string input
         System.out.print("Enter first string: ");
           String str1 = scanner.nextLine();
              System.out.print("Enter second string: ");
               String str2 = scanner.nextLine();
               //Concatenation
              String concatPlus= str1 + str2;
              String concatMethod= str1.concat(str2);
              System.out.println("\n Concatenation with+: " + concatPlus);
              System.out.println("Concatenation with concat():" + concatMethod);
               // Comparison
                System.out.println("\nComparison results:");
                 System.out.println("equals(): " + str1.equals(str2));
                 System.out.println("Comparison ==: "+(str1==str2));
                 System.out.println("compareTo(): "+ str1.compareTo(str2));
                 // Substring extraction
                  System.out.println("\nEnter start index:");
                  int start = scanner.nextInt();
                  System.out.println("Enter end index:");
                  int end = scanner.nextInt();
                  scanner.nextLine(); // Newline
                     String subString = str1.substring(start,end);
                     System.out.println("Substring: " + subString);
                  // Check if substring contains
                    System.out.print("\nEnter a character or word to check in substring: ");
                     String search = scanner.nextLine();
                     System.out.println("Substring contains '" + search + "': " + subString.contains(search));
    }
}
