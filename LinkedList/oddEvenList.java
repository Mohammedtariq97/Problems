public class oddEvenList {
	static ListNode head;

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		oddEvenList list = new oddEvenList();
		list.head = new ListNode(1);
		list.head.next = new ListNode(2);
		list.head.next.next = new ListNode(3);
		list.head.next.next.next = new ListNode(4);
		list.head.next.next.next.next = new ListNode(5);
		list.head.next.next.next.next.next = new ListNode(6);
		list.head.next.next.next.next.next.next = new ListNode(7);
		list.head.next.next.next.next.next.next.next = new ListNode(8);
		ListNode current = oddEvenlist(head);
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}

	private static ListNode oddEvenlist(ListNode head) {
		if (head == null)
			return head;
		ListNode odd = head;
		ListNode evenHead = head.next;
		ListNode even = evenHead;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}
}
