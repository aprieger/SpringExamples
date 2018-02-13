package food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Fruit {
	private String description="not set";
	
	public Fruit() {} //no argument constructor
	
	public String getDescription() {
		return description;
	}
	//Example of using the Value Annotation
	@Autowired
	public void setDescription(@Value("Hi I am a fruit, I come from plants or trees with seeds\n")String description) {
		this.description = description;
	}
	public String talkAboutYourself() {
		//return "Hi I am a fruit, I come from plants or trees with seeds\n";
		return description;
	}
}
