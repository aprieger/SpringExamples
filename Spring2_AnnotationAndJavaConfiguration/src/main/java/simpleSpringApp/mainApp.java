package simpleSpringApp;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import car.*;
import food.*;
import javaconfig.AppConfig;
import scripts.ScriptLoader;
import computer.*;

public class mainApp {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("xml/applicationContext.xml");
		ApplicationContext appContextJava = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//AUTOWIRING PROPERTIES
		//AUTOWIRING CONSTRUCTOR
		//USING THE VALUE ANNOTATION
		//USING THE AUTOWIRED ANNOTATION AND THE REQUIRED OPTION
		Meal mealByAnnotation = appContext.getBean("mealByAnnotation", Meal.class);
		System.out.println("---Autowired: \n" + mealByAnnotation.whatsInThisMeal());
		
		//USING THE REQUIRED ANNOTATION
		Grain grainRequired = appContext.getBean("grainRequired", Grain.class);
		System.out.println("---Required Bean: \n" + grainRequired.talkAboutYourself());
		
		//USING THE QUALIFIER ANNOTATION
		//USING THE RESOURCE ANNOTATION
		//USING THE INJECT ANNOTATION
		//USING THE NAMED ANNOTATION
		MagnumOpus magnumOpusAutowired = appContext.getBean("magnumOpusAutowired", MagnumOpus.class);
		System.out.println("---Autowired with Qualifiers: \n" + magnumOpusAutowired.getCarDescription());
		
		//STEREOTYPE ANNOTATIONS
		//CUSTOMIZING COMPONENT SCANNING
		GamingPC gamingPC = appContext.getBean(GamingPC.class);
		System.out.println("---Component Scanning and Custom Annotatons: \n" + gamingPC.talkAboutYourself());
		
		//SETTER INJECTION USING JAVA-BASED CONFIGURATION
		GamingPC gamingPCJavaSetterInjection = appContextJava.getBean("gamingPCJavaSetterInjection", GamingPC.class);
		System.out.println("---Java Config Setter Injection: \n" + gamingPCJavaSetterInjection.talkAboutYourself());
		
		//CONSTRUCTOR INJECTION USING HAVA-BASED CONFIGURATION
		GamingPC gamingPCJavaContructorInjection = appContextJava.getBean("gamingPCJavaContructorInjection", GamingPC.class);
		System.out.println("---Java Config Constructor Injection: \n" + gamingPCJavaContructorInjection.talkAboutYourself());
		
		//USING AUTOWIRING WITH JAVA-BASED CONFIGURATION
		GamingPC gamingPCJavaAutowired = appContextJava.getBean("gamingPCJavaContructorInjection", GamingPC.class);
		System.out.println("---Java Config Autowiring: \n" + gamingPCJavaAutowired.talkAboutYourself());
		
		//IMPLICIT BEAN REGISTRATION
		GraphicsCard graphicsCardImplicit = appContext.getBean(GraphicsCard.class);
		System.out.println("---Java Config Implicit Bean: \n" + graphicsCardImplicit.talkAboutYourself() + "\n");
		
		//SPRING EXPRESSION LANGUAGE IN XML CONFIGURATION
		Dairy dairySpringExpressionXML = appContext.getBean("dairySpringExpressionXML", Dairy.class);
		System.out.println("---Spring Expression Language (XML): \n" + dairySpringExpressionXML.talkAboutYourself());
		
		//SPRING EXPRESSION LANGUAGE IN ANNOTATION CONFIGURATION
		DataSourceVeg dataSourceVeg = appContext.getBean(DataSourceVeg.class);
		Vegetable dairySpringExpressionAnnot = appContext.getBean(Vegetable.class);
		System.out.println("---Spring Expression Language (Annotation): \n" + dairySpringExpressionAnnot.talkAboutYourself());

		//ACCESSING SYSTEM PROPERTIES
		ScriptLoader scriptLoader = appContext.getBean("scriptLoader", ScriptLoader.class);
		scriptLoader.loadScript();
		
		tearDown(appContext, appContextJava);

		System.out.println();
		((ClassPathXmlApplicationContext) appContext).close();
	}
	
	public static void tearDown(ApplicationContext appContext, ApplicationContext appContextJava) {
		//Print the currently loaded beans
		int length=0;
		System.out.println("---Currently Loaded Beans from XML configuration---");
		for (int i =0; i < appContext.getBeanDefinitionCount(); i++) {
			System.out.print("["+appContext.getBeanDefinitionNames()[i] + "]");
			length += appContext.getBeanDefinitionNames()[i].length();
			if (length>50) {
				System.out.println();
				length=0;
			}
		}
		
		//Print the currently loaded beans
		length=0;
		System.out.println("\n---Currently Loaded Beans from Java configuration---");
		for (int i =0; i < appContextJava.getBeanDefinitionCount(); i++) {
			System.out.print("["+appContextJava.getBeanDefinitionNames()[i] + "]");
			length += appContextJava.getBeanDefinitionNames()[i].length();
			if (length>50) {
				System.out.println();
				length=0;
			}
		}
	}
}
