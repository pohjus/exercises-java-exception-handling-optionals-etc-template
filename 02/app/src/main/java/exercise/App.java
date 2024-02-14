package exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates handling of optional values in a map context.
 */
public final class App {
    private static final Logger LOG = LogManager.getLogger(App.class);

    private App() {

    }
    /**
     * Main method to execute the application.
     *
     * @param args Arguments passed from the command line.
     */
    public static void main(final String[] args) {
        // Check if the command line argument is provided
        // Retrieve the Optional<String> for the provided baby identifier

        // Option 1: Traditional if-else check

        // Option 2: Using orElse to provide a default value

        // Option 3: Using ifPresentOrElse for action or default behavior
    }

    /**
     * Creates a map of baby identifiers to optional names.
     *
     * @return Map of baby ID strings to their Optional names.
     */
    public static Map<String, Optional<String>> getBabies() {
        return null;
    }
}
