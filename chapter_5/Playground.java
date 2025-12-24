import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Playground{
	public static void main(String... args) {
		String string = "String";
		string.indexOf('t');
		System.out.println(string.substring(4,4));

		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));

		System.out.println("sb =" + sb);
		System.out.println("sub=" + sub);
		
		sb.insert(0,"beginning ");

		System.out.println("sub=" + sb);

		sb.delete(6, 100);

		sb.deleteCharAt(0);

		System.out.println("sub= " + sb);
		
		StringBuilder builder = new StringBuilder("This is my string builder");

		System.out.println(builder.replace(8, 10, "your"));

		System.out.println("reversed: " + builder.reverse());

		System.out.println(new StringBuilder("hello").equals(new StringBuilder("hello")));
		System.out.println(new Object() == new String());
		
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[]{42, 55, 99};
		int[] numbers3 = {42, 55, 99};
		//System.out.println("Anonymous array: " + {42, 55, 99});
		System.out.println("Anonymous array: " + numbers3);
		System.out.println("Anonymous array: " + Arrays.toString(numbers3));
		System.out.println("Anonymous array: " + Arrays.toString(new int[]{42, 55, 99}));
		System.out.println(numbers2.equals(numbers3));

		System.out.println("*****************************************");

		String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder();
		//objects[0] = new StringBuilder();

		System.out.println("*****************************************");

		String[] mammals = {"monkey", "chimp", "donkey"};
		System.out.println(mammals.length);

		System.out.println("*****************************************");

		int[] numbers = {6,9,1};
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));

		String[] strings1 = {"10","9","100"};
		Arrays.sort(strings1);
		System.out.println(Arrays.toString(strings1));

		System.out.println("*****************************************");

		int[] firstArray = {1,2,3};
		int[] secondArray = {4};
		System.out.println(Arrays.compare(firstArray, secondArray));


		String A[] = {"A"};
		String a[] = {"a"};

		System.out.println(Arrays.compare(A, a));

		System.out.println("*****************************************");


		int[][] bla = new int[3][];

		bla[0] = new int[]{1, 2, 4, 5, 5, 6, 6};
		bla[0][5]=2;
		System.out.println(Arrays.toString(bla[0]));
			
		System.out.println("*****************************************");


		var arrayList = new ArrayList<String>(3);
		arrayList.add( "Hi");


		System.out.println(arrayList);
	
		System.out.println("*****************************************");

		int fromStringToIntPrimitive = Integer.parseInt("0");
		System.out.println(fromStringToIntPrimitive);

		Integer fromStringToIntWrapper = Integer.valueOf("0");
		System.out.println(fromStringToIntWrapper);

		System.out.println("*****************************************");

		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		String[] stringArray = list.toArray(new String[0]);
		list.clear();

		System.out.println(objectArray.length);
		System.out.println(stringArray.length);

		System.out.println("*****************************************");
		
		String[] array = {"hawak", "robin"};
		List<String> list1 = Arrays.asList(array);
		System.out.println(list1.size());
		list1.set(1, "test");
		array[0] = "new";
		System.out.println(Arrays.toString(array));
		System.out.println(list1);

		System.out.println("*****************************************");
		
		Map<String, String> hashMap = new HashMap();

		hashMap.put("key", "Value");

		System.out.println(hashMap.get("ke3y"));
		System.out.println(Math.min(1, 2));


	}
}
