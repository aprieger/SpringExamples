package food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vegetable")
public class Vegetable {
	private String name;
	private int nutritionalRating;
	
	public Vegetable() {} //no argument constructor
	
	public Vegetable(String name, int nutritionalRating) {
		this.name = name;
		this.nutritionalRating = nutritionalRating;
	}

	public String getName() {
		return name;
	}

	@Autowired
	//SPRING EXPRESSION LANGUAGE IN ANNOTATION CONFIGURATION
	//USING THE SAFE (?.) NAVIATION OPERATOR
	public void setName(@Value("#{T(food.DataSourceVeg).getOnionTypeStatic() + '-' + dataSourceVeg.getOnionType()?.toUpperCase() + ' Onion'}")String name) {
		this.name = name;
	}

	public int getNutritionalRating() {
		return nutritionalRating;
	}
	@Autowired
	//SPRING EXPRESSION LANGUAGE IN ANNOTATION CONFIGURATION
	public void setNutritionalRating(@Value("#{T(java.lang.Math).random()*10}") int nutritionalRating) {
		this.nutritionalRating = nutritionalRating;
	}

	public String talkAboutYourself() {
		String about = "Hi I am a vegetable, I am a plant that is eaten as food";
		if(this.name!=null)
			about += ", my name is "+name;
		if(this.nutritionalRating>0)
			about += ", and my nutritional rating is " + nutritionalRating;
		return about + "\n";
	}
}
