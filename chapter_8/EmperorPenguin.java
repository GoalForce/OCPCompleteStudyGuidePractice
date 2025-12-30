public class EmperorPenguin extends Penguin {
	public int getHeight() { return 8;}

	public void printInfo() {
		System.out.println(super.getHeight());
	}
	public static void main(String[] fish) {
		new EmperorPenguin().printInfo();
	}
}

class Penguin {
	public int getHeight() { return 3;}
	public void printInfo() {
		System.out.println(getHeight());
	}
}
