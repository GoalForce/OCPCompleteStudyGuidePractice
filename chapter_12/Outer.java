public class Outer {
	private String greeting = "Hi";

	protected final class Inner extends Object {
		public int repeat = 3;
		public void go(){
			for(int i=0; i<repeat; i++){
				System.out.println(greeting);
			}
		}
	}

	public static void main(String args[]){
		new Outer().new Inner().go();
	}

}
