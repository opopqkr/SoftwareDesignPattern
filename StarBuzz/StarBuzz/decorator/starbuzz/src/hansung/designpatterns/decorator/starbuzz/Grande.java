package hansung.designpatterns.decorator.starbuzz;

/**
 * Created by Park Chan mo on 2017-09-20.
 */
public class Grande extends CondimentDecorator {

    public Grande(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", 그랑데";
    }

    @Override
    public double cost() {
        if (beverage instanceof CondimentDecorator){
            return beverage.cost();
        }else {
            return beverage.cost()*2;
        }
    }
}
