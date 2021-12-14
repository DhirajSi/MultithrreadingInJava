package collectionexample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExample {
	public static void main(String[] args) {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
		// Traversing elements
//		for (String str : deque) {  
//		System.out.println(str);  
//		}  

		Iterator<String> it = deque.iterator();
	
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
	}

}
