package service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Animal;
import domain.Food;

public class ZooService {
	protected Map<String, Food> foods = new HashMap<String, Food>();
	protected Map<String, Animal> animals = new HashMap<String, Animal>();

	// TODO: introduce integration tests around this class
	// TODO: what are the pros and cons of having lazy-init="true" on the spring configuration
	// TODO: introduce maven dependency management to this project
	// TODO: make sure the aspect stops the animal from eating poisonous food
	// TODO: extend the system to that each Animal can have a list of forbidden foods
	// TODO: can we extract anymore code to the Animal superclass?
	// TODO: stop the animals from ever eating too much
	// TODO: describe how might you schedule the main method in this class to run daily
	// TODO: would you modularise the application context?
	
	public ZooService(Map<String,Food> foods, Map<String,Animal> animals){
		this.animals = animals;
		this.foods = foods;
	}
	

//	private void init() {
//		foods.put("orange", new Food("orange", 60, false));
//		foods.put("banana", new Food("banana", 110, false));
//		foods.put("deadly nightshade", new Food("deadly_nightshade", 15, true));
//		foods.put("avocado pear",iThis new Food("avocado pear", 60, false));
//		foods.put("rhubarb leaves", new Food("rhubarb leaves", 30, true));
//		animals.put("Peter", new Lion("Peter"));
//	}

	public Animal getEater(String eaterName) {
		return animals.get(eaterName);
	}

	public void eat(Food fruit, Animal animal) {
		animal.consume(fruit);
	}

	public void feedAllTheAnimals() {
		for (Animal animal : animals.values()) {
			for (Food fruit : foods.values()) {
				eat(fruit, animal);
			}
		}
	}

	private static ClassPathXmlApplicationContext loadSpring() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"AOP_Example_With_Annotations.xml");
		return applicationContext;
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = loadSpring();
		ZooService zooService = (ZooService) applicationContext
				.getBean("ZooService");
		//zooService.init();
		zooService.feedAllTheAnimals();
	}
}
