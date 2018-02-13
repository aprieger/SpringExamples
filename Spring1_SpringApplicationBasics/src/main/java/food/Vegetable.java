package food;

public class Vegetable {
	private String name;
	
	public Vegetable() {
	}
	public Vegetable(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String talkAboutYourself() {
		String speech = "Hi I am a vegatable. I am a plant that is eaten as food";
		if(this.name!=null && this.name!="")
			speech += " and my name is " + name;
		return speech + "\n";
	}
}
