package food;

public class Cheese {
	private String name;
	
	public Cheese() { //no argument constructor
	}
	public Cheese(String name) {
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String talkAboutYourself() {
		String speech = "Hi I am cheese, I am made from pasturized milk";
		if(this.name!=null && this.name!="")
			speech += " and my name is " + name;
		return speech + "\n";
	}
}
