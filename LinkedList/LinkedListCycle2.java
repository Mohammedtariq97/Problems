public static ListNode detectCycle(ListNode head) {
		if(head==null){
            return null;
        }
        boolean hasCycle = false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null && slow!=null){
            if(slow==fast){
                hasCycle = true;
                break;
            }
            slow= slow.next;
            fast= fast.next.next;
        }
        if(!hasCycle){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast= fast.next;
        }
        return slow;
    }
	
	static class ListNode {
		    int val;
		    ListNode next;
		    ListNode(int x) {
		        val = x;
		        next = null;
		    }
	}
}
