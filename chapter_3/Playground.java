import java.util.concurrent.ExecutorService;
public class Playground {
	public static void main(String ... args){
		float a = 45.0f, b = 12.0F;
		float result = a % b;
		System.out.println(result);

		long c = 12l + 2147483648l;
		System.out.println(c);

		int compound = 12;
		compound = compound + 2147483647;
		System.out.println(compound);
		Integer intValue = 12;

		if(null instanceof ExecutorService){

		}

		int k = a > 12 ? 12: "Hello";
	}
}
