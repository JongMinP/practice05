package prob5;

public class MyStack<T> {
	private T[] buffer;
	private int top;

	@SuppressWarnings("unchecked")
	public MyStack(int size) {
		this.buffer = (T[]) new Object[size];
		this.top = -1;
	}

	public void push(T data) {
		if (top + 1 == buffer.length) {
			buffer = resize();
		}

		buffer[++top] = data;
	}

	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

	public T pop() throws MyStackException {

		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}
		return buffer[top--];
	}

	public T[] resize() {
		@SuppressWarnings("unchecked")
		T[] nb = (T[]) new Object[buffer.length * 2];

		for (int i = 0; i < buffer.length; i++) {
			nb[i] = buffer[i];
		}
		return nb;
	}

}