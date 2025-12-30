import java.io.IOException;
public class Playground {


	static{
		System.out.println("Static called");
	}

	static int init = init();

	static int init() {
		System.out.println("Init called");
		return 4;
	}




	public static void main(String args[]) throws IOException {}
}
