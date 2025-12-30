import java.io.IOException;
import java.util.List;
public class Wolf extends Canine {
	public double getAverageWeight(List<Integer> blabla) {
		return 50 + 20;
	}

	public static void main(String ... args) throws Exception{
		System.out.println(new Canine().getAverageWeight(null));
		System.out.println(new Wolf().getAverageWeight(null));
	}
}
