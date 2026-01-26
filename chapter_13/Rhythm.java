import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.FIELD;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@Target({FIELD, TYPE})
public @interface Rhythm {
	String[] value();
}

class Capybara {
	@Rhythm(value = {"Swing"})
	String favorite;

	@Rhythm(value = "R&B")
	String secondFavorite;

	@Rhythm({"Classical"})
	String mostLiked;

	@Rhythm("Country")
	String lastDisliked;
}
