import java.util.List;
import java.util.Comparator;
import java.util.*;
import java.util.stream.*;
class CollectingResults {
	public static void main(String args[]) {
		List<Student> students = List.of(
					new Student(15, 55.0, 170, "StudentA"),
					new Student(14, 57.3, 160, "StudentB"),
					new Student(14, 65.0, 168, "StudentC"),
					new Student(15, 49.8, 165, "StudentD"),
					new Student(16, 54.5, 158, "StudentE")
				);

		System.out.println(students.stream().collect(Collectors.averagingDouble(x->x.weight)));
		System.out.println(students.stream().collect(Collectors.counting()));
		System.out.println(students.stream().collect(Collectors.groupingBy(x -> x.age)));
		System.out.println(students.stream().map(Student::toString).collect(Collectors.joining(";")));
		System.out.println(students.stream().collect(Collectors.minBy(Comparator.comparing(Student::getAge))));
		HashSet<Student> sHashSet = students.stream().collect(Collectors.toCollection(HashSet::new));
		System.out.println(sHashSet);

		var ohMy = Stream.of("lions", "tigers", "bears");
		Map<String, Integer> map = ohMy.collect(Collectors.toMap(s->s, String::length));
		System.out.println(map);
	}
}

class Student {
	int age;
	double weight;
	double height;
	String name;

	Student(int age, double weight, double height, String name){
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.name = name;
	}

	public String toString(){
		return "name=" + this.name;
	}

	public int getAge(){ return age;} 
}
