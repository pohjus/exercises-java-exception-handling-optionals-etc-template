package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidNameExceptionTest {

    @Test
    public void testExceptionMessage() {
        String expectedMessage = "Invalid name provided";
        InvalidNameException exception = new InvalidNameException(expectedMessage);

        assertEquals("The message should match the one passed to the constructor",
                     expectedMessage, exception.getMessage());
    }
}
