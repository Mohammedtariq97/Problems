
public class middleNode {
	public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count=1;
        while(current.next!=null){
            current=current.next;
            count++;
        }
        current=head;       
        for(int i=0;i< count/2 ;i++){
            current=current.next;
        }
        return current;
    }
}
