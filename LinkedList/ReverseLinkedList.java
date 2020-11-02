public class ReverseLinkedList {
	static ListNode head;

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null)
			return head;
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
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new ListNode(1);
		list.head.next = new ListNode(2);
		list.head.next.next = new ListNode(3);
		list.head.next.next.next = new ListNode(4);
		list.head.next.next.next.next = new ListNode(5);
		ListNode current = reverseList(head);
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
}
