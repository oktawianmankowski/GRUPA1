import static org.junit.Assert.*;
import org.junit.Test;

public class SwingAppTest {
    @Test
    public void multiplicationTest() {
        int result = SwingApp.multiple(2,4);
        int expectedResult = 8;
        assertEquals(result, expectedResult);
    }

}
