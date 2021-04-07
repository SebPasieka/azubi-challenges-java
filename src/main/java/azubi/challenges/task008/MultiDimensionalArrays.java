package azubi.challenges.task008;

import java.util.*;

/**
 * Regarding multidimensional arrays ..
 * https://www.dummies.com/programming/java/java-use-arrays-with-two-dimensions-or-more/
 */
public class MultiDimensionalArrays {

    private static final Random random = new Random();

    public static void main(final String...args) {
        int[][] randomMatrix = buildRandomMatrix(5);
        printMatrix(randomMatrix);
    }

    /**
     * Returns a matrix initialized with random numbers.
     *
     * Example:
     *   dimension = 3
     *   42   27389      -74
     *   8376    -5   728397
     *   -727   634 28937293
     */
    public static int[][] buildRandomMatrix(final int dimension) {
        int[][] randomNumberMatrix = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < randomNumberMatrix[i].length; j++) {
                int randomNumber = random.nextInt();
                randomNumberMatrix[i][j] = randomNumber; // (int)(Math.random()*10);
            }
        }
        return randomNumberMatrix;
    }

    /**
     * Sums two independent matrices.
     *
     * Example:
     *   Matrix 1:
     *   1 4 7
     *   2 5 8
     *   3 6 9
     *
     *   Matrix 2:
     *   1 4 7
     *   2 5 8
     *   3 6 9
     *
     *   Result:
     *   2  8 14
     *   4 10 16
     *   6 12 18
     */
    public static int[][] sumMatrices(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                m1[i][j] += m2[i][j];
            }
        }
        return m1;
    }

    /**
     * Returns a matrix initialized with increasing numbers column-wise.
     *
     * Example:
     *   dimension = 3
     *   1 4 7
     *   2 5 8
     *   3 6 9
     */
    public static int[][] buildMatrixHavingIncreasingColumnCounts(final int dimension) {
        int[][] increasingColumnMatrix = new int[dimension][dimension];
        int number = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < increasingColumnMatrix[i].length; j++) {
                number++;
                increasingColumnMatrix[j][i] = number;
            }
        }
        return increasingColumnMatrix;
    }

    /**
     * Hard!
     *
     * Returns a matrix initialized with an increasing spiral clockwise.
     * The dimension must be odd (1, 3, 5, 7).
     *
     * @throws IllegalArgumentException when dimension is even (e.g. 2, 4, 6, 8).
     *
     * Example:
     *  21 22 23 24 25
     *  20  7  8  9 10
     *  19  6  1  2 11
     *  18  5  4  3 12
     *  17 16 15 14 13
     *
     */
    public static int[][] buildSpiralSquare(final int dimension) {
        int[][] spiralSquareMatrix = new int[dimension][dimension];
        int max = dimension * dimension, horizontalStart = 0, horizontalEnd = dimension - 1, perpendicularStart = 0, perpendicularEnd = dimension - 1;
        if (dimension % 2 != 0) {
            while (max >= 1) {
                for (int i = horizontalEnd; i >= horizontalStart; i--) {
                    spiralSquareMatrix[perpendicularStart][i] = max--;
                }

                for (int j = perpendicularStart + 1; j <= perpendicularEnd - 1; j++) {
                    spiralSquareMatrix[j][horizontalStart] = max--;
                }

                for (int i = horizontalStart; i <= horizontalEnd - 1; i++) {
                    spiralSquareMatrix[perpendicularEnd][i] = max--;
                }

                for (int j = perpendicularEnd; j >= perpendicularStart + 1; j--) {
                    spiralSquareMatrix[j][horizontalEnd] = max--;
                }
                horizontalStart++;
                horizontalEnd--;
                perpendicularStart++;
                perpendicularEnd--;
            }
            return spiralSquareMatrix;
        }
        throw new IllegalArgumentException("please use an odd parameter");
    }
    // --- utility methods, feel free to use

    public static void printMatrix(int[][] square) {
        final int maxNumber = square.length * square.length;
        final int maxDigits = Integer.toString(maxNumber).length();

        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                final int number = square[row][col];
                final String paddedNumber = padLeftSpaces(number, maxDigits + 1);

                System.out.print(paddedNumber);
            }
            System.out.println();
        }
    }

    private static String padLeftSpaces(int input, int length) {
        final int inputLength = Integer.toString(input).length();
        if (inputLength > length) {
            return Integer.toString(input);
        }

        final StringBuilder sb = new StringBuilder();
        while (sb.length() < (length - inputLength)) {
            sb.append(' ');
        }
        sb.append(input);
        
        return sb.toString();
    }
}