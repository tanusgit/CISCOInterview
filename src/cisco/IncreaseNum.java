package cisco;

import java.util.Scanner;

public class IncreaseNum {
	/*
	 * Mona has a fascination with numbers. She likes numbers that have their digits
	 * in increasing order like 149, 468, 789, etc. She does not like numbers that
	 * don't follow this rule like 543, 664, 299, etc.
	 * 
	 * 
	 * Given a number N as input, find the largest number less than or equal to N
	 * which will appeal to Mona's liking. input = 998 ouput = 789
	 */

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		int num = m.nextInt();
		System.out.println("num:" + num);

		boolean asc = false;
		while (asc == false) {
			String in = String.valueOf(num);
			asc = true;
			for (int j = 0; j < in.length() - 1; j++) {
				System.out.println("comparing:" + in.charAt(j) + ", " + in.charAt(j + 1));
				if (in.charAt(j) >= in.charAt(j + 1)) {
					asc = false;
					System.out.println("greater");
					break;
				}
			}
			if (!asc)
				num--;
			System.out.println("num:" + num);
		}
		System.out.println(num);
	}

	public static int funct(int num, boolean ase) {
		boolean asc = false;
		while (asc == false) {
			String in = String.valueOf(num);
			for (int j = 0; j < in.length(); j++) {
				if (in.charAt(j) > in.charAt(j + 1)) {
					asc = false;
				}
			}
			num--;
		}
		return 0;

		/*
		 * ase = asend(num); while(ase == false) {
		 * 
		 * funct(num-1, ase); if(ase == true) { break; } } return num;
		 */
	}

	public static boolean asend(int num) {
		boolean ase;
		int count = 0;
		int count2 = 0;
		String in = String.valueOf(num);
		for (int j = 0; j < in.length() - 1; j++) {
			// System.out.println("jjjjjj");
			if (in.charAt(j + 1) > in.charAt(j)) {
				count++;

			} else {
				count2++;

			}
		}
		if (count > count2) {
			// System.out.println("ascending");
			ase = true;
		} else {
			// System.out.println("desending");
			ase = false;
		}
		// System.out.println(num);
		return ase;

	}
}
