import java.util.LinkedList;
import java.util.Queue;

public class Queues {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("First");
		System.out.println(q.element());
		
		q.offer("Second");

		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}
