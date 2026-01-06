interface Playground {
	public static void main(String[] args) {
		B b = new B();

		if (b instanceof Playground){}
	}
}

interface A {
	private  void a(){}
}

class B implements A { }
class C {}

