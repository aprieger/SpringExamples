package food;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DataSourceVeg {
	public String onionDescription = "Hi, I am an onion";
	
	public static String getOnionTypeStatic() {
		ArrayList<String> types = new ArrayList<String>();
		types.add("Green");
		types.add("Sweet");
		types.add("Yellow");
		types.add("White");
		types.add("Shallot");
		
		int index = new Random().nextInt(types.size());
		String type = types.get(index);
		return type;
	}
	public String getOnionType() {
		ArrayList<String> types = new ArrayList<String>();
		types.add("Green");
		types.add("Sweet");
		types.add("Yellow");
		types.add("White");
		types.add("Shallot");
		
		int index = new Random().nextInt(types.size());
		String type = types.get(index);
		//return type;
		return null;
	}
}
