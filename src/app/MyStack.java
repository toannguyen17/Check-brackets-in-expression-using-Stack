package app;

public class MyStack {
	private String arr[];
	private int size;
	private int index = 0;

	public MyStack(int size) {
		this.size = size;
		this.arr = new String[size];
	}

	public void push(String element){
		if (isFull()) {
			throw new StackOverflowError("Stack is full");
		}
		arr[index] = element;
		index++;
	}

	public String pop() {
		if (isEmpty()) {
			return null;
		}
		return arr[--index];
	}

	public int size() {
		return index;
	}

	public boolean isEmpty() {
		if (index == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (index == size) {
			return true;
		}
		return false;
	}
}
