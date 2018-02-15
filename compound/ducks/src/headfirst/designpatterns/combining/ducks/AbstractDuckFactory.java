package headfirst.designpatterns.combining.ducks;

/**
 * Created by Park Chan mo on 2017-12-06.
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
