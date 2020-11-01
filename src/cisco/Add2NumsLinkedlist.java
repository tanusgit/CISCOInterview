package cisco;
/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 243 + 564 are in reverse order
 so the original order is 342 + 564 
 =807 
 but we need to return in reverse order so, 708
 *
 */
class Node {
	int val;
	Node next;

	Node() {
	}

	Node(int val) {
		this.val = val;
	}

	Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
}

public class Add2NumsLinkedlist {
	//this Node class is actually a list
	//l1 and l2 are lists
	public Node addTwoNumbers(Node l1, Node l2) {
		Node d = new Node(0);
		Node p = l1;
		Node q = l2;
		Node curr = d;
		int carry = 0;
		int x = 0;
		int y = 0;
		while (p != null || q != null) {
			if (p != null) {
				x = p.val;
			} else
				x = 0;
			if (q != null) {
				y = q.val;
			} else
				y = 0;

			int sum = carry + x + y;
			carry = sum / 10;
			Node n = new Node(sum % 10);
			curr.next = n;
			curr = curr.next;
			
			if (p != null) {
				p = p.next;
			}
			if (q != null) {
				q = q.next;
			}
		}
		if (carry > 0) {
			curr.next = new Node(carry);
		}
		return d.next;
	}

}
