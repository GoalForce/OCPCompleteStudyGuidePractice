public class Chick {
	public void Chick() { } // Not a constructor
	
	private String name = "Fluffy";
	{ System.out.println("setting field");}
	
	public Chick() {      // A constructor
		name = "Tiny";
		System.out.println("setting constructor");
	}

	public static void main(String[] args){
		 Chick chick = new Chick();
		 System.out.println(chick.name);
	}
}
