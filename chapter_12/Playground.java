public class Playground {
	private void printZooInfo(boolean isWeekend){
		final int giraffe = 5;
		 long lemur = 0;

		if(isWeekend) lemur = 5;

		System.out.println(giraffe + " " + lemur);
	}

	public static void main(String args[]) {
		new Playground().printZooInfo(true);
	}
}
