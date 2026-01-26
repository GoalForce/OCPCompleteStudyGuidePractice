public @interface Material {}

@interface Fluffy {
	int cuteness();
	public abstract int softness() default 11;

	Material material();
}
