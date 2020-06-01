import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FuelInjectionPerfectionTests {

    @Test
    public void testExampleOne() {
        String input = "15";
        int expected = 5;
        int actual = FuelInjectionPerfection.Solution.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testExampleTwo() {
        String input = "4";
        int expected = 2;
        int actual = FuelInjectionPerfection.Solution.solution(input);
        assertEquals(expected, actual);
    }
    
}