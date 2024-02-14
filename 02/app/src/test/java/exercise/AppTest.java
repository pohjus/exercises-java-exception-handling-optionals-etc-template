package exercise;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Map;
import java.util.Optional;

public class AppTest {

    @Test
    public void testGetBabiesContainsKey() {
        Map<String, Optional<String>> babies = App.getBabies();
        assertTrue("Map should contain key 010106A921P", babies.containsKey("010106A921P"));
    }

    @Test
    public void testGetBabiesNamePresent() {
        Map<String, Optional<String>> babies = App.getBabies();
        Optional<String> name = babies.get("010106A921P");
        assertTrue("Name for key 010106A921P should be present", name.isPresent());
        assertEquals("Name for key 010106A921P should be Jack Smith", "Jack Smith", name.get());
    }

    @Test
    public void testGetBabiesNameNotPresent() {
        Map<String, Optional<String>> babies = App.getBabies();
        Optional<String> name = babies.get("010106A957V");
        assertFalse("Name for key 010106A957V should not be present", name.isPresent());
    }

    @Test
    public void testGetBabiesUnknownKey() {
        Map<String, Optional<String>> babies = App.getBabies();
        Optional<String> name = babies.get("unknown");
        assertNull("Name for unknown key should be null", name);
    }
}
