public class Tiger implements Sprint {
	public void sprint(int speed) {
		System.out.println("Animal is sprinting fast! " + speed);
	}

	public static void main(String args[]) {
		Sprint sprint = (int a) -> System.out.println("Animal is sprinting fast! " + a);

		sprint.sprint(4);
	}
}

@FunctionalInterface
interface Sprint {
	void sprint(int speed);
}
