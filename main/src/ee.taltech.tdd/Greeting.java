package ee.taltech.tdd;

import java.util.List;

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

    public String greetMultiple(List<String> names) {
        String ending = ".";

        return String.format("Hello, %s%s", String.join(" and ", names), ending);
    }

}