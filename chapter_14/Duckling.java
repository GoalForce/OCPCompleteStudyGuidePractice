public class Duckling {
	public static void makeSound(String sound) {
		LearnToSpeak learner = System.out::println;
		DuckHelper.teacher(sound, learner);
	}

	public static void main(String... args) {
		Duckling.makeSound("Quack");
	}
}

@FunctionalInterface
interface LearnToSpeak {
	void speak(String sound);
}

class DuckHelper {
	public static void teacher(String name, LearnToSpeak trainer){
		trainer.speak(name);
	}
}

