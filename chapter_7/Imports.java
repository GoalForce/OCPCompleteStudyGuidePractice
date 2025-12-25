import java.util.List;
import pond.goose.Gosling;
import static pond.goose.Gosling.Egg;
import static java.util.Arrays.asList;

class Imports extends Gosling{
	public static void main(String[] args) {
		List<String> list = asList("Hi", "it", "is", "me");
		list.forEach(System.out::println);
		System.out.println(++count);
	}
}
