package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import computer.*;

@Configuration
@ComponentScan({"computer"})
public class AppConfig {
	@Bean("graphicsCardJava")
	public GraphicsCard getGraphicsCard() {
		return new GraphicsCard(4, "New Graphics Card");
	}
	
	@Bean("memoryJava")
	public Memory getMemory() {
		return new Memory(3);
	}
	
	@Bean("motherboardJava")
	public Motherboard getMotherboard() {
		return new Motherboard("New Motherboard");
	}
	
	@Bean("powerSupplyJava")
	public PowerSupply getPowerSupply() {
		return new PowerSupply(600);
	}
	
	@Bean("processorJava")
	public Processor getProcessor() {
		return new Processor(3.7);
	}
	
	@Bean("gamingPCJavaContructorInjection")
	public GamingPC getGamingPCConInj() {
		return new GamingPC();
	}
	
	@Bean("gamingPCJavaSetterInjection")
	public GamingPC getGamingPCSetInj() {
		GamingPC gamingPC = new GamingPC();
		gamingPC.setGraphicsCard(this.getGraphicsCard());
		gamingPC.setMemory(this.getMemory());
		gamingPC.setMotherboard(this.getMotherboard());
		gamingPC.setPowerSupply(this.getPowerSupply());
		gamingPC.setProcessor(this.getProcessor());
		return gamingPC;
	}
}
