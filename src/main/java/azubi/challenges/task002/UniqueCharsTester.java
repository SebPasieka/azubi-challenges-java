package azubi.challenges.task002;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharsTester {

    /**
     * hasUniqueChars returs true, when the given string consists only of 
     * unique chars, false otherwise
     * 
     * @param candidate given String to test
     */
    public static boolean hasUniqueChars(String candidate) {
        int candidateLength = candidate.length();
        if (candidateLength <= 1) return true;

        char[] charOfCandidate = candidate.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < candidateLength; i++) {
            if (!map.containsKey(charOfCandidate[i])) {
                map.put(charOfCandidate[i], 1);
            } else {
                int oldValue = map.get(charOfCandidate[i]);
                int newValue = ++oldValue;
                map.put(charOfCandidate[i], newValue);
            }
        }
        for (Map.Entry<Character, Integer> data : map.entrySet()) {
            if (data.getValue() > 1) return false;
        }
        return true;
    }
}