public class RemoveElements {
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
		RemoveElements list = new RemoveElements();
		list.head = new ListNode(1);
		list.head.next = new ListNode(2);
		list.head.next.next = new ListNode(6);
		list.head.next.next.next = new ListNode(3);
		list.head.next.next.next.next = new ListNode(4);
		list.head.next.next.next.next.next = new ListNode(5);
		list.head.next.next.next.next.next.next = new ListNode(6);

		ListNode current = removeElements(head, 6);
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}

	private static ListNode removeElements(ListNode head, int val) {
		while (head != null && head.val == val) {
			head = head.next;
		}
		ListNode dummy = head;
		while (dummy != null && dummy.next != null) {
			if (dummy.next.val == val) {
				dummy.next = dummy.next.next;
			} else {
				dummy = dummy.next;
			}
		}
		return head;
	}
}
