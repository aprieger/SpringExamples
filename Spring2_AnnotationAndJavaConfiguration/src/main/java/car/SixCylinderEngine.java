package car;

import javax.inject.Named;

@Named("sixCyl")
public class SixCylinderEngine implements Engine {
	public int getNumberOfCylinders() {
		return 6;
	}
	public String drive() {
		return "Driving with " + this.getNumberOfCylinders() + " cylinders.\n";
	}
}
