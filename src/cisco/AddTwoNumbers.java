package cisco;

import java.util.LinkedList;

public class AddTwoNumbers {
	
	public static void main(String[] args) {
		ListNode h = new ListNode(243);
		ListNode h1 = new ListNode(564);
		
		ListNode h4 = addTwoNumbers(h,h1);
		LinkedList<Integer> a = new LinkedList<>();
		LinkedList<Integer> b = new LinkedList<>();
		//243 + 564 = 807 => output 708
		//342+465 = 807 => 708
		//243 + 31 = 342 + 19 => 361
		a.add(2);
		a.add(4);
		a.add(3);
		
		b.add(5);
		b.add(6);
		b.add(4);
		if(a.size()< b.size()) {
			for(int i =0; i < a.size(); i++) {
				
			}
		}
		
		
		int i = 0;
		while(!a.isEmpty() && i < a.size()) {
			System.out.println(a.get(i));
			i++;
		}
		

		
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode m = null;
		int nx;
		//243 + 564 = 807 => output 708
		while(l1.next != null) {
			//l1 = l1.next;
			System.out.println(l1.val);
		}
		return m;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}
