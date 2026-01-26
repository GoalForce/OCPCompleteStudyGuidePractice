public class Enclosing {
	private int x = 10;

	static class Nested {
		private static int price = 6;
	}

	 void call() {
		System.out.println(new Nested().price);
	 }

	public static void main(String args[]){
		new Enclosing().call();
	}
}
