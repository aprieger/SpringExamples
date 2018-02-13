package food;

import java.util.List;
import java.util.Map;

public class Fruit {
	private List<String> fruitNameList;
	private Map<String,String> fruitNameMap;
	
	public Fruit() { //no argument constructor
	}
	public List<String> getFruitNameList() {
		return fruitNameList;
	}
	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}
	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}
	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}
	public String talkAboutYourself() {
		String speech = "Hi I am a fruit, I come from plants or trees with seeds";
		if (fruitNameList!=null && fruitNameList.size() > 0) {
			speech += "\n    List: ";
			for(int i = 0; i<fruitNameList.size(); i++)
				speech += " . name: " + fruitNameList.get(i);
		}
		if(fruitNameMap!=null && fruitNameMap.size() > 0) {
			speech += "\n    Map: ";
			for(Map.Entry<String, String> fruitName : fruitNameMap.entrySet())
				speech += fruitName.getKey() + " ==> " + fruitName.getValue() + " :: ";
		}
		return speech + "\n";
	}
	public void init() {
		System.out.println("The fruit bean has been initialized");
	}
	public void destroy() {
		System.out.println("The fruit bean is about to be destroyed");
	}
}
