public class DeleteNodes {
	public ListNode deleteNodes(ListNode head, int m, int n) {
		ListNode currentNode = head;
		ListNode lastMNode = head;
		while (currentNode != null) {
			int mCount = m;
			int nCount = n;
			while (currentNode != null && mCount != 0) {
				lastMNode = currentNode;
				currentNode = currentNode.next;
				mCount--;
			}
			while (currentNode != null && nCount != 0) {
				currentNode = currentNode.next;
				nCount--;
			}
			lastMNode.next = currentNode;
		}
		return head;
	}
}
