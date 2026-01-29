import java.io.IOException;
import java.util.*;
class LowerBoundedWildcards {
	public static void main(String args[]) {
		List<String> strings = new ArrayList<>();
		strings.add("tweet");

		List<Object> objects = new ArrayList<>(strings);

		addSound(strings);
		addSound(objects);

		List<? super IOException> exceptions = new ArrayList<Exception>();
		exceptions.add(new Exception());
	}

	public static void addSound (List<? super String> list) {
		list.add("quack");
	}
}
