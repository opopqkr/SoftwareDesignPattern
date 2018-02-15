package hansung.designpatterns.adapter;

/**
 * Created by Park Chan mo on 2017-10-18.
 */
public class Vender2SubClass extends Vender2Class {
    public void specificRequest() {
        System.out.println("A request2 is served");
    }
}
