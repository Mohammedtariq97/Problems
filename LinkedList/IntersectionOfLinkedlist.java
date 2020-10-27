import java.util.LinkedList;

public class IntOfLinkedList {
	  static ListNode head1,head2; 
	  static class ListNode {
		    int val;
		    ListNode next;
		    ListNode(int x) {
		        val = x;
		        next = null;
		    }
		}  
	  
	  public static void main(String[] args) {	
		IntOfLinkedList list = new IntOfLinkedList();
		
		list.head1 = new ListNode(4); 
        list.head1.next = new ListNode(1); 
        list.head1.next.next = new ListNode(8); 
        list.head1.next.next.next = new ListNode(4); 
        list.head1.next.next.next.next = new ListNode(5); 
             
        list.head2 = new ListNode(5); 
        list.head2.next = new ListNode(6); 
        list.head2.next.next = new ListNode(1); 
        list.head2.next.next = new ListNode(8); 
        list.head2.next.next.next = new ListNode(4); 
        list.head2.next.next.next.next = new ListNode(5); 
        
        list.head1.next=list.head2.next.next;
        
        ListNode resNode = getIntersectionNode(head1,head2);
        System.out.println(resNode.val);
	}
	  
	  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        if(headA==null || headB == null) return null;      
	        ListNode a_pointer = headA;
	        ListNode b_pointer = headB;       
	        while(a_pointer != b_pointer){           
	            if(a_pointer == null){
	                a_pointer = headB;
	            }else{
	                a_pointer = a_pointer.next;
	            }            
	            if(b_pointer == null){
	                b_pointer = headA;
	            }else{
	                b_pointer = b_pointer.next;
	            }  
	        }
	       return a_pointer; 
	    } 
}
