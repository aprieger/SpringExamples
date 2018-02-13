package computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GamingPC {
	@Autowired
	private GraphicsCard graphicsCard;
	@Autowired
	private Memory memory;
	private Motherboard motherboard;
	private PowerSupply powerSupply;
	private Processor processor;
	
	public GamingPC() {
		//this.graphicsCard = new GraphicsCard();
		//this.memory = new Memory();
		this.motherboard = new Motherboard();
		this.powerSupply = new PowerSupply();
		this.processor = new Processor();
	}

	public GamingPC(GraphicsCard graphicsCard, Memory memory, Motherboard motherboard, PowerSupply powerSupply, Processor processor) {
		this.graphicsCard = graphicsCard;
		this.memory = memory;
		this.motherboard = motherboard;
		this.powerSupply = powerSupply;
		this.processor = processor;
	}

	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}

	public PowerSupply getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(PowerSupply powerSupply) {
		this.powerSupply = powerSupply;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	public String talkAboutYourself () {
		String description="";
		if(graphicsCard!=null)
			description += "Graphics Card: " + graphicsCard.talkAboutYourself() + "\n";
		if(memory!=null)
			description += "Memory: " + memory.talkAboutYourself() + "\n";
		if(motherboard!=null)
			description += "Motherboard: " + motherboard.talkAboutYourself() + "\n";
		if(powerSupply!=null)
			description += "PowerSupply: " + powerSupply.talkAboutYourself() + "\n";
		if(processor!=null)
			description += "Processor: " + processor.talkAboutYourself() + "\n";
		if(description=="")
			description="not set";
		
		return description;
	}
}
