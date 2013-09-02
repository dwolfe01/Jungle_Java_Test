// TODO: introduce integration tests around this class
// TODO: what are the pros and cons of having lazy-init="true" on the spring configuration
// TODO: introduce maven dependency management to this project
// TODO: make sure the aspect stops the animal from eating poisonous food
// TODO: extend the system to that each Animal can have a list of forbidden foods
// TODO: can we extract anymore code to the Animal superclass?
// TODO: stop the animals from ever eating too much
// TODO: describe how might you schedule the main method in this class to run daily
// TODO: would you modularise the application context?
package service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Animal;
import domain.Food;

public class DrDolittleAnimalFoodIntegrationTest {
	protected Map<String, Food> foods = new HashMap<String, Food>();
	protected Map<String, Animal> animals = new HashMap<String, Animal>();

	//make sure if dr dolittle feeds all the animals each type of food then
		//the snake only eats foods with more than 1000 calories
		//the lion does not eat more than 5000 calories
		//the snake in total has eaten X amount of calories
		//the lion has eaten Y number of calories
	//make sure that ALL animals do not EAT poisonous food
	
	public DrDolittleAnimalFoodIntegrationTest(Map<String,Food> foods, Map<String,Animal> animals){
		this.animals = animals;
		this.foods = foods;
	}

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
		DrDolittleAnimalFoodIntegrationTest zooService = (DrDolittleAnimalFoodIntegrationTest) applicationContext
				.getBean("ZooService");
		//zooService.init();
		zooService.feedAllTheAnimals();
	}
}
