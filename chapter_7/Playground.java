import java.util.List;
import java.util.Arrays;

public class Playground {

	{
		System.out.println("Nema");
	}
	public static void main(String ... args) {

		test(1,2,3);

		int[]a1= {1,2,3};
		int[] a2=  {1,2,3};
		int[] a3= new int[3];
		Object a4 = new int[]{456};
		System.out.println(a4);
		
		System.out.println("*****");
		reAssign(new int[]{1,2,3});

		System.out.println(Arrays.toString(a1));
		System.out.println("*****");

		//new Playground().fly1(a3);
		test(null);
		


	}

	static void reAssign(int [] a){
		int[] aa = {12,12};
		a = aa;
	}

	static final public synchronized  void  test( int...blabla  ){
		for(int a: blabla){
			System.out.println(a);
		}
	}

	class var22{
	}

	//public void fly(List<String> strings){}
	//public void fly(List<Integer> integers){}
	
	public void fly(String[] strings){}
	public void fly(int[] integers){}

	public void fly1(Object a){
		System.out.println("Object");
	}

	public void fly1(String[] a){
		System.out.println("String");
	}

	public void moreE(String[] values, String ... nums){}

	public void woof(boolean[] b1){}
	public void woof(Boolean[] b){}


}
