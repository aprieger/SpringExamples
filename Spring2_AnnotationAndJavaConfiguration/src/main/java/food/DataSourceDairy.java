package food;

import java.util.ArrayList;
import java.util.Random;

public class DataSourceDairy {
	public String cheeseDescription = "Hi, I am a slice of cheese";
	
	public static String getCheeseTypeStatic() {
		ArrayList<String> types = new ArrayList<String>();
		types.add("Cheddar");
		types.add("Jack");
		types.add("Mozzarella");
		types.add("American");
		types.add("Swiss");
		
		int index = new Random().nextInt(types.size());
		String type = types.get(index);
		return type;
	}
	public String getCheeseType() {
		ArrayList<String> types = new ArrayList<String>();
		types.add("Cheddar");
		types.add("Jack");
		types.add("Mozzarella");
		types.add("American");
		types.add("Swiss");
		
		int index = new Random().nextInt(types.size());
		String type = types.get(index);
		return type;
	}
}
