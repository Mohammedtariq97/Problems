
public class deleteNode {
	public void deleteNode(ListNode node) {
		//deleting node without access to head node
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
