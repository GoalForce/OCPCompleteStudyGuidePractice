import java.util.*;
import java.lang.annotation.*;

public class Donkey {
	public String kick (List... t) {
		Object[] a = t;
		t[0] = new ArrayList();
		return (String) t[0].get(0);
	}
}
