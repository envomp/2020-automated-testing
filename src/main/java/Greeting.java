import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
		if (isUppercase(name)) {
			ending = "!";
		}

		return String.format("Hello, %s%s", name, ending);
	}

	public String greetMultiple(List<String> names) {
		if (names.size() == 0) {
			return "Hello.";
		}

		return greetNoCaps(names.stream().filter(x -> !isUppercase(x)).collect(Collectors.toList())) +
				greetCaps(names.stream().filter(this::isUppercase).collect(Collectors.toList()));
	}

	private boolean isUppercase(String x) {
		return x.toUpperCase().equals(x);
	}

	private String greetNoCaps(List<String> names) {
		if (names.size() == 0) {
			return "";
		}

		if (names.size() == 1) {
			return String.format("Hello, %s.", names.get(0));
		}

		String ending = String.format(" and %s%s", names.get(names.size() - 1), ".");

		return String.format("Hello, %s%s",
				String.join(", ", names.subList(0, names.size() - 1)),
				ending);
	}

	private String greetCaps(List<String> names) {
		if (names.size() == 0) {
			return "";
		}

		if (names.size() == 1) {
			return String.format(" AND HELLO %s!", names.get(0));
		}

		String ending = String.format(" and %s%s", names.get(names.size() - 1), "!");

		return String.format(" AND HELLO %s%s",
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