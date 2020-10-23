class MyLinkedList {
    private Node head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int count=0;
        Node current = head;
        while(current!=null){
            if(count ==index){
                return current.data;
            }
            current=current.next;
            count++;
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.data=val;
        newNode.next=head;
        head=newNode;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
    	if(head == null) {
    		Node newNode = new Node(val);
    		head= newNode;
    	}else {
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        Node newNode = new Node(val);
        current.next = newNode;
    	}
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if(index== 0){
            newNode.next=head;
            head=newNode;
        }else {
        Node current = head;
        for(int i=0;i<index;i++){
        	if(i==index-1) {
        		newNode.next=current.next;
        		current.next=newNode;
        		break;
        	}
        	current = current.next; 
            }   
        }      
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    	if(index==0) {
    		Node temp=head;
    		head=head.next;		
    	}else {
        Node current = head;
        for(int i=0;i<=index;i++){
            if(i==index-1){
                Node temp = current;
                current = current.next;
                temp.next=current.next;
                break;
            }
            current = current.next;
        }
    	}
    }
    public void displayList() {
    	Node current = head;
    	while(current!=null) {
    		System.out.println(current.data);
    		current=current.next;
    	}
    	System.out.println();
    }
    
    
    public class Node {
        int data;
        Node next;
        Node(int x) { data = x; }
        
        public void displayNode() {
        	System.out.println("{"+data+"}");
        }
    }

public static void main(String[] args) {
	
	MyLinkedList myLinkedList = new MyLinkedList();
	myLinkedList.addAtTail(3);
	myLinkedList.addAtHead(1);
	myLinkedList.displayList();
	myLinkedList.addAtTail(3);
	myLinkedList.displayList();
	myLinkedList.addAtIndex(1, 2);
	myLinkedList.displayList();
	System.out.println(myLinkedList.get(1));
	myLinkedList.deleteAtIndex(0);
	System.out.println(myLinkedList.get(1));
	
}

}