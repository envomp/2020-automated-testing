package ee.taltech.tdd;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {

    @Test
    public void greetGreetsWithGivenName() {
        List<String> names = List.of("A", "AABB", "Kapsas Tühikuga");
        Greeting greeting = new Greeting();

        for (String name : names) {
            String response = greeting.greet(name);
            assertEquals(String.format("Hello, %s.", name), response);
        }
    }

    @Test
    public void greetGreetsWhenGivenNull() {
        Greeting greeting = new Greeting();

        String response = greeting.greet(null);

        assertEquals("Hello, my friend.", response);

    }

}