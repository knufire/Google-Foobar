import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HeyIAlreadyDidThat {

    public static class Solution {

        public static int solution(String n, int b) {
            final int k = n.length();
            Map<String, Integer> previousIds = new HashMap<>();
            previousIds.put(n, 1);
            String z;
            do {
                Integer x = Integer.parseInt(sortDescending(n), b);
                Integer y = Integer.parseInt(sortAscending(n), b);
                z = Integer.toString(x-y, b);
                for (int i = 0; i < k - z.length(); i++) {
                    z = "0" + z;
                }
                previousIds.putIfAbsent(z, 0);
                previousIds.put(z, previousIds.get(z) + 1);
                n = z;
            } while (previousIds.get(z) < 3);
            return Collections.frequency(previousIds.values(), 2) + 1;
        }

        private static String sortAscending(String s) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            return new String(temp);
        }

        private static String sortDescending(String s) {
            return new StringBuilder(sortAscending(s)).reverse().toString();
        }

    }
    
}