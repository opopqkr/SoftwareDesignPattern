package hansung.designpatterns.decorator.starbuzz;

/**
 * Created by Park Chan mo on 2017-09-20.
 */
public class Vanilla extends CondimentDecorator {

    public Vanilla(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 바닐라";
    }

    @Override
    public double cost() {
        return .15+beverage.cost();
    }
}
