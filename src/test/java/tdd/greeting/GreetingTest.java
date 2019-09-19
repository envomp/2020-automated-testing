package tdd.greeting;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;


public class GreetingTest {

    @Test
    public void should_return_hello_name_when_name_is_provided() {
        String name = "Liam";
        Greeter greeter = new Greeter();

        String greeting = greeter.greet(name);

        assertThat(greeting).isEqualTo("Hello, " + name);
    }


    @Test
    public void should_return_hello_friend_when_not_given_a_name() {
        String name = "";
        Greeter greeter = new Greeter();

        String greeting = greeter.greet(name);

        assertThat(greeting).isEqualTo("Hello, my friend");
    }


}
