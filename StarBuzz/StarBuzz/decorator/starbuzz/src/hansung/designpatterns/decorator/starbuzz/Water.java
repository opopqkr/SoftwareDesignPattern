package hansung.designpatterns.decorator.starbuzz;

/**
 * Created by Park Chan mo on 2017-09-20.
 */
public class Water extends CondimentDecorator {

    public Water(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 물";
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
