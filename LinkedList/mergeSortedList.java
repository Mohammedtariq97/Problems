public class mergeSortedList {
	static ListNode head1, head2;

	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode prev = dummy;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				prev.next = l1;
				l1 = l1.next;
			} else {
				prev.next = l2;
				l2 = l2.next;
			}
			prev = prev.next;
		}
		if (l1 == null) {
			prev.next = l2;
		} else {
			prev.next = l1;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		mergeSortedList list = new mergeSortedList();
		list.head1 = new ListNode(1);
		list.head1.next = new ListNode(2);
		list.head1.next.next = new ListNode(4);

		list.head2 = new ListNode(1);
		list.head2.next = new ListNode(3);
		list.head2.next.next = new ListNode(4);

		ListNode resultList = mergeTwoLists(head1, head2);
		ListNode temp = resultList;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
