package cisco;

public class NumPosition {
	public static void main(String[] args) {
		//function takes big num and one index.
		//return the value in the index
		giveValue(1234, 3);
	}

	private static void giveValue(int num, int index) {
		int res = num % 10;
		int res1 = num % 100;
		int res2 = num % 1000;
		int res3 = num % 10000;
		System.out.println("remainder of 10 = " + res);
		System.out.println("remainder of 100  " + res1);
		System.out.println("remainder of 1000  " + res2);
		System.out.println("remainder of 10000  " + res3);
	}
	
	
}
