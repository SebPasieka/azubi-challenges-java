package azubi.challenges.task005;

import java.util.Arrays;
import java.util.Objects;

public class MirrorProduct {

    public static void main(String...args) {

        findLargestMirrorProduct(4);
    }

    /**
     * Prerequisite: A palindrome is a word that reads the same when reversed.
     * Anna reversed remains Anna, noon stays noon, Madam, Mom, radar, etc.
     * 
     * The same goes for numbers, 1001 can be mirrored, or 10801, 1 etc.
     * 
     * Task: We're looking for the largest product being a palindrome on condition that
     * the factors must have exactly 4 digits and the product must be the largest of all 4 digit factors!
     * The factors do *not* have to be palindromes itself!!
     * 
     * Example:
     *   digits = 2
     *   factor 1 = 91 // 2 digits, not a palindrome because it's not required!
     *   factor 2 = 99 // 2 digits, coincidentally a palindrome but who cares?!
     *   product = 9009 // palindrome and largest product of all 2 digit factors!!
     * 
     * Example:
     *   digits = 4
     *   factor 1 = 1001 // 4 digits
     *   factor 2 = 1001 // 4 digits
     *   product =  1002001 // palindrome yes, but there are other factors resulting in a larger product 
     */
    public static int findLargestMirrorProduct(int digits) {
        int upperLimit = (int)Math.pow(10, digits) - 1;
        int lowerLimit = 1 + upperLimit / 10;

        int maxProduct = 0;

        for (int i = upperLimit; i >= lowerLimit; i--) {
            for (int j = i; j >= lowerLimit; j--) {
                int product = i * j;
                if (product < maxProduct) {
                    break;
                }
                int number = product;
                int reverse = 0;

                while (number != 0) {
                    reverse = reverse * 10 + number % 10;
                    number /= 10;
                }

                if (product == reverse && product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        System.out.println("The largest Palindrome of two "+ digits +" digit factors is " + maxProduct);
        return maxProduct;
    }
}