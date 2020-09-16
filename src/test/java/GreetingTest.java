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
	public void greetGreetsAllWhenGivenListOf1() {
		List<String> names = List.of("a");
		Greeting greeting = new Greeting();

		String response = greeting.greet(names);
		assertEquals("Hello, a.", response);
	}

    @Test
    public void greetGreetsAllWhenGivenList() {
        List<String> names = List.of("a", "AaBb");
        Greeting greeting = new Greeting();

        String response = greeting.greet(names);
        assertEquals("Hello, a and AaBb.", response);
    }


    @Test
    public void greetGreetsAllWhenGivenListOfMoreThanTwo() {
        List<String> names = List.of("a", "AaBb", "bB");
        Greeting greeting = new Greeting();

        String response = greeting.greet(names);
        assertEquals("Hello, a, AaBb and bB.", response);
    }

	@Test
	public void greetGreetsAllWhenGivenListOfMoreThanTwoWithCaps() {
		List<String> names = List.of("a", "A", "AaBb", "bB");
		Greeting greeting = new Greeting();

		String response = greeting.greet(names);
		assertEquals("Hello, a, AaBb and bB. AND HELLO A!", response);
	}

}