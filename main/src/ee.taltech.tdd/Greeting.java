package ee.taltech.tdd;

public class Greeting {

    public String greet(String name) {
        if (name == null) {
            name = "my friend";
        }

        return String.format("Hello, %s.", name);

    }

}