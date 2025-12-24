class Playground {
	public static void main(String ... args){
		int a = 12;
		if (a > 10) System.out.println("Katta"); 
		else System.out.println("Kichkina");

		String g = "";	
		switch (g){
			case "": break;
		}

		short dayOfWeek = 0;

		switch(dayOfWeek){
			default: System.out.println("Weekday"); break;
			case (short)0: System.out.println("Sunday"); break;
			case 66: System.out.println("Saturday"); break;
		}

		short size = 4;
		final int small = 15;
		final int big = 1000000;
		switch(size){
		//	case small: 
		}

		short size1 = small +1;
		for(int counter=4, decre=3; ;){break;}

		int[] r = new int[3];

		for(var ra: r ){
			System.out.println(ra);
		}
	}
}
