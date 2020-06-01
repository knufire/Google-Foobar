import java.math.BigInteger;

public class BombBaby {
    
    public static class Solution {

        private static final String FAIL = "impossible";

        public static String solution(String x, String y) {
            BigInteger m = new BigInteger(x);
            BigInteger f = new BigInteger(y);
            BigInteger generations = BigInteger.valueOf(0);
            while ((m.signum() > 0 && f.signum() > 0)) {
                if (m.equals(BigInteger.ONE) && f.equals(BigInteger.ONE)) {
                    return generations.toString();
                }
                if (m.equals(BigInteger.ONE)) {
                    return generations.add(f.subtract(BigInteger.ONE)).toString();
                }
                if (f.equals(BigInteger.ONE)) {
                    return generations.add(m.subtract(BigInteger.ONE)).toString();
                }
                if (m.equals(f)) {
                    break; // This is an impossible situtation to solve, so automatically fail.
                } else if (m.compareTo(f) < 0) {
                    BigInteger[] dividendAndRemainder = f.divideAndRemainder(m);
                    f = dividendAndRemainder[1];
                    generations = generations.add(dividendAndRemainder[0]);
                } else if (m.compareTo(f) > 0) {
                    BigInteger[] dividendAndRemainder = m.divideAndRemainder(f);
                    m = dividendAndRemainder[1];
                    generations = generations.add(dividendAndRemainder[0]);
                }
            }
            return FAIL;
        }
    }
}