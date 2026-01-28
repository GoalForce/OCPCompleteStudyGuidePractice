import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Main {
	public static void main(String args[]) {
		String[] array = {"a", "b", "c"};
		List<String> asList = Arrays.asList(array);
		List<String> of = List.of(array);
		List<String> copy = List.copyOf(asList);

		array[0] = "z";

		System.out.println(asList);
		System.out.println(of);
		System.out.println(copy);

		asList.set(0, "x");
		System.out.println(Arrays.toString(array));
		
		System.out.println("******************************");

		List<String> list = new ArrayList<>();
		list.add("SD");
		list.add(0, "NY");
		list.set(1, "FL");

		System.out.println(list.get(0));
		list.remove("NY");
		list.remove(0);

		System.out.println("***********************************");

		List<Integer> numbers = Arrays.asList(1,2,3);
		numbers.replaceAll(x->x*2);
		numbers.forEach(System.out::println);
	}
}
