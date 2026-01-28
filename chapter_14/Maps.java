import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;
public class Maps {
	public static void main(String args[]) {
		Map<String, String> map = new TreeMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala");
		for (String key: map.keySet()) System.out.print(key + ",");
		System.out.println();
	
		//System.out.println(map.contains("lion"));
		System.out.println(map.containsKey("lion"));
		System.out.println(map.containsValue("lion"));
		System.out.println(map.size());
		map.clear();
		System.out.println(map.size());
		System.out.println(map.isEmpty());

		Map<Integer, Character> map2 = new HashMap<>();
		map2.put(1, 'a');
		map2.put(2, 'b');
		map2.put(3, 'c');
		
		map2.forEach((k,v) -> System.out.println(v));
		map2.values().forEach(System.out::println);
		
		Set<Entry<Integer, Character>> entrySet = map2.entrySet();
		System.out.println(entrySet.iterator().next().getKey());
		
		Map<Character, String> map3 = new HashMap<>();
		map3.put('x', "spot");
		System.out.println("X marks the " + map3.get('x'));
		System.out.println("X marks the " + map3.getOrDefault('x', ""));
		System.out.println("Y marks the " + map3.get('y'));
		System.out.println("Y marks the " + map3.getOrDefault('y', ""));

		Map<Integer, Integer> map4 = new HashMap<>();
		map4.put(1,2);
		map4.put(2,4);
		Integer original = map4.replace(2, 10);
		System.out.println(map4);
		map4.replaceAll((k,v)->k+v);
		System.out.println(map4);
		System.out.println("*******************************");

		Map<String, String> dummyMap = new HashMap<>();
		dummyMap.put("key1", null);
		dummyMap.put("key2", "value2");

		System.out.println(dummyMap);

		dummyMap.merge("key3", "value321234", (value1, value2) -> value1.length() > value2.length()?value1:value2);
		System.out.println(dummyMap);

	}
}
