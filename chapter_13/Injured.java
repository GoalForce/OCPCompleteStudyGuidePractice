public @interface Injured {
	String veterinarian() default "unassigned";
	String value();
	int age() default 1;
}

abstract class Elephant {
	@Injured("Legs") 
	public void fallDown() {}

	@Injured(value = "Legs")
	public abstract int trip();

	@Injured("Legs", age=2)
	String injuries[];

}
