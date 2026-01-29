public class SizeLimitedCrate<T,U> {
	private T contents;
	private U sizeLimit;

	public SizeLimitedCrate(T contents, U sizeLimit){
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}

	public static void main(String a[]) {
		class Elephant{}
		Elephant elephant = new Elephant();
		SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, 15_000);
		
		System.out.println(c1.contents);
	}
}
