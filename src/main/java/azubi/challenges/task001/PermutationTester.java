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
        // get lengths of both Strings
        int a1 = first.length();
        int a2 = second.length();

        // check if both Strings has the same length
        if (a1 != a2) {
            return false;
        }
        // save Stings as CharArrays
        char ch1[] = first.toCharArray();
        char ch2[] = second.toCharArray();

        // sort them
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // compare the Strings
        for (int i = 0; i < a1; i++) {
            if (ch1[i] != ch2[i])
            return false;
        }
        return true;
    }
}