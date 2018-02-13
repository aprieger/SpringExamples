package food;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Meat {
	private String name;
	private int nutritionalRating;
	
	public Meat() {} //no argument constructor
	
	public Meat(String name, int nutritionalRating) {
		this.name = name;
		this.nutritionalRating = nutritionalRating;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getNutritionalRating() {
		return nutritionalRating;
	}
	public void setNutritionalRating(int nutritionalRating) {
		this.nutritionalRating = nutritionalRating;
	}

	public String talkAboutYourself() {
		String about = "Hi I am meat, I am animal flesh that is eaten as food";
		if(this.name!=null)
			about += ", my name is "+name;
		if(this.nutritionalRating>0)
			about += ", and my nutritional rating is " + nutritionalRating;
		return about + "\n";
	}
	
	//ANNOTATIONS TO SET INI AND DESTROY METHODS ON BEANS
	@PostConstruct
	public void init() {
		System.out.println("The meat bean has been initialized");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("The meat bean is about to be destroyed");
	}
}
