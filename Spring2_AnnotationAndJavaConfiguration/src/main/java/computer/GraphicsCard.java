package computer;

import org.springframework.stereotype.Component;
import customannotations.*;

@ComputerAnnotation //created and declared in customannotations/ComputerAnnotation
public class GraphicsCard {
	private int memory;
	private String description;
	
	public GraphicsCard() {
		memory=6;
		description="NVIDIA GTX 960";
	}

	public GraphicsCard(int memory, String description) {
		this.memory = memory;
		this.description = description;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String talkAboutYourself () {
		return description + " : " + memory + "GB";
	}
}
