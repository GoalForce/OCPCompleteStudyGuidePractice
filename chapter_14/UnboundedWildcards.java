import java.util.*;
class UnboundedWildcards{
	public static <T> void printList(List<T> list) {
		for(T x: list){
			System.out.println(x);
		}
	}

	public static void main(String args[]) {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		printList(keywords);

		List<?> x1 = new ArrayList<>();
		x1.add(null);

		List<Flyer> flyers = new ArrayList<>();
		flyers.add(new HangGlider());
		flyers.add(new Goose());

		anyFlyer(flyers);
		groupOfFlyers(flyers);

		List<Goose> geese = new ArrayList<>();
		geese.add(new Goose());

		anyFlyer((List<Flyer>)(List<?>)geese);


	}

	private static void anyFlyer(List<Flyer> flyer){}
	private static void groupOfFlyers(List<? extends Flyer> flyer) {}

	interface Flyer {void fly();}

	static class HangGlider implements Flyer {public void fly(){}}
	static class Goose implements Flyer {public void fly(){}}
}
