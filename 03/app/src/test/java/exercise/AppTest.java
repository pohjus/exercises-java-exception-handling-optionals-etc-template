package exercise;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testConcateStringsPerformance() {
        final int amount = 1000; // Reduced amount for faster testing
        long timeTaken = App.concatenateStrings(amount);
        assertTrue("Time should be greater than 0", timeTaken > 0);
    }

    @Test
    public void testConcateStringsWithStringBuilderPerformance() {
        final int amount = 1000; // Reduced amount for faster testing
        long timeTaken = App.concatenateStringsWithStringBuilder(amount);
        assertTrue("Time should be greater than 0", timeTaken > 0);
    }
}