package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class TooFatExceptionTest {

    @Test
    public void testExceptionMessage() {
        String expectedMessage = "Exceeded maximum allowable mass";
        TooFatException exception = new TooFatException(expectedMessage);

        assertEquals("The message should match the one passed to the constructor",
                     expectedMessage, exception.getMessage());
    }
}
