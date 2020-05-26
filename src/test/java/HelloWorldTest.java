import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testCode() {
        String solution = HelloWorld.Soltuion.solution();
        assertEquals(solution, "Hello World");
    }
    
}