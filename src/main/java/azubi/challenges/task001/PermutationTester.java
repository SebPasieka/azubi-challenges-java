package azubi.challenges.task001;

import java.util.Arrays;

public class PermutationTester {

    /**
     * isPermutationOfOther return true, when first is a permutation of second,
     * false otherwise.
     *
     * A permutation is an reordering of the characters.
     *
     * @param first String
     * @param second String
     */
    public static boolean isPermutationOfOther(String first, String second) {
        int lengthFirstString = first.length();
        int lengthSecondString = second.length();

        if (lengthFirstString != lengthSecondString) {
            return false;
        }

        char firstChar[] = first.toCharArray();
        char secondChar[] = second.toCharArray();

        Arrays.sort(firstChar);
        Arrays.sort(secondChar);

        String firstString = Arrays.toString(firstChar);
        String secondString = Arrays.toString(secondChar);

        if (firstString.equals(secondString)) {
            return true;
        }
        return false;
    }
}