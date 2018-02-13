package food;

public class Dairy {
	private String name;
	private int nutritionalRating;
	
	public Dairy() {} //no argument constructor
	
	public Dairy(String name, int nutritionalRating) {
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
		String about = "Hi I am dairy, I am made using milk";
		if(this.name!=null)
			about += ", my name is "+name;
		if(this.nutritionalRating>0)
			about += ", and my nutritional rating is " + nutritionalRating;
		return about + "\n";
	}
}
