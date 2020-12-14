
public class binaryTodecimal {
	public int getDecimalValue(ListNode head) {
        int num= head.val;
        while(head.next!=null){
            num=num*2 +head.next.val;  //num*2^0 + num*2^1 + num*2^2.....
            head=head.next;
        }
        return num;
    }
}
