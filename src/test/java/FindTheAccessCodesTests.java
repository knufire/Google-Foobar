import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindTheAccessCodesTests {

    @Test
    public void testExampleOne() {
        int[] input = { 1, 1, 1 };
        int expected = 1;
        int actual = FindTheAccessCodes.Solution.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testExampleTwo() {
        int[] input = { 1, 2, 3, 4, 5, 6 };
        int expected = 3;
        int actual = FindTheAccessCodes.Solution.solution(input);
        assertEquals(expected, actual);
    }

}