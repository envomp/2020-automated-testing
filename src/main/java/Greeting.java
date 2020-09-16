import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Greeting {

	public String greet(Object name) {
		if (name instanceof String) {
			return greetString((String) name);
		} else if (name == null) {
			return "Hello, my friend.";
		} else if (name instanceof Collection) {
			return greetMultiple(getListOfStringFromObject(name));
		}

		return "Hello?";
	}

	private String greetString(String name) {
		String ending = ".";
		if (name.toUpperCase().equals(name)) {
			ending = "!";
		}

		return String.format("Hello, %s%s", name, ending);
	}

	public String greetMultiple(List<String> names) {
		if (names.size() == 0) {
			return "Hello.";
		}

		String ending = String.format(" and %s%s", names.get(names.size() - 1), ".");

		return String.format("Hello, %s%s",
				String.join(", ", names.subList(0, names.size() - 1)),
				ending);
	}

	private List<String> getListOfStringFromObject(final Object objectList) {
		List<String> stringList = new ArrayList<>();
		if (objectList instanceof List<?>) {
			for (Object object : (List<?>) objectList) {
				if (object instanceof String) {
					stringList.add((String) object);
				}
			}
		}
		return stringList;
	}

}