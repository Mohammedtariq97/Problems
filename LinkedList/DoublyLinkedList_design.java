public class DoublyLinkedList {
	private DoublyListNode head;

	public class DoublyListNode {
		int val;
		DoublyListNode next;
		DoublyListNode prev;

		DoublyListNode(int x) {
			val = x;
		}
	}

	public DoublyLinkedList() {
		head = null;
	}

	private DoublyListNode getNode(int index) {
		DoublyListNode cur = head;
		for (int i = 0; i < index && cur != null; ++i) {
			cur = cur.next;
		}
		return cur;
	}

	private DoublyListNode getTail() {
		DoublyListNode cur = head;
		while (cur != null && cur.next != null) {
			cur = cur.next;
		}
		return cur;
	}

	public int get(int index) {
		DoublyListNode cur = getNode(index);
		return cur == null ? -1 : cur.val;
	}

	public void addAtHead(int val) {
		DoublyListNode cur = new DoublyListNode(val);
		cur.next = head;
		if (head != null) {
			head.prev = cur;
		}
		head = cur;
		return;
	}

	public void addAtTail(int val) {
		if (head == null) {
			addAtHead(val);
			return;
		}
		DoublyListNode prev = getTail();
		DoublyListNode cur = new DoublyListNode(val);
		prev.next = cur;
		cur.prev = prev;
	}

	public void addAtIndex(int index, int val) {
		if (index == 0) {
			addAtHead(val);
			return;
		}
		DoublyListNode prev = getNode(index - 1);
		if (prev == null) {
			return;
		}
		DoublyListNode cur = new DoublyListNode(val);
		DoublyListNode next = prev.next;
		cur.prev = prev;
		cur.next = next;
		prev.next = cur;
		if (next != null) {
			next.prev = cur;
		}
	}

	public void deleteAtIndex(int index) {
		DoublyListNode cur = getNode(index);
		if (cur == null) {
			return;
		}
		DoublyListNode prev = cur.prev;
		DoublyListNode next = cur.next;
		if (prev != null) {
			prev.next = next;
		} else {
			// modify head when deleting the first node.
			head = next;
		}
		if (next != null) {
			next.prev = prev;
		}
	}

	public void displayList() {
		DoublyListNode current = head;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addAtHead(1);
		list.displayList();
		list.addAtTail(3);
		list.displayList();
		list.addAtIndex(1, 2);
		list.displayList();
		System.out.println();
		System.out.println(list.get(1));
		System.out.println();
		list.deleteAtIndex(1);
		list.displayList();
		System.out.println();
		System.out.println(list.get(1));

	}
}
