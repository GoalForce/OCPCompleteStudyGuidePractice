import java.util.*;
public class SortRabbits {
	static class Rabbit {int id; int getId(){return id;}}
	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit());
		Collections.sort(rabbits, Comparator.comparing(Rabbit::getId));

		List<Integer> list = Arrays.asList(6,9,1,8);
		Collections.sort(list); System.out.println(list);

		System.out.println(Collections.binarySearch(list, 6));
		System.out.println(Collections.binarySearch(list, 3));

		System.out.println("*****************************");

		var var = Arrays.asList("Fluffy", "Hoppy");
		Comparator<String> c = Comparator.reverseOrder();
		var index = Collections.binarySearch(var, "Hoppy", c);
		System.out.println(index);
	        System.out.println("****************************");	
		Set<Rabbit> rabbitSet = new TreeSet<>(Comparator.comparing(Rabbit::getId));
		rabbitSet.add(new Rabbit());
	}
}
