import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Optionals {
	public static void main(String [] args) {
		List<Optional<Double>> opts =  new ArrayList<>(Arrays.asList(average(), average(90, 100)));	
		
		for(var opt: opts) System.out.println(opt.orElseThrow(IllegalStateException::new));

	}

	public static Optional<Double> average(int ... scores) {
		if(scores.length == 0) return Optional.empty();

		int sum = 0;
		for (int score: scores) sum += score;

		return Optional.of((double)sum/scores.length);
	}
}
