import java.util.stream.*;
public class Streams {
	public static void main(String[] args) {
		Stream<String> empty = Stream.empty();
		Stream<Integer> singleElement = Stream.of(1);
		Stream<Integer> fromArray = Stream.of(1,2,3);

		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n < 100, n -> n+2);
		System.out.println(randoms);
		//	randoms.forEach(System.out::println);
		oddNumbers.forEach(System.out::println);

	}
}
