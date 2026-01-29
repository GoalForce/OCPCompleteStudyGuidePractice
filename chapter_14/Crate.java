public class Crate<T> {
	private T contents;

	public T emptyCrate() {
		return contents;
	}

	public void packCrate(T contents) {
		this.contents = contents;
	}
	public static void main(String ...args) {
		var var = new Crate<Integer>();
		var.packCrate(2);
		System.out.println(var.emptyCrate());
	} 
}

class B {
	public static void main(String args[]) {}
}
