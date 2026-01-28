import java.util.*;

public class Duck implements Comparable<Duck> {
	private String name;
	private int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public int compareTo(Duck duck) {
		return this.name.compareTo( duck.name) ;
	}

	public String getName() {
		return this.name;
	}

	public int getWeight(){
		return this.weight;
	}

	public String toString(){
		return this.name + "=" + this.weight;
	}

	public static void main(String args[]) {


		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("John", 12));
		ducks.add(new Duck("Alice",32));
		ducks.add(new Duck("Tim", 12));
		ducks.add(new Duck("Robert",231));
		ducks.add(new Duck("Depp",321));

		System.out.println(ducks);
		Collections.sort(ducks);
		System.out.println(ducks);
	
		Comparator<Duck> byWeight = new Comparator<Duck> () {
			public int compare(Duck d1, Duck d2){
				return d1.getWeight() - d2.getWeight();
			}
		};
		
		Collections.sort(ducks, (d1, d2) -> d1.getWeight() - d2.getWeight());
		System.out.println(ducks);
		Collections.sort(ducks, Comparator.comparing(Duck::getWeight));
		System.out.println(ducks);
	}
}
