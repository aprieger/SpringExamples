package food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Meal {
	//Autowiring the variables
	@Autowired
	private Dairy dairy;
	@Autowired
	private Fruit fruit;
	@Autowired(required=false)
	private Grain grain;
	@Autowired
	//SETTING PROPERTIES USING SPRING EXPRESSION LANGUAGE
	@Value("#{meatSpringExpressionProp}")
	private Meat meat;
	@Value("#{meatSpringExpressionProp.name}")
	private String meatName; //not used
	@Autowired
	private Vegetable vegetable;
	
	public Meal() {}
	
	//@Autowired //Autowiring the constructor (alternative to autowiring the variables)
	public Meal(Dairy dairy, Fruit fruit, Grain grain, Meat meat, Vegetable vegetable) {
		this.dairy = dairy;
		this.fruit = fruit;
		this.grain = grain;
		this.meat = meat;
		this.vegetable = vegetable;
	}
	
	public Dairy getDairy() {
		return dairy;
	}
	//@Autowired //Autowiring the setter method (alternative to autowiring the variable)
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	
	public Fruit getFruit() {
		return fruit;
	}
	
	//@Autowired //Autowiring the setter method (alternative to autowiring the variable)
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public Grain getGrain() {
		return grain;
	}
	
	//@Autowired //Autowiring the setter method (alternative to autowiring the variable)
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	
	public Meat getMeat() {
		return meat;
	}
	
	//@Autowired //Autowiring the setter method (alternative to autowiring the variable)
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	
	public Vegetable getVegetable() {
		return vegetable;
	}
	
	public void setVegetable(Vegetable vegetable) {
		this.vegetable = vegetable;
	}
	
	public String whatsInThisMeal() {
		String answer = "This meal contains: " + "\n";
		
		if (dairy!=null)
			answer += "some dairy: "+dairy.talkAboutYourself();
		if (fruit!=null)
			answer += "some fruits: "+fruit.talkAboutYourself();;
		if (grain!=null)
			answer += "some grains: "+grain.talkAboutYourself();;
		if (meat!=null)
			answer += "some meat: "+meat.talkAboutYourself();;
		if (vegetable!=null)
			answer += "some vegetables: "+vegetable.talkAboutYourself();;
		
		return answer;
	}
}
