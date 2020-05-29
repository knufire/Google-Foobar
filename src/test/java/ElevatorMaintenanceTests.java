import org.junit.Assert;
import org.junit.Test;

public class ElevatorMaintenanceTests {
    @Test
    public void testEmptyArray() {
        String[] input = {};
        String[] expecteds = {};
        String[] actuals = ElevatorMaintenance.Solution.solution(input);
        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testExampleOne() {
        String[] input = { "1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0" };
        String[] expecteds = { "0.1", "1.1.1", "1.2", "1.2.1", "1.11", "2", "2.0", "2.0.0" };
        String[] actuals = ElevatorMaintenance.Solution.solution(input);
        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testExampleTwo() {
        String[] input = { "1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2" };
        String[] expecteds = { "1.0", "1.0.2", "1.0.12", "1.1.2", "1.3.3" };
        String[] actuals = ElevatorMaintenance.Solution.solution(input);
        Assert.assertArrayEquals(expecteds, actuals);
    }
}