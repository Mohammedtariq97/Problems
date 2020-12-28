
public class mergeTwoLinkedList {
	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode current = list1;
        int count = 0;
        while(count!= a-1){
            current=current.next;
            count++;
        }
        ListNode start = current;
        while(count-1!=b){
            current=current.next;
            count++;
        }
        ListNode current2 = list2;
        while(current2.next!=null){
            current2 = current2.next;
        }
        start.next = list2;
        current2.next = current;
        return list1;
    }
}
