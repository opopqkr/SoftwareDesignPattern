package hansung.designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}

	public double cost() {
		if (beverage instanceof Tea){
			return 0;
		}
		return beverage.cost()+0.2;
	}

}
