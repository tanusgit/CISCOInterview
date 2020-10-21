package cisco;

//Given an array of integers nums and an integer 
//target, return indices of the two numbers such that they add up to target.
public class TwoSum {
	public static void main(String[] args) {
		int a[] = { 5, 2, 1, 8, 9, 10, 7, 3 };
		int target = 6;
		int l[] = twoSum(a, target);
		System.out.print(l[0] + " " + l[1]);
	}

	private static int[] twoSum(int[] a, int target) {
		int b[] = { 0, 0 };
		int sum = target;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (sum == (a[i] + a[j])) {
					b[0] = i;
					b[1] = j;
					// System.out.println("hello" + b[0]+ " "+ b[1]);
				}
			}
		}
		return b;

	}
}
