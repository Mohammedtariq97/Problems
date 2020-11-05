public class AddTwoNumbers {
	static ListNode l1, l2;

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3Head = new ListNode(0);
		ListNode l3 = l3Head;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int l1_val = (l1 != null) ? l1.val : 0;
			int l2_val = (l2 != null) ? l2.val : 0;
			int sum = l1_val + l2_val + carry;
			carry = sum / 10;
			int last_digit = sum % 10;
			ListNode newNode = new ListNode(last_digit);
			l3.next = newNode;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
			l3 = l3.next;
		}
		if (carry > 0) {
			ListNode newNode = new ListNode(carry);
			l3.next = newNode;
			l3 = l3.next;
		}
		return l3Head.next;
	}

	public static ListNode reverseList(ListNode head) {
		ListNode current = head;
		while (head.next != null) {
			ListNode p = head.next;
			head.next = p.next;
			p.next = current;
			current = p;
		}
		return current;
	}

	public static void main(String[] args) {
		AddTwoNumbers list = new AddTwoNumbers();
		list.l1 = new ListNode(9);
		list.l1.next = new ListNode(9);
		list.l1.next.next = new ListNode(9);
		list.l1.next.next.next = new ListNode(9);
		list.l2 = new ListNode(9);
		list.l2.next = new ListNode(9);
		ListNode l3List = addTwoNumbers(l1, l2);
		ListNode temp = l3List;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
