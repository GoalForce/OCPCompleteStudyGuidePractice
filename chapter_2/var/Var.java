package var;
public class Var{
	public void var(){
		var var = "var";
	}

	public void Var(){
		Var var = new Var();
	}
	void changeInt(int a){ a = 12;}
	public static void main(String args[]){

		int a = 15,65;		
		new Var().changeInt(a);
		System.out.println(a);
	}
}
