import java.util.*;
import java.util.function.*;
public class Playground {
	public static void main(String args[]) {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		
		List<String> bunnies2 = new ArrayList<>(bunnies);
		System.out.println(bunnies);
		bunnies.removeIf(a-> a.charAt(0) != 'h');
		System.out.println(bunnies);
		
		System.out.println("********************************************");

		System.out.println(bunnies2);
		bunnies2.sort((a, b) -> a.compareTo(b));
		System.out.println(bunnies2);

		System.out.println("********************************************");

		bunnies2.forEach(System.out::println);

		System.out.println("********************************************");
		
		Map<String, Integer> bunnies3 = new HashMap<>();
		bunnies3.put("long ear", 3);
		bunnies3.put("floppy", 8);
		bunnies3.put("hoppy", 1);

		bunnies3.keySet().forEach(System.out::println);
		bunnies3.values().forEach(System.out::println);

		bunnies3.forEach((k, v) -> System.out.println(k + " " + v));	
		
		bunnies4((var bunnies4) -> {} );
	}

	public static void bunnies4(Consumer<String> bunnies4){}
}
