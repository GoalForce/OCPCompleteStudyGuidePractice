public @interface Music {
	String[] genres();
}

class Giraffe {
	@Music(genres={})
	String mostDisliked;

	@Music(genres="Classical")
	String favorite;
}
