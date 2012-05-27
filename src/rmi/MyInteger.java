package rmi;

import java.io.Serializable;

public class MyInteger implements Serializable {
	private static final long serialVersionUID = 1674936512214036911L;
	private int i;
	
	public MyInteger(int i) {
		this.i = i;
	}
	
	public void incrementByOne() {
		i++;
	}
	
	public int getValue() {
		return i;
	}
	
}
