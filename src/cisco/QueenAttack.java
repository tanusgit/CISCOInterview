package cisco;

import java.util.ArrayList;
import java.util.Scanner;

public class QueenAttack {
	public static void main(String args[]) {
		// Write your code here
		Scanner m = new Scanner(System.in);
		String input = m.nextLine();
		String[] resarrayQ = input.split(" ", 5);

		String input2 = m.nextLine();
		String[] resarray2P = input2.split(" ", 5);
		int result;
		int result2;
		ArrayList<Integer> arrQ = new ArrayList<>();
		ArrayList<Integer> arr2P = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			result = Integer.parseInt(resarrayQ[i]);
			result2 = Integer.parseInt(resarray2P[i]);
			arrQ.add(result);
			arr2P.add(result2);
			if (result == result2) {
				System.out.println("Yes");
				return;
			}

		}
		if ((arrQ.get(0) - arr2P.get(0)) / (arrQ.get(1) - arr2P.get(1)) == 1
				|| (arrQ.get(0) - arr2P.get(0)) / (arrQ.get(1) - arr2P.get(1)) == -1) {
			System.out.println("Yes");
		} else
			System.out.println("No");

	}
}
