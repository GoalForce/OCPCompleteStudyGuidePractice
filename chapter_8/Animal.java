public class Animal {
	private int age;
	protected String name;
	static String bla;
	static{
		this.bla = "fds";
	}
	public int getAge() {
		return age;
	}

	public void setAge(int newAge) { 
		age = newAge;
	}
}
