package simpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import food.*;

public class mainApp {

	public static void main(String[] args) {
		//Fruit fruit = new Fruit(); //non spring format
		//Vegetable veg = new Vegetable(); //non spring format
		
		//ApplicationContext appContext = new FileSystemXmlApplicationContext("applicationContext.xml"); //if applicationContext in the project root directory
		ApplicationContext appContext = new ClassPathXmlApplicationContext("xml/applicationContext.xml"); //if applicationContext in the myTestPackage folder
		
		Grain grain = appContext.getBean("grain", Grain.class);
		System.out.println(grain.talkAboutYourself());
		
		//Vegetable veg = (Vegetable)appContext.getBean("vegetable");
		//System.out.println(veg.talkAboutYourself());

		Vegetable potato = (Vegetable)appContext.getBean("vegWithName");
		System.out.println(potato.talkAboutYourself());
		
		//Fruit fruit = appContext.getBean("fruit", Fruit.class);
		//System.out.println(fruit.talkAboutYourself());
		
		//Fruit apple = appContext.getBean("fruitWithName",Fruit.class);
		//System.out.println(apple.talkAboutYourself());
		
		Fruit manyFruits = appContext.getBean("fruitWithListAndMap",Fruit.class);
		System.out.println(manyFruits.talkAboutYourself());

		Cheese cheese = appContext.getBean("cheeseUsingPNamespace", Cheese.class);
		System.out.println(cheese.talkAboutYourself());
		
		Meat meat = appContext.getBean("meatUsingExternalProperties", Meat.class);
		System.out.println(meat.talkAboutYourself());

		Meal normalMeal = new Meal(); //not created through spring
		System.out.println("Normal meal: " + normalMeal.whatsInThisMeal());

		Meal springMeal = appContext.getBean("meal",  Meal.class);
		System.out.println("Spring meal: " + springMeal.whatsInThisMeal());
		
		Meal mealUsingConstructorInjectionWithIndex = appContext.getBean("mealUsingConstructorInjectionWithIndex", Meal.class);
		System.out.println("Spring meal (Using Constructor Injection With Indexes): " + mealUsingConstructorInjectionWithIndex.whatsInThisMeal());
		
		Meal mealUsingConstructorInjectionWithName = appContext.getBean("mealUsingConstructorInjectionWithName", Meal.class);
		System.out.println("Spring meal (Using Constructor Injection With Names): " + mealUsingConstructorInjectionWithName.whatsInThisMeal());
		
		Meal mealWithInnerBean = appContext.getBean("mealWithInnerBean", Meal.class);
		System.out.println("Spring meal (With inner bean): " + mealWithInnerBean.whatsInThisMeal());
		
		Fruit fruitWithInitAndDestroy = appContext.getBean("fruitWithInitAndDestroy",Fruit.class);
		
		Meal mealAutowiredByType = appContext.getBean("mealAutowiredByType", Meal.class);
		System.out.println("Spring meal (Autowired By Type): " + mealAutowiredByType.whatsInThisMeal());
		
		Meal mealAutowiredByName = appContext.getBean("mealAutowiredByName", Meal.class);
		System.out.println("Spring meal (Autowired By Name): " + mealAutowiredByName.whatsInThisMeal());
		
		Meal mealAutowiredByConstructor = appContext.getBean("mealAutowiredByConstructor", Meal.class);
		System.out.println("Spring meal (Autowired By Constructor): " + mealAutowiredByConstructor.whatsInThisMeal());
		
		Meal mealAutowiredByDefault = appContext.getBean("mealAutowiredByDefault", Meal.class);
		System.out.println("Spring meal (Autowired By Default(byType)): " + mealAutowiredByDefault.whatsInThisMeal());
		
		//((FileSystemXmlApplicationContext) appContext).close();
		((ClassPathXmlApplicationContext) appContext).close();
	}
}
