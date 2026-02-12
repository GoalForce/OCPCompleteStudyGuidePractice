import java.time.LocalDate;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class FunctionalInterfaces {
	public static void main(String args[]) {
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();

		System.out.println(d1);
		System.out.println(d2);
	
		Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
		ArrayList<String> a1 = s3.get();
		System.out.println(s3);

		var map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> b1 = map::put;
		b1.accept("chicken", 7);

		System.out.println(map);

		BiFunction<String, String, Boolean> c1 = String::startsWith;
		System.out.println(c1.apply("Hello", "H"));
		
		System.out.println("*********************************");

		List<String> groceries = List.of("white-egg", "brown-egg", "tortilla", "bread", "brown-fish");

		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");

		Predicate<String> brownEggs = egg.and(brown);
		Predicate<String> otherEggs = egg.and(brown.negate());

		System.out.println("Eggs: " + groceries.stream().filter(egg).collect(Collectors.toList()));
		System.out.println("Brown Eggs: " + groceries.stream().filter(brownEggs).collect(Collectors.toList()));
		System.out.println("Other Eggs: " + groceries.stream().filter(otherEggs).collect(Collectors.toList()));

		System.out.println("********************************");

		Function<Integer, Integer> before = x -> x + 1;
		Function<Integer, Integer> after = x -> x * 2;

		Function<Integer, Integer> combined = after.andThen(before);
		System.out.println(combined.apply(3));
	}
}
