
public class ReverseLinkedList2 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null) {
			return head;
		}
		ListNode cur = head, prev = null;

		while (m > 1) {
			prev = cur;
			cur = cur.next;
			m--;
			n--;
		}

		
		ListNode con = prev, tail = cur;  // The two pointers that will fix the final connections.

		
		ListNode third = null;  // Iteratively reverse the nodes until n becomes 0 because we decrementing m & n								
		while (n > 0) {			// in the above loop
			third = cur.next;
			cur.next = prev;
			prev = cur;
			cur = third;
			n--;
		}

		// Final connections
		if (con != null) {
			con.next = prev;
		} else {
			head = prev;
		}

		tail.next = cur;
		return head;
	}

	public class ListNode {
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
}
