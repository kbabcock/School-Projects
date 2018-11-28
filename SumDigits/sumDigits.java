/**
 * This program asks for the number integers in your list and then asks for the numbers. 
 * After that, displays the numbers and sum of the numbers. Enjoy. 
 * Written by Kris Babcock for Module 4.
 */
import java.util.*;

public class sumDigits {
    public static void main(String[] args) {

        int aDigit, aNum, theSum=0;
        String aStringNum;
        char digitAt;

        Scanner console = new Scanner(System.in);

        System.out.println("Please enter a positive integer ");
        aNum = console.nextInt();

        aStringNum = String.valueOf(aNum);

        for (int count=0; count < aStringNum.length(); count++) {

            digitAt = aStringNum.charAt(count);

            aDigit = Character.getNumericValue(digitAt);

            theSum += aDigit;

            System.out.print(aDigit + " ");
        }

        System.out.println("The sum is:  " + theSum);
    }
}