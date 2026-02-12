import java.util.stream.*;
import java.util.*;
class MappingStreams {
	public static void main(String ... args){
		Stream<String> strStream = Stream.of("John", "Terry", "Mike");
		IntStream intStream = strStream.mapToInt(String::length);

		intStream.forEachOrdered(System.out::println);

		DoubleStream doubleStream = DoubleStream.of(50.5, 70.90, 93);
		Stream<Person> personStream = doubleStream.mapToObj(d-> {var person = new Person(); person.weight = d; return person;});
		personStream.forEach(System.out::println);
		
		System.out.println("*******************");
		List<Integer> integerList = new ArrayList<>();
		integerList.add(12);
		integerList.add(23);


		IntStream integerStream = integerList.stream().flatMapToInt(x -> IntStream.of(x));
		integerStream.forEach(System.out::println);

		OptionalDouble optionalDouble = IntStream.rangeClosed(1, 10).average();
		optionalDouble.ifPresent(System.out::println);

		IntSummaryStatistics intSummaryStatistics = IntStream.empty().summaryStatistics();
		System.out.println("Min: " + intSummaryStatistics.getMin());
		System.out.println("Max: " + intSummaryStatistics.getMax());
		System.out.println("Awerage: " + intSummaryStatistics.getAverage());
		System.out.println("Sum: " + intSummaryStatistics.getSum());
		System.out.println("Count: " + intSummaryStatistics.getCount());

	}
}

class Person {
	double weight = 0;

	public String toString(){
		return "Person {" + weight + "}";
	}
}
