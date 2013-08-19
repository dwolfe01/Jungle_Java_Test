package domain;


public abstract class Animal {

	protected enum STATUS {HAS_MORE_CAPACITY,HAS_EATEN_TOO_MUCH}
	public int maxNumberOfKcalories;
	protected String name;
	protected int totalKcaloriesConsumed;

	public void consume(Food food){
		System.out.println(this.name + " is eating: " + food.getName() + " kcalories: " + food.getNumberOfKcalories());
		totalKcaloriesConsumed += food.getNumberOfKcalories();
	}

}
