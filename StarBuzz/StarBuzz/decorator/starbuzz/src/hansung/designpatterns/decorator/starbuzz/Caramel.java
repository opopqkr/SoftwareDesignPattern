package hansung.designpatterns.decorator.starbuzz;

/**
 * Created by Park Chan mo on 2017-09-20.
 */
public class Caramel extends CondimentDecorator {

    public Caramel(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 캬라멜";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
