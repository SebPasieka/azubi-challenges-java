package azubi.challenges.task003;

public class StringCompressor {

    /**
     * Für eine beliebigen String gebe die komprimierte 
     * Form zurück. 
     * 
     * Komprimiert bedeutet, dass der Ausgabewert immer
     * kleiner gleich dem Eingangswert ist. 
     *
     * Regeln:
     * - kommt ein Buchstabe 'c' direkt hintereinander 'n' mal vor,
     * dann wird die Zeichenfolge durch 'c' 'n' abgekürzt:
     * aaaa => a4, aabb => a2b2 
     *
     * - kommt ein Buchstabe 'c' nur einmal vor, so wird der 
     * Buchstabe nicht verkürzt:
     * a => a, abc => abc
     * 
     * - ist der komprimierte string genauso lang wie die
     * Eingabe, gebe die Eingabe zurück
     * 
     * @return compressed string
     */
    public static String compress(String input) {
        String originInput = input;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            int count = 1;
            while (i < input.length() - 1 &&
                    input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(input.charAt(i));
            if (count != 1) {
                sb.append(count);
            }
        }
        input = sb.toString();
        if (originInput.length() == input.length()) {
            return originInput;
        }
        return input;
    }
}