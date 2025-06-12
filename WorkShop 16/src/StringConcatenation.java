//Q1 and Q2
import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter frist string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter Second string:");
        String SecondString = scanner.nextLine();
        boolean areEqualUsingEquals = firstString.equals(SecondString);
        boolean areEqualUsingDoubleEquals = (firstString == SecondString);

        int comparisonResult = firstString.compareTo(SecondString);
        // Display
        System.out.println("Using equals(): " + areEqualUsingEquals);
        System.out.println("Using ==: " + areEqualUsingDoubleEquals);

        if (comparisonResult == 0) {
            System.out.println("The strings are equal.");
        } else if (comparisonResult > 0) {
            System.out.println("The first string is greater.");
        } else {
            System.out.println("The second string is greater.");
        }
        // String resultPlus= firstString + SecondString;
        // String resultConcat= firstString.concat(SecondString);

       // System.out.println("Concatenation using + operator:"+ resultPlus);
      //  System.out.println("Concatenation using concat() method:"+ resultConcat);;
    }
}
