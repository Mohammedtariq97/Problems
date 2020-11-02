public class Palindrome {
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
	  Palindrome list = new Palindrome();
	  list.head = new ListNode(1);
    list.head.next = new ListNode(2);
    list.head.next.next = new ListNode(3);
	  list.head.next.next.next = new ListNode(3);
	  list.head.next.next.next.next = new ListNode(2);
    list.head.next.next.next.next.next = new ListNode(1);
    Boolean result = isPalindrome(head);
	  System.out.println(result);
	}

private static Boolean isPalindrome(ListNode head) {
	  ListNode slow= head;
	  ListNode fast = head;
	  while(fast!=null && fast.next!=null){
	       slow=slow.next;
	       fast=fast.next.next;
	  }
	  slow=reversed(slow);
      fast=head;
      while(slow!=null){
	       if(slow.val!=fast.val){
	           return false;
	        }
      slow = slow.next;
	  fast=fast.next;
	  }
	  return true;
	  }

private static ListNode reversed(ListNode head) {
	  ListNode current = head;
      while(head.next!=null){
      ListNode p=head.next;
      head.next=p.next;
      p.next=current;
      current=p;
			}
        return current;
}
}
