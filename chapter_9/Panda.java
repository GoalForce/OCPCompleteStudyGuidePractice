abstract class Bear {
	abstract CharSequence chew();
	public Bear() {
		System.out.println(chew());
	}

	final static int main(){ return 0;}
	public static void main(String... args) {
		new Panda();
	}
}

public class Panda extends Bear {
	String chew() { return "yummy!"; }

	final static int main() { return 4;}
}


