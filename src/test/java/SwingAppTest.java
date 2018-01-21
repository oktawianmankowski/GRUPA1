import static org.junit.Assert.*;
import org.junit.Test;

public class SwingAppTest {
    @Test
    public void multiplicationTest() {
        int result = SwingApp.multiple(2,4);
        int expectedResult = 8;
        assertEquals(result, expectedResult);
    }

    @Test
    public void calculateTest(){
        double result = SwingApp.calculate(104, 0.04);
        double expexted = 100;
        double delta = Math.abs(result - expexted);
        double epsilon = 0.004;
        boolean resultState = delta < epsilon;
        assertTrue(resultState);
    }

}
