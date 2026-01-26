public abstract class Animal {
	abstract void chew();
	
	public static void main(String args[]){
		Animal animal = new Hippo();
	}

}

class Hippo extends Animal {
	final void chew(){}
}

class PygmyHippo extends Hippo{
	void chew() {}
}

abstract class ZooKeeper {
	abstract final void chew();
}
