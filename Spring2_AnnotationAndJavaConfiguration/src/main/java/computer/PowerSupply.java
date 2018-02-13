package computer;

import org.springframework.stereotype.Component;

@Component()
public class PowerSupply {
	private int wattage;
	
	public PowerSupply() {
		wattage=400;
	}

	public PowerSupply(int wattage) {
		this.wattage = wattage;
	}

	public int getWattage() {
		return wattage;
	}

	public void setWattage(int wattage) {
		this.wattage = wattage;
	}
	
	public String talkAboutYourself () {
		return wattage + "W";
	}
}
