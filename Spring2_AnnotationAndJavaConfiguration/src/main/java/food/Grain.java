package food;

import org.springframework.beans.factory.annotation.Required;

public class Grain {
	private String description;
	
	public Grain() {} //no argument constructor
	
	public Grain(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	@Required
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String talkAboutYourself() {
		String result = description;
		if(result==null)
			result="no description set";
		return result + "\n";
		
	}
}
