package headfirst.designpatterns.combining.ducks;

/**
 * Created by Park Chan mo on 2017-12-06.
 */
public class CountingDuckFactory extends AbstractDuckFactory {

    static CountingDuckFactory instance;

    private CountingDuckFactory(){}

    static public CountingDuckFactory getInstance(){
        if(instance == null){
            instance = new CountingDuckFactory();
            return instance;
        }else {
            return instance;
        }
    }

    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}