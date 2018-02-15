package hansung.designpatterns.templatemethod.barista;


public abstract class CaffeineBeverageWithHook {
 
	final void prepareRecipe() {
		readyWater();
		brew();
		store();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void readyWater();

	abstract void brew();
 
	abstract void addCondiments();

	void store() {}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
 
	boolean customerWantsCondiments() {
		return true;
	}
}
