package map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hiii {
	public static void main(String[] args) {
		Map<Integer, String> j = new LinkedHashMap<Integer, String>();
		j.put(1, "hi");
		j.put(2, "hello");
		j.put(3, "how r u");
		j.put(null, "how");
		j.put(null, "what");
		j.put(null, "why");
		System.out.println(j);

		for (Entry<Integer, String> e : j.entrySet()) {

			System.out.println(e.getKey() + " " + e.getValue());

		}
		Set s = j.keySet();
		System.out.println(s);

		Collection c = j.values();
		System.out.println(c);
		Set s1 = j.entrySet();
		System.out.println(s1);

	}
}
