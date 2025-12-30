public class ClassA {

	static {
		
		System.out.println("static ClassA");
	}
	
	public static void main(String ... args) {
		System.out.println("main ClassA");
		new ClassB();
	}
}

