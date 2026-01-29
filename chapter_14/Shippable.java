
public interface Shippable<T> {
	void ship(T t);

	public static void main(String args[]) {
		Handler.<String>prepare("Elephant");	
		System.out.println(new Robot<Integer>().of(0));	
	}
}

class Robot<T>{
	 T of(T t){
		return t;
	}
}

class ShippableRobotCrate implements Shippable<Robot> {
	public void ship(Robot T) {}
}

class ShippableAbstractCrate<U> implements Shippable<U> {
	public void ship(U t) {}
}

class ShippableCrate implements Shippable {
	public void ship(Object t){}
}

class Handler {
	public static <T> void prepare(T t){
		System.out.println("Preparing " + t);
	}


}
