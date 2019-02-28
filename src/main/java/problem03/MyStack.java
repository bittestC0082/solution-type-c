package problem03;

public class MyStack {
	
	private String[] buffer;
	private int idx = -1;
	
	public MyStack( int size ) {
		int sizeUp = size();
		buffer = new String[size+sizeUp];
	}
	
	public void push(String item) {
		buffer[++idx] = item;
	}

	public String pop() {
		if (idx!=-1) {
			String popStr = buffer[idx];
			buffer[idx--] = "";
			return popStr;
		}
		return null;
	}

	public boolean isEmpty() {
		if (idx == -1) 
			return true;
		return false;
	}
	
	public int size() {
		return 2;
	}
}