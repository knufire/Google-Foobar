import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BombBabyTests {

    @Test
    public void testExampleOne() {
        String inputX = "2";
        String inputY = "1";
        String expected = "1";
        String actual = BombBaby.Solution.solution(inputX, inputY);
        assertEquals(expected, actual);
    }

    @Test
    public void testExampleTwo() {
        String inputX = "4";
        String inputY = "7";
        String expected = "4";
        String actual = BombBaby.Solution.solution(inputX, inputY);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoGenerations() {
        String inputX = "1";
        String inputY = "1";
        String expected = "0";
        String actual = BombBaby.Solution.solution(inputX, inputY);
        assertEquals(expected, actual);
    }

    @Test
    public void testImpossible() {
        String inputX = "2";
        String inputY = "2";
        String expected = "impossible";
        String actual = BombBaby.Solution.solution(inputX, inputY);
        assertEquals(expected, actual);
    }
    
}