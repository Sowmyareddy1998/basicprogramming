package map;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		IdentityHashMap<Integer, String> m = new IdentityHashMap<>();
		m.put(101, "sowmya");
		m.put(102, "chamu");
		m.put(103, "charan");
		m.put(103, "sudheer");
		m.put(103, "sudheer1");
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "  " + m1.getValue());
			if (m1.getKey().equals(101)) {
				m1.setValue("usha");

			}

		}
		System.out.println(m);
	}

}
