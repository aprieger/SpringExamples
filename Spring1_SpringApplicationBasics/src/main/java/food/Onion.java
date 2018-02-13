package food;

public class Onion extends Vegetable {
	private String name;
	private String description = "not set";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String talkAboutYourself() {
		String speech = super.talkAboutYourself();
		if(description!= null)
			speech += description;
		return speech + "\n";
	}
}
