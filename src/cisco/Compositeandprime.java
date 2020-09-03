package cisco;
import java.util.ArrayList;
import java.util.Scanner;
public class Compositeandprime {
public static void main(String[] args) {
	Scanner m = new Scanner(System.in);
	String input1 = m.nextLine();
	int intp = Integer.parseInt(input1);
	String input = m.nextLine();
	String[] resarrayQ = input.split(" ", 100); 
	int result;
	String res;
	ArrayList<Integer> arr = new ArrayList<>();
	for(int i = 0; i < intp; i++) {
		result = Integer.parseInt(resarrayQ[i]);
		arr.add(result);
	}
	for(Integer m1 : arr) {
		boolean composite = false;
		for (int i = 2; i <= Math.sqrt(m1); i++) {
			if((m1 % i) == 0) {
				System.out.print("Composite ");
				composite = true;
			}
		}
		if (!composite && m1 != 1)
			System.out.print("Prime ");
	}
}
}
