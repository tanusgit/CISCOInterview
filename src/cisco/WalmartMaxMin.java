package cisco;

import java.util.Scanner;

public class WalmartMaxMin {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		// Scanner m1 = new Scanner(System.in);

		long input = m.nextLong();
		long input2 = m.nextLong();
		String in3 = String.valueOf(input);
		String in2 = String.valueOf(input);
		System.out.println(input + " " + input2);
		
		long count = 0;
		long count1 = 0;
		long result = 0;
		long result2 = 0;
		for (long i = input; i <= input2; i++) {
			String in = String.valueOf(i);
			for(int j = 1; j < in.length()-1; j++) {
				if(in.charAt(j) > in.charAt(j-1) && in.charAt(j) > in.charAt(j+1)) {
					count++;
				}
				if(in.charAt(j) < in.charAt(j-1) && in.charAt(j) < in.charAt(j+1)) {
					count1++;
				}
			}
		}
		System.out.println((count + count1));
			
			/*char c = in.charAt(0);
			char c1 = in.charAt(1);
			char c2 = in.charAt(2);
			System.out.println(c + " " + c1 + " " + c2);
			if (c1 < c && c1 < c2) {
				count++;
				result2 = count;
				System.out.println("min " + result2);
			}
			if (c1 > c && c1 > c2) {
				count1++;
				result = count1;
				System.out.println("max" + result);
			}		
		}
		
		System.out.println("final result " + (result + result2));*/

	}
}
