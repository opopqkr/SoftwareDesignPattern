package headfirst.designpatterns.combining.ducks;

/**
 * Created by Park Chan mo on 2017-12-06.
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter (Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
    public String toString() {
        return duck.toString();
    }
}