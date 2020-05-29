import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeyIAlreadyDidThatTests {
    @Test
    public void testExampleOne() {
        int expected = 3;
        int actual = HeyIAlreadyDidThat.Solution.solution("210022", 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testExampleTwo() {
        int expected = 1;
        int actual = HeyIAlreadyDidThat.Solution.solution("1211", 10);
        assertEquals(expected, actual);
    }
}