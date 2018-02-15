package headfirst.designpatterns.combining.ducks;

/**
 * Created by Park Chan mo on 2017-12-06.
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }

    public String toString() {
        return "Goose pretending to be a Duck";
    }
}