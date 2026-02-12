import java.util.stream.Stream;
import java.util.Optional;
import java.util.List;
import java.util.function.Predicate;
import java.util.TreeSet;
import java.util.Set;
import java.util.stream.Collectors;
public class TerminalOperations {

	public static void main(String args[]) {
		Stream<String> s = Stream.of("monkey", "ape", "bonobo");
		Optional<String> min = s.min((s1, s2)->s1.length()-s2.length());
		min.ifPresent(System.out::println);
	
		Optional<?> minEmpty = Stream.empty().min((s1, s2)->0);
		System.out.println(minEmpty.isPresent());

		Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate(()->"chimp");

		s1.findAny().ifPresent(System.out::println);
		//infinite.findAny().ifPresent(System.out::println);

		var list = List.of("monkey", "2", "chimp");

		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

		System.out.println(list.stream().anyMatch(pred));
		System.out.println(list.stream().allMatch(pred));
		System.out.println(list.stream().noneMatch(pred));

		System.out.println(infinite.anyMatch(pred));

		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("", String::concat);
		System.out.println(word);

		Stream<Integer> ints = Stream.of(2,5,9,8,7,1,5,65,12);
		System.out.println(ints.reduce(Math::multiplyExact));

		Stream<String> stream1 = Stream.of("w", "o", "l", "f");
		System.out.println(stream1.reduce(0, (i, string) -> i+string.length(), (a, b) -> a+b));

		Stream<String> stream3 = Stream.of("w", "o", "l", "f");
		//TreeSet<String> set = stream3.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		//TreeSet<String> set = stream3.collect(Collectors.toCollection(TreeSet::new));
		Set<String> set = stream3.collect(Collectors.toSet());
		System.out.println(set);
	}
}
