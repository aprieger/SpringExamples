package food;

public class Meat {
	private String definition = "not set";
	
	public Meat() {
	}
	public Meat(String definition) {
		this.definition = definition;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String talkAboutYourself() {
		return this.definition + "\n";
	}
}
