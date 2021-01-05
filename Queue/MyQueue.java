import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	private List<Integer> data;
	private int pStart;

	MyQueue() {
		data = new ArrayList<Integer>();
		pStart = 0;
	}

	// Inserting elements
	public boolean enqueue(int x) {
		data.add(x);
		return true;
	}

	// Removing elements
	public boolean dequeue() {
		if (isEmpty() == true) {
			return false;
		}
		pStart++;
		return true;
	}

	// Checking queue is empty or not
	private boolean isEmpty() {
		return pStart >= data.size();
	}

	// Getting first item from queue
	public int front() {
		return data.get(pStart);
	}

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		if (q.isEmpty() == false) {
			System.out.println(q.front());
		}
		q.dequeue();
		if (q.isEmpty() == false) {
			System.out.println(q.front());
		}
		q.dequeue();
		if (q.isEmpty() == false) {
			System.out.println(q.front());
		}
	}

}
