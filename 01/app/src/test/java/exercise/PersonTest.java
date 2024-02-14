package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void personCreationWithValidParameters() throws TooFatException {
        Person person = new Person(80, "John Doe");
        assertEquals("Mass should be set to 80", 80, person.getMass());
        assertEquals("Name should be set to John Doe", "John Doe", person.getName());
    }

    @Test(expected = TooFatException.class)
    public void personCreationWithExcessiveMass() throws TooFatException {
        new Person(636, "John Doe");
    }

    @Test(expected = InvalidNameException.class)
    public void personCreationWithInvalidName() throws TooFatException {
        new Person(80, "");
    }

    @Test
    public void setValidMass() throws TooFatException {
        Person person = new Person(80, "John Doe");
        person.setMass(100);
        assertEquals("Mass should be updated to 100", 100, person.getMass());
    }

    @Test(expected = TooFatException.class)
    public void setExcessiveMass() throws TooFatException {
        Person person = new Person(80, "John Doe");
        person.setMass(636);
    }

    @Test
    public void setValidName() throws TooFatException {
        Person person = new Person(80, "John Doe");
        person.setName("Jane Doe");
        assertEquals("Name should be updated to Jane Doe", "Jane Doe", person.getName());
    }

    @Test(expected = InvalidNameException.class)
    public void setInvalidName() throws TooFatException {
        Person person = new Person(80, "John Doe");
        person.setName("");
    }

    @Test
    public void testPersonEquality() throws TooFatException {
        Person person1 = new Person(80, "John Doe");
        Person person2 = new Person(80, "John Doe");
        assertEquals("Persons with same name and mass should be equal", person1, person2);
    }

    @Test
    public void testPersonHashCode() throws TooFatException {
        Person person1 = new Person(80, "John Doe");
        Person person2 = new Person(80, "John Doe");
        assertEquals("Hash codes of equal persons should be the same", person1.hashCode(), person2.hashCode());
    }
}
