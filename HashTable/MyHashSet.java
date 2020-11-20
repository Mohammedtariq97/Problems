import java.util.LinkedList;

public class MyHashSet {
	private Bucket[] bucketArray;
	private int keyRange;

	public MyHashSet() {
		this.keyRange = 769;
		this.bucketArray = new Bucket[this.keyRange];
		for (int i = 0; i < this.keyRange; ++i)
			this.bucketArray[i] = new Bucket();
	}

	// returns index of the key
	protected int _hash(int key) {
		return (key % this.keyRange);
	}

	public void add(int key) {
		int bucketIndex = this._hash(key);
		this.bucketArray[bucketIndex].insert(key);
	}

	public void remove(int key) {
		int bucketIndex = this._hash(key);
		this.bucketArray[bucketIndex].delete(key);
	}

	public boolean contains(int key) {
		int bucketIndex = this._hash(key);
		return this.bucketArray[bucketIndex].exists(key);
	}
}

class Bucket {
	private LinkedList<Integer> container;

	public Bucket() {
		container = new LinkedList<Integer>();
	}

	public void insert(Integer key) { // same key cannot be added
		int index = this.container.indexOf(key);
		if (index == -1) {
			this.container.addFirst(key);
		}
	}

	public void delete(Integer key) {
		this.container.remove(key);
	}

	public boolean exists(Integer key) {
		int index = this.container.indexOf(key);
		return (index != -1);
	}

	public static void main(String[] args) {
		MyHashSet set = new MyHashSet();
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.remove(1);
		set.remove(3);
		System.out.println(set.contains(1)); // no duplicate values stored
	}

}
