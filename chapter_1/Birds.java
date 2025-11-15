// .java file can contain multipe classes but only one can be declared as public
// and the one declared public must match file name
class Birds{

}

public class Birds2{
	// folling are valid parameters for main method:
	// String[] args
	// String [] args
	// String []args
	// String args[]
	// String args []
	// String... args
	// String ... args
	// String ...args
	public static void main(String ...args){
		System.out.println("Hello"); // Does not compile 
	}

}
