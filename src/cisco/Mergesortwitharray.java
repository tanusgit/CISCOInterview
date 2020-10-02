package cisco;

import java.util.ArrayList;
import java.util.List;

public class Mergesortwitharray {
	public static void main(String[] args) {
		 List<Integer> a = new ArrayList<>();
		 List<Integer> b = new ArrayList<>();
		 a.add(1);
		 a.add(2);
		 a.add(3);
		 b.add(2);
		 b.add(5);
		 b.add(5);
			List c = mergeArrays(a,b);
			System.out.println(c);
		}

	private static List mergeArrays(List<Integer> a, List<Integer> b) {
		List<Integer> l = new ArrayList<>();
		int ai = 0;
		int bi =0;
		int totalsize = a.size() + b.size();
		System.out.println(totalsize);
		
		for(int i = 0; i < totalsize; i++) {
			if(ai >=a.size()) {
				l.add(b.get(bi));
				bi++;
				continue;
			}
			if(bi >=b.size()) {
				l.add(a.get(ai));
				ai++;
				continue;
			}
			if(a.get(ai) > b.get(bi)) {
				l.add(b.get(bi));
				bi++;
			}
			else{
				l.add(a.get(ai));
				ai++;
			}
		}
		return l;
	}
}
