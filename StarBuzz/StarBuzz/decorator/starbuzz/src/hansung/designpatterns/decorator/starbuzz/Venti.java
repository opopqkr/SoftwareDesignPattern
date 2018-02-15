package hansung.designpatterns.decorator.starbuzz;

/**
 * Created by Park Chan mo on 2017-09-20.
 */
public class Venti extends CondimentDecorator {
    public Venti(Beverage beverage) {
        super(beverage);
    }
    public String getDescription() {
        return beverage.getDescription() + ", 벤티";
    }
    @Override
    public double cost() {
        if (beverage instanceof CondimentDecorator){
            return beverage.cost();
        }else {
            return beverage.cost()*3;
        }
    }
}
