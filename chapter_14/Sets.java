import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

class Sets {
	public static void main(String args[]) {
		Set<Integer> set = new TreeSet<>();
		boolean b1 = set.add(66);
		boolean b2 = set.add(10);
		boolean b3 = set.add(66);
		boolean b4 = set.add(8);
		set.forEach(System.out::println);
	}
}
