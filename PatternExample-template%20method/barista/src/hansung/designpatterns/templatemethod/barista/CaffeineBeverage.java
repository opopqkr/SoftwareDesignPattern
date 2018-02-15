package hansung.designpatterns.templatemethod.barista;


public abstract class CaffeineBeverage {
  
	final void prepareRecipe() {
		readyWater();
		brew();
		pourInCup();
		addCondiments();
	}

	abstract void readyWater();

	abstract void brew();

	abstract void addCondiments();

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
