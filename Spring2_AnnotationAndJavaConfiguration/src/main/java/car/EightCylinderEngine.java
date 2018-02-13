package car;

import org.springframework.stereotype.Component;

@Component("eightCyl")
public class EightCylinderEngine implements Engine {
	public int getNumberOfCylinders() {
		return 8;
	}
	public String drive() {
		return "Driving with " + this.getNumberOfCylinders() + " cylinders.\n";
	}
}
