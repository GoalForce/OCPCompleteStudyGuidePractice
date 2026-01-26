class Main {
	public static void main(String ... unused) {
		System.out.println(ElectricitySource.MIN_VOLTAGE);
	}
}
public @interface ElectricitySource {
	public int voltage();
	int MIN_VOLTAGE = 2;
	public static final int MAX_VOLTAGE = 18; 
}
