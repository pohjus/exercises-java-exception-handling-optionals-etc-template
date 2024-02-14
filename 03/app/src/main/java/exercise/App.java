package exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the thread safety of various Java string and collection classes
 * and their performance implications.
 */
public final class App {
    private static final int AMOUNT = 1000;

    private static final Logger LOG = LogManager.getLogger();

    private static int counter = 0;

    private App() {

    }
    /**
     * Main method to run the demonstrations.
     *
     * @param args Arguments passed from the command line, not used.
     */
    public static void main(final String[] args) {
        final int amount = 10000;
        long time1 = concatenateStrings(amount);
        long time2 = concatenateStringsWithStringBuilder(amount);

        LOG.info("String concatenation time: " + time1 + " ns");
        LOG.info("StringBuilder concatenation time: " + time2 + " ns");

        testThreadSafetyOnCounter();
        testThreadSafetyOnArrayList();
        testThreadSafetyOnStringBuffer();
        testThreadSafetyOnStringBuilder();
    }

    /**
     * Demonstrates thread safety with StringBuffer.
     */
    public static void testThreadSafetyOnStringBuffer() {
    }

    /**
     * Demonstrates lack of thread safety with StringBuilder.
     */
    public static void testThreadSafetyOnStringBuilder() {

    }

    /**
     * Concatenates strings using simple concatenation in a loop to
     * demonstrate performance.
     *
     * @param amount The number of concatenations to perform.
     * @return The time taken in nanoseconds.
     */
    public static long concatenateStrings(final int amount) {

    }

    /**
     * Concatenates strings using a StringBuilder in a loop to
     * demonstrate performance.
     *
     * @param amount The number of times to append to the StringBuilder.
     * @return The time taken in nanoseconds.
     */
    public static long concatenateStringsWithStringBuilder(final int amount) {

    }

    /**
     * Tests the thread safety of a simple counter increment operation.
     */
    public static void testThreadSafetyOnCounter() {

    }

    /**
     * Tests the thread safety of ArrayList by attempting concurrent
     * modifications.
     */
    public static void testThreadSafetyOnArrayList() {

    }
}
