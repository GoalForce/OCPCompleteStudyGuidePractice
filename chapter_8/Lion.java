public class Lion extends Animal {
	public void setProperties(int age, String n) {
		setAge(age);
		super.name = n;
	}

	public void roar() {
		System.out.println(name + ", age " + getAge() + ", says: Roar!");
	}

	public static void main(String[] args) {
		var lion = new Lion();
		lion.setProperties(3, "kion");
		lion.roar();
	}
}
