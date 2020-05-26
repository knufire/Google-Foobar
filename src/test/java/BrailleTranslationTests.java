import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BrailleTranslationTests {

    @Test
    public void testEmptyString() {
        String s = BrailleTranslation.Solution.solution("");
        assertEquals(s, "");
    }

    @Test
    public void testNull() {
        String s = BrailleTranslation.Solution.solution(null);
        assertEquals(s, "");
    }

    @Test
    public void testWord() {
        String s = BrailleTranslation.Solution.solution("code");
        assertEquals(s, "100100101010100110100010");
    }

    @Test
    public void testWordWithCapital() {
        String s = BrailleTranslation.Solution.solution("Braille");
        assertEquals(s, "000001110000111010100000010100111000111000100010");
    }

    @Test
    public void testSentence() {
        String s = BrailleTranslation.Solution.solution("The quick brown fox jumps over the lazy dog");
        assertEquals(s,
                "000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110");
    }

}