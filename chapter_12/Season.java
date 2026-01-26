public enum Season {
	WINTER("Low"){
		public String getHours(){ return "10am-3pm" + getField();}
	}, 
	SPRING("Medium"), 
	SUMMER("High"){
		public String getHours() { return "9am-7pm" ;}	
	}, 
	FALL("Medium");

	private String field;

	Season(String field){
		this.field = field;
	}

	String getField(){
		return field;
	}

	public String getHours(){
		return "9am-5pm" + field;
	}

	public static void main(String args[]) {
		for(Season season : Season.values() ){
			System.out.println(season + " " + season.ordinal() + " " + season.getHours());
		}

		Season season = Season.valueOf("FALL");
		System.out.println(season.getField());

		switch (season) {
			case SUMMER: System.out.println("Summer"); break;
			case FALL: System.out.println("fall"); break;
		}
	}
}
