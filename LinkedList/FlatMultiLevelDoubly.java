import java.util.Stack;

public class FlatMultiLevelDoubly {

	public static ListNode flatten(ListNode head) {
	    if (head == null) return head;

	    ListNode pseudoHead = new ListNode(0, null, head, null);
	    ListNode curr, prev = pseudoHead;

	    Stack<ListNode> stack = new Stack<>();
	    stack.push(head);

	    while (!stack.isEmpty()) {
	      curr = stack.pop();
	      prev.next = curr;
	      curr.prev = prev;

	      if (curr.next != null) stack.push(curr.next);
	      if (curr.child != null) {
	        stack.push(curr.child);
	        
	        curr.child = null;
	      }
	      prev = curr;
	    }
	    
	    pseudoHead.next.prev = null;
	    return pseudoHead.next;
	  }
	
	class ListNode {
	    public int val;
	    public ListNode prev;
	    public ListNode next;
	    public ListNode child;
	}

}
