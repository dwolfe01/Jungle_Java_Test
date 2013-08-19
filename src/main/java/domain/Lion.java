package domain;

import annotations.CanEat;

public class Lion extends Animal {
	
	public Lion(){
		super();
	}

	public Lion(String name) {
		this.name = name;
		this.maxNumberOfKcalories = 100;
	}

	@Override
	@CanEat
	public void consume(Food fruit) {
		super.consume(fruit);
		if (totalKcaloriesConsumed <= maxNumberOfKcalories){
			printStatus(STATUS.HAS_MORE_CAPACITY);
		}else{
			printStatus(STATUS.HAS_EATEN_TOO_MUCH);
		}
		if (fruit.isPoisonous()){
			System.out.println("Peter has been poisoned");
		}
	}

	private void printStatus(STATUS status) {
		System.out.println("Status: " + status.toString() + " Remaining Kcalories: " + (maxNumberOfKcalories - totalKcaloriesConsumed));
	}
	
}
