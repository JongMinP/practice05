package prob5;

public class MyStack {
	private String[] buffer;
	private int top;

	public MyStack(int size) {
		this.buffer = new String[size];
		this.top = -1;
	}

	public void push(String data) {
		if (top + 1 == buffer.length) {
			buffer = resize();
		}

		buffer[++top] = data;
	}

	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

	public String pop() throws MyStackException {

		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}
		return buffer[top--];
	}

	public String[] resize() {
		String[] nb = new String[buffer.length * 2];

		for (int i = 0; i < buffer.length; i++) {
			nb[i] = buffer[i];
		}
		return nb;
	}

}