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
        if (names.size() == 0) {
            return "Hello?";
        }

        String ending = String.format(" and %s%s", names.get(names.size() - 1), ".");

        return String.format("Hello, %s%s", String.join(", ", names.subList(0, names.size() - 1)), ending);
    }

}