package hansung.designpatterns.templatemethod.barista;


public class Tea extends CaffeineBeverage {
	@Override
	void readyWater() {
		System.out.println("Boiling Water");
	}
	public void brew() {
		System.out.println("Steeping the tea");
	}

	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
