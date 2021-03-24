package azubi.challenges.task002;

public class UniqueCharsTester {

    /**
     * hasUniqueChars returs true, when the given string consists only of 
     * unique chars, false otherwise
     * 
     * @param candidate given String to test
     */
    public static boolean hasUniqueChars(String candidate) {
        int candidateLength = candidate.length();
        if (candidateLength > 256) return false;
        if (candidateLength <= 1) return true;

        boolean[] checkingArray = new boolean[256];

        for (int i = 0; i < candidateLength; i++) {

            char value = candidate.charAt(i);

            if (checkingArray[value]) return false;

            checkingArray[value] = true;
        }

        return true;
    }
}