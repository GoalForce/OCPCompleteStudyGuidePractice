// Method return type is not part of the method signature only method name
// and method parameters are.

public class Animal {
	String name;

	public String getName(){
		return name;
	}

	public int getName(){
		return 4;
	}

	public void setName(String newName){
		name = newName;
	}

	public static void main(String ... args){
		var animal = new Animal();
		animal.setName("Giraffe");
		String animalName = animal.getName(); // Does not compile
		System.out.println(animalName);
	}
}
