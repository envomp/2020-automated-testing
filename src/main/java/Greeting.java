import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Greeting {

	private static final String CSV_SPLIT_REGEX = "(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";

	public String greet(Object name) {

		if (name instanceof String) {
			return getGreeting((String) name);
		} else if (name == null) {
			return "Hello, my friend.";
		} else if (name instanceof List) {
			return getCombinedGreeting(getFormattedNames((List<?>) name));
		}

		return "Hello?";
	}

	private String getGreeting(String name) {
		String ending = ".";

		if (isUppercase(name)) {
			ending = "!";
		}

		return String.format("Hello, %s%s", name, ending);
	}

	private String getCombinedGreeting(List<String> names) {

		if (names.size() == 0) {
			return "Hello.";
		}

		return String.format("%s%s",
				getLowercaseGreeting(names.stream()
						.filter(x -> !isUppercase(x))
						.collect(Collectors.toList())),
				getUppercaseGreeting(names.stream()
						.filter(this::isUppercase)
						.collect(Collectors.toList())));
	}

	private boolean isUppercase(String x) {
		return x.toUpperCase().equals(x);
	}

	private String getLowercaseGreeting(List<String> names) {

		if (names.size() == 0) {
			return "";
		}

		if (names.size() == 1) {
			return String.format("Hello, %s.", names.get(0));
		}

		String ending = String.format(" and %s%s", names.get(names.size() - 1), ".");
		return String.format("Hello, %s%s", String.join(", ", names.subList(0, names.size() - 1)), ending);
	}

	private String getUppercaseGreeting(List<String> names) {

		if (names.size() == 0) {
			return "";
		}

		if (names.size() == 1) {
			return String.format(" AND HELLO %s!", names.get(0));
		}

		String ending = String.format(" and %s%s", names.get(names.size() - 1), "!");
		return String.format(" AND HELLO %s%s", String.join(", ", names.subList(0, names.size() - 1)), ending);
	}

	private List<String> getFormattedNames(final List<?> names) {
		return names
				.stream()
				.filter(object -> object instanceof String)
				.map(object -> Arrays.asList(((String) object)
						.split("," + CSV_SPLIT_REGEX)))
				.flatMap(list -> list.stream().map(x -> x
						.replaceAll("\\s+" + CSV_SPLIT_REGEX, "")
						.replaceAll("\"", "")))
				.collect(Collectors.toList());
	}

}