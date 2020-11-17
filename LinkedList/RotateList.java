public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null)
			return head;
		ListNode current = head;
		int n = 1;
		while (current.next != null) {
			current = current.next;
			n++;
		}
		current.next = head; //Making circular linkedList
		ListNode newTail = head;
		ListNode newHead = head.next;
		//getting newTail: n-k%n-1
		//getting newHead: n-k%n
		for (int i = 0; i < n - k % n - 1; i++) {
			newTail = newTail.next;
			newHead = newHead.next;
		}
		newTail.next = null;
		return newHead;
	}
}
