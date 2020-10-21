package exammidterm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("watermelon");
		//list.add("orange");
		//list.add("lem");
		/*Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		};
		
		Collections.sort(list, comp);
		System.out.println(list);

	
}
}
