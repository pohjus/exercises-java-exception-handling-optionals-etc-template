package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testStringToBytesWithEncodingValid() {
        byte[] result = App.stringToBytesWithEncoding("Hello World", "UTF-8");
        assertNotNull("Byte conversion should not be null for valid encoding", result);
    }

    @Test
    public void testStringToBytesWithEncodingInvalid() {
        byte[] result = App.stringToBytesWithEncoding("Hello World", "INVALID");
        assertNull("Byte conversion should be null for invalid encoding", result);
    }

    @Test
    public void testCreateThread1ValidPriority() {
        assertTrue("Thread should be created successfully with valid priority",
            App.createThread1("5"));
    }

    @Test
    public void testCreateThread1InvalidPriority() {
        assertFalse("Thread creation should fail with invalid priority format",
            App.createThread1("invalid"));
    }

    @Test
    public void testCreateThread2OutOfRangePriority() {
        assertFalse("Thread creation should fail with out-of-range priority",
            App.createThread2("-1"));
    }

    @Test
    public void testIsIntegerPositive() {
        assertTrue("Should return true for a valid integer string",
            App.isInteger("123"));
    }

    @Test
    public void testIsIntegerNegative() {
        assertFalse("Should return false for a non-integer string",
            App.isInteger("abc"));
    }
}
