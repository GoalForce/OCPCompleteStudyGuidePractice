import java.util.ArrayList;
import java.util.HashSet;
public class Collection{
	public static void main(String[] args) {
		java.util.Collection<String> list = new ArrayList<>();
		System.out.println(list.add("Sparrow"));
		System.out.println(list.add("Sparrow"));

		java.util.Collection<String> set = new HashSet<>();
		System.out.println(set.add("Sparrow"));
		System.out.println(set.add("Sparrow"));
		
		System.out.println("*****************************");
		java.util.Collection<String> birds = new ArrayList<>();
		
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.size() + " "+birds.remove(100));
		System.out.println(birds.remove("cadinal"));
		System.out.println(birds.remove("hawk"));
		System.out.println(birds);
		
		System.out.println("*****************************");
		birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		birds.add("hawk");

		for (String bird: birds){
		//	birds.remove(bird);
		}
		
		System.out.println("*****************************");
		System.out.println(birds.contains("hawk"));
		System.out.println(birds.contains(true));
		
		System.out.println("*****************************");
		list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		System.out.println(list);
		list.removeIf(s->s.startsWith("A"));
		System.out.println(list);
	}
}
