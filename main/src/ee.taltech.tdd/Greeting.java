package ee.taltech.tdd;

public class Greeting {

    public String greet(String name) {
        if (name == null) {
            name = "my friend";
        }

        String ending = ".";
        if (name.toUpperCase().equals(name)) {
            ending = "!";
        }

        return String.format("Hello, %s%s", name, ending);

    }

}