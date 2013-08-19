package domain;

public class Food {

	private final String name;
	private final int numberOfKcalories;
	private boolean isPoisonous;


	protected Food(String name, int numberOfKcalories, boolean isPoisonous) {
		this.name = name;
		this.numberOfKcalories = numberOfKcalories;
		this.isPoisonous = isPoisonous;
	}

	public int getNumberOfKcalories(){
		return numberOfKcalories;
	}

	public boolean isPoisonous(){
		return isPoisonous;
	}
	
	public String getName() {
		return name;
	}

}
