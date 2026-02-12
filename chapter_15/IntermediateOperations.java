import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
class IntermediateOperations {
	public static void main(String args[]) {
		Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
		//String[] sArray = s.distinct().toArray(String[]::new);
		//System.out.println(Arrays.toString(sArray));

		Stream<Integer> intStream = Stream.iterate(1, n->n+1);
		intStream.skip(6).limit(3).forEach(System.out::print);
	
		System.out.println();
		s.map(String::length).forEach(System.out::print);
		System.out.println("********************************");


		List<String> zero = List.of();
		var one = List.of("Bonobo");
		var two = List.of("Mama Gorilla", "Baby Gorilla");

		Stream<List<String>> animals = Stream.of(zero, one, two);
		Stream<String> animalsString = animals.flatMap(List::stream);

		animalsString.forEach(System.out::println);
		Stream<Animal> animalStream = Stream.of(new Animal(), new Animal());
		animalStream.sorted().forEach(System.out::println);
	}
}

class Animal{}
