package computer;

import org.springframework.stereotype.Component;

import customannotations.*;

@ComputerWithoutAnnotation
public class Processor {
	private double speed;
	
	public Processor() {
		speed=2.5;
	}

	public Processor(double speed) {
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String talkAboutYourself () {
		return speed + "GHz";
	}
}
