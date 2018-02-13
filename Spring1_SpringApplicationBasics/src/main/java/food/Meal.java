package food;

public class Meal {
	private Cheese cheese;
	private Fruit fruit;
	private Grain grain;
	private Meat meat;
	private Vegetable vegetable;
	
	
	public Meal() {
	}
	public Meal(Cheese cheese, Fruit fruit, Grain grain, Meat meat, Vegetable vegetable) {
		this.cheese = cheese;
		this.fruit = fruit;
		this.grain = grain;
		this.meat = meat;
		this.vegetable = vegetable;
	}
	public Cheese getCheese() {
		return cheese;
	}
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Grain getGrain() {
		return grain;
	}
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	public Meat getMeat() {
		return meat;
	}
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
		
		if (cheese!=null)
			answer += "some cheese: "+cheese.talkAboutYourself();
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
