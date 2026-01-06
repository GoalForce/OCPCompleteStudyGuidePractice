interface Nocturnal {
	int hunt();
	public static final int count = 4;
	public static void main(String args[]) {
		new Owl().flap();
	}
}

interface CanFly {
	public void flap();
}

interface HasBigEyes extends Nocturnal, CanFly {}

public class Owl implements Nocturnal, CanFly {
	public static final String test;
	static {
		test = "";
	}
	Owl(){
	}

	public int hunt() { return 5; }
	public void flap() { System.out.println("Flap"); }
}
