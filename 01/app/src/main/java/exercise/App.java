package exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Demonstrates various utility methods including thread creation,
 * string to byte conversion, and integer checking.
 */
public final class App {
    private static final Logger LOG = LogManager.getLogger();

    private App() {

    }

    /**
     * Converts a String to a byte array using the specified encoding.
     * @param text The string to be converted.
     * @param encoding The character encoding.
     * @return The byte array or {@code null} if encoding is unsupported.
     */
    public static byte[] stringToBytesWithEncoding(final String text, final
                                                            String encoding) {
        return null;
    }

    /**
     * Creates and starts a new thread with numbers 1 to 10.
     * @param priority The priority level for the thread.
     * @return {@code true} if thread started, else {@code false}.
     */
    public static boolean createThread1(final String priority) {
        return true;
    }

    /**
     * Creates and starts a new thread with numbers 1 to 10 using validation.
     * @param priority The priority for the new thread.
     * @return {@code true} if successful, else {@code false}.
     */
    public static boolean createThread2(final String priority) {

        return true;
    }

    /**
     * Checks if a string is an integer.
     * @param str The string to check.
     * @return {@code true} if it is an integer, else {@code false}.
     */
    public static boolean isInteger(final String str) {
        return str != null && str.matches("[+-]?\\d+");
    }

    /**
     * Main method to demonstrate the functionalities.
     * @param args Command line arguments (unused).
     */
    public static void main(final String[] args) {


        // 13:02:53.254 [main] INFO  exercise.App - Byte conversion successful.
        // 13:02:53.257 [main] ERROR exercise.App - Unsupported encoding.
        testStringToBytesWithEncoding();

        // 13:03:39.801 [main] INFO  exercise.App - Thread 1 created
        //                                                         successfully.
        // 13:03:39.801 [main] INFO  exercise.App - Thread 2 created
        //                                                         successfully.
        // 13:06:00.120 [main] ERROR exercise.App - Thread 3 creation failed.
        // 13:03:39.801 [Thread-0] INFO  exercise.App - 1
        // 13:03:39.801 [Thread-1] INFO  exercise.App - 1
        // ..
        // 13:03:39.802 [Thread-0] INFO  exercise.App - 10
        // 13:03:39.802 [Thread-1] INFO  exercise.App - 10
        testThreadCreated();

        // 13:04:43.924 [main] INFO  exercise.App - Person created: 80 John Doe
        // 13:04:43.924 [main] INFO  exercise.App - New mass set: 75
        // 13:04:43.924 [main] INFO  exercise.App - New name set: Jane Doe
        // 13:04:43.924 [main] ERROR exercise.App - Failed to create person
        //                                    with too high mass: Mass too high
        // 13:04:43.924 [main] ERROR exercise.App - Failed to create person with
        //                                            invalid name: Invalid name
        testPerson();
    }

    /**
     * Demonstrates thread creation with specified priorities.
     * Logs the success or failure of thread creation.
     */
    public static void testThreadCreated() {

    }


    /**
     * Demonstrates String to byte
     * Logs the success or failure of thread creation.
     */
    public static void testStringToBytesWithEncoding() {
    }

    /**
     * Demonstrates the usage of the Person class including exception handling.
     * Logs the creation and modification of Person objects and handles
     * custom exceptions.
     */
    public static void testPerson() {
        final int mass1 = 80;
        final int mass2 = 75;
        final int mass3 = 70;
        final int maxMass = 640;


    }
}
