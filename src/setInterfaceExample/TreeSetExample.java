package setInterfaceExample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// Creating and adding elements
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(15);
		set.add(10);
		set.add(50);
		set.add(2);
		// traversing elements
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
