import java.util.HashMap;
import java.util.Map;

public class En7_3 {
	public static void main(String[] args) {
		Map<String, String> fruits = new HashMap<>();
		fruits.put("RINGO","apple");
		fruits.put("MIKAN","orange");
		fruits.put("BANANA","banana");

		System.out.println(fruits.get("RINGO"));
	}
}

