public class Cat implements Walk, Run, Hop {

	static int getJumpLength() { return 9; }
	public static void main(String[] args) {
		System.out.println(new Cat().getWalkSpeed());
		System.out.println(new Cat().getJumpLength());
		System.out.println(Hop.getJumpHeight());
	}

	public int getSpeed() { return 12;}

	public int getWalkSpeed() {
		return Walk.super.getSpeed();
	}


}

interface Walk{
	default int getSpeed() { return 3 ;}
}

interface Run{
	default int getSpeed() { return 10;}
}

interface Hop {
	static int getJumpHeight() {
		return 8;
	}
}
