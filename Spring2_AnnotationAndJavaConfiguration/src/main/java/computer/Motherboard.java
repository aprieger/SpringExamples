package computer;

import org.springframework.stereotype.Component;

@Component()
public class Motherboard {
	private String description;
	
	public Motherboard() {
		description="Intel 7 Series/C216";
	}

	public Motherboard(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String talkAboutYourself () {
		return description;
	}
}
