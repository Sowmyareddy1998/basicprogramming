package map;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		List<Laptop> l = new ArrayList<>();
		l.add(new Laptop("dell", 16, 100));
		l.add(new Laptop("apple", 18, 180));
		l.add(new Laptop("ancer", 20, 200));
		// Collections.sort(l);
		for (Laptop la : l) {
			System.out.println(la);
		}
//		Map<String, Integer> mp = new HashMap();
//
//		mp.put("hh", 20);
//		// mp.put(12.3, "7");
//
//		mp.replace("hh", 21);
//
//		// System.out.println(mp.containsKey("hh"));
//
//		System.out.println(mp);
	}

}
