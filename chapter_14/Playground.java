import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Playground {

	static String getName(){
		return "BlaBla";
	}
	
	static String getName(int index) {
		return "other blabl0a";
	}
	
	public static void main(String args[]) {
		Consumer<List<Integer>> methodRef0 = Collections::sort;
		var lambda0 = (Consumer<List<Integer>>)x -> Collections.sort(x);

		Supplier<String> stringSupplier = Playground::getName;
		Function<Integer, String> stringFunction = Playground::getName; 
		System.out.println(stringSupplier.get());
		System.out.println(stringFunction.apply(4));
		/////////////////////////////////////////////////////////
		
		String str = "abc";
		Predicate<String> methodRef1 = str::startsWith;
		BiPredicate<String, String> methodRef10 = String::startsWith;
		Predicate<String> lambda1 = (a) -> str.startsWith(a);
		System.out.println(methodRef1.test("a"));
		System.out.println(methodRef10.test(str, "a"));
		
		/////////////////////////////////////////////////////////

		String str1 = "abc";

		Predicate<String> methodRef2 = String::isEmpty;
		Predicate<String> lambda2 = s->s.isEmpty();

		System.out.println(methodRef2.test(str1));
		System.out.println(lambda2.test(str1));
		
		/////////////////////////////////////////////////////////

		var heights = new ArrayList<>();
		heights.add(1);
		int h = heights.get(0);

	}
}
