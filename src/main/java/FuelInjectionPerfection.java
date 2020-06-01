import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FuelInjectionPerfection {
    public static class Solution {

        private static final Map<BigInteger, Integer> CACHE = new HashMap<>();

        public static int solution(String x) {
            CACHE.put(BigInteger.ONE, 0);
            BigInteger num = new BigInteger(x);
            return calculateSteps(num);
        }

        public static int calculateSteps(BigInteger num) {
            if (!CACHE.containsKey(num)) {
                if (num.testBit(0)) { // last b it is set to 1, therefore number is odd
                    CACHE.put(num, Math.min(
                            calculateSteps(num.add(BigInteger.ONE)), 
                            calculateSteps(num.subtract(BigInteger.ONE)))
                        + 1);
                } else { // Number is even, divide by 2 and recurse
                    CACHE.put(num, calculateSteps(num.shiftRight(1)) + 1);
                }
            }
            return CACHE.get(num);
        }
    }
}