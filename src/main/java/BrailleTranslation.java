public class BrailleTranslation {

    public static class Solution {

        public static final String[] BRAILLE_CODES = { "100000", "110000", "100100", "100110", "100010", "110100",
                "110110", "110010", "010100", "010110", "101000", "111000", "101100", "101110", "101010", "111100",
                "111110", "111010", "011100", "011110", "101001", "111001", "010111", "101101", "101111", "101011" };

        public static final String BRAILLE_SPACE = "000000";
        public static final String BRAILLE_CAPITALIZATION = "000001";

        public static String solution(String s) {
            StringBuilder output = new StringBuilder();
            if (s != null) {
                for (char c : s.toCharArray()) {
                    output.append(getBrailleCode(c));
                }
            }
            return output.toString();
        }

        public static String getBrailleCode(char c) {
            if (Character.valueOf(' ').equals(c)) {
                return BRAILLE_SPACE;
            }

            String output = "";
            if (Character.isUpperCase(c)) {
                output += BRAILLE_CAPITALIZATION;
                c = Character.toLowerCase(c);
            }
            output += BRAILLE_CODES[getIndexFromLowercaseAsciiCode(c)];
            return output;
        }

        public static int getIndexFromLowercaseAsciiCode(char c) {
            return (int) c - 97;
        }
    }
}