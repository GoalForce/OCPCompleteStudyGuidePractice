import java.io.IOException;
import java.util.List;
class Main {
	public static void main(String args[]) {
		new Main().fall(120);	
	}

	void fall(int distance) throws NullPointerException {
		try {
			if(distance>10) throw new IOException();

		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	void fall() {
		Object a = 12;
		Integer b = 12;
		if(a instanceof List){
		}
	}
}
