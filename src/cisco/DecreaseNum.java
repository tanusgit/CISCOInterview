package cisco;

public class DecreaseNum {
	public static void main(String[] args) {
		int num = 123;
		int num2 = 998;
		// boolean res = decrement(18);
		// System.out.println(res);
		int m = Minus(998);
		System.out.println(m);
	}

	private static int Minus(int i) {
		boolean ase = false;
		while (ase == false) {
			ase = decrement(i);
			if (ase == true) {
				break;
			}
			i--;
			
		}
		return i;
	}

	private static int Minus2(int i) {
		while (decrement(i) == false) {
			i--;
		}
		return i;
	}

	private static boolean decrement(int i) {
		boolean ase = false;
		String input = String.valueOf(i);
		int countlength = 1;

		for (int j = 0; j < input.length() - 1; j++) {
			if (input.charAt(j + 1) > input.charAt(j)) {
				countlength++;

			}
		}
		// System.out.println("countlenght = " + countlength + " "+ input.length());
		// counterlenght is getting increamented only when the condition is true
		if (countlength == input.length()) {
			ase = true;
		}

		else {
			ase = false;
		}
		return ase;

	}

}
