package azubi.challenges.task004;

import java.util.Arrays;

public class PermutedMultiples {

    public static void main(String...args) {
        findSmallestPermutation(3800000);
    }


        /**
         * Given the positive number 125874 .. if you multiply that by 2 (which is 251748) and
         * compare both numbers you will notice that both share the same digits, meaning they are permutations.
         *
         * x = 125874
         * x2 = 251748
         * Permutation!
         *
         * Find the smallest positive integer x, such that x2, x3, x4, x5 and x6 are all permutations!!
         */
        public static void findSmallestPermutation (int maxFactor){

            for (int i = 2; i <= maxFactor; i++) {
               int candidate2 = 2 * i;
               int candidate3 = 3 * i;
               int candidate4 = 4 * i;
               int candidate5 = 5 * i;
               int candidate6 = 6 * i;
               char[] candidateChars2 = String.valueOf(candidate2).toCharArray();
               char[] candidateChars3 = String.valueOf(candidate3).toCharArray();
               char[] candidateChars4 = String.valueOf(candidate4).toCharArray();
               char[] candidateChars5 = String.valueOf(candidate5).toCharArray();
               char[] candidateChars6 = String.valueOf(candidate6).toCharArray();
               Arrays.sort(candidateChars2);
               Arrays.sort(candidateChars3);
               Arrays.sort(candidateChars4);
               Arrays.sort(candidateChars5);
               Arrays.sort(candidateChars6);
               if (Arrays.equals(candidateChars2,candidateChars3) && Arrays.equals(candidateChars2,candidateChars4) && Arrays.equals(candidateChars2,candidateChars5) && Arrays.equals(candidateChars2,candidateChars6)) {
                  System.out.println("Permutation gefunden bei " + candidate2 + " (" + i + ")");
                  break;
               }
           }

        }
    }

