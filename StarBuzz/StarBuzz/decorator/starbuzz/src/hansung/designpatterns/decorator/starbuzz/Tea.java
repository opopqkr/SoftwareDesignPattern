package hansung.designpatterns.decorator.starbuzz;

/**
 * Created by Park Chan mo on 2017-09-20.
 */
public class Tea extends Beverage {

    public Tea(){
        description = "티";
    }

    @Override
    public double cost() {
        return .60;
    }

}
