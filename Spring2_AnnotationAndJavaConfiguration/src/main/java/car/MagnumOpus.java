package car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

public class MagnumOpus {
	//There are 3 ways to handle Autowiring: @Autowired, @Resource, @Inject
	
	@Autowired @Qualifier("sTire") //1
	//@Resource (name="smallTire") //2
	//@Inject @Named("smallTire") //3
	private Tire frontLeft;
	
	@Autowired @Qualifier("sTire") //1
	//@Resource (name="smallTire") //2
	//@Inject @Named("smallTire") //3
	private Tire frontRight;
	
	@Autowired @Qualifier("largeTire") //1
	//@Resource (name="largeTire") //2
	//@Inject @Named("largeTire") //3
	private Tire rearLeft;
	
	@Autowired @Qualifier("largeTire") //1
	//@Resource (name="largeTire") //2
	//@Inject @Named("largeTire") //3
	private Tire rearRight;
	
	@Autowired @Qualifier("sixCyl") //1
	//@Resource (name="eightCyl") //2
	//@Inject @Named("eightCyl") //3
	private Engine engineType;
	
	public MagnumOpus() {}

	public MagnumOpus(Tire frontLeft, Tire frontRight, Tire rearLeft, Tire rearRight, Engine engineType) {
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.rearLeft = rearLeft;
		this.rearRight = rearRight;
		this.engineType = engineType;
	}

	public Tire getFrontLeft() {
		return frontLeft;
	}

	public void setFrontLeft(Tire frontLeft) {
		this.frontLeft = frontLeft;
	}

	public Tire getFrontRight() {
		return frontRight;
	}

	public void setFrontRight(Tire frontRight) {
		this.frontRight = frontRight;
	}

	public Tire getRearLeft() {
		return rearLeft;
	}

	public void setRearLeft(Tire rearLeft) {
		this.rearLeft = rearLeft;
	}

	public Tire getRearRight() {
		return rearRight;
	}

	public void setRearRight(Tire rearRight) {
		this.rearRight = rearRight;
	}

	public Engine getEngineType() {
		return engineType;
	}

	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}

	public String getCarDescription() {
		String description="";
		if(frontLeft!=null)
			description += "Front left tire: " + frontLeft.getTireDiameter() + "\n";
		if(frontRight!=null)
			description += "Front right tire: " + frontRight.getTireDiameter() + "\n";
		if(rearLeft!=null)
			description += "Rear left tire: " + rearLeft.getTireDiameter() + "\n";
		if(rearRight!=null)
			description += "Rear right tire: " + rearRight.getTireDiameter() + "\n";
		if(engineType!=null)
			description += "Engine type: " + engineType.getNumberOfCylinders() + "\n";
		if(description=="")
			description="not set";
		
		return description;
	}
}
