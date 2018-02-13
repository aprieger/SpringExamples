package computer;

import customannotations.*;

@ComputerWithoutAnnotation
public class Memory {
	private int capacity;
	
	public Memory() {
		capacity=22;
	}

	public Memory(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String talkAboutYourself () {
		return capacity + "GB";
	}
}
