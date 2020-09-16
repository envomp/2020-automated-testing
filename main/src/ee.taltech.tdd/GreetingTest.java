package ee.taltech.tdd;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {

    @Test
    public void greetGreetsWhenGivenName() {
        List<String> names = List.of("a", "AaBb", "AbC", "Kapsas Tühikuga");
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

    @Test
    public void greetGreetsWhenGivenUppercase() {
        Greeting greeting = new Greeting();

        String response = greeting.greet("PEETER");

        assertEquals("Hello, PEETER!", response);

    }


    @Test
    public void greetGreetsAllWhenGivenList() {
        List<String> names = List.of("a", "AaBb");
        Greeting greeting = new Greeting();

        String response = greeting.greet(names);
        assertEquals("Hello, a and AaBb.", response);

    }

}