package pond.goose;
import pond.shore.Bird;
public class Gosling extends Bird {
	
	public void swim(){
		floatInWinter();
		System.out.println(text);
	}

	public static void main(String... args){
		Gosling gosling = new Gosling();
		gosling.swim();
		System.out.println("***************");
		gosling.floatInWinter();
		System.out.println("***************");
		Bird gosling2 = new Gosling();
		((Gosling) gosling2).swim();
		System.out.println("***************");
		System.out.println(((Gosling)gosling2).text);

		System.out.println("***************");

		GooseWatcher gooseWatcher = new GooseWatcher();
		gooseWatcher.watch();

		//Bird bird = new Bird();
		//bird.swim(); // DOES NOT COMPILE
	}

        protected static class Egg{
		public static int count = 4;
	}	
}

class GooseWatcher {
	public void watch() {
		Gosling gosling = new Gosling();
		gosling.swim();
	}
}
