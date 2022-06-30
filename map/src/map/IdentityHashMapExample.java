package map;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		IdentityHashMap m = new IdentityHashMap();

		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		m.put(I1, "CHAMU");
		System.out.println(m.put(I2, "SOWMYA"));
		// System.out.println(m);
		System.out.println(I1 == I2);
		System.out.println(I1.equals(I2));
		System.out.println(m);
//		m.put(1, "mango");
//		m.put(2, "banana");
//		m.put(2, "apple");
//		System.out.println(m);

	}

}
