package hansung.designpatterns.factory.pizzafm;

/**
 * Created by Park Chan mo on 2017-09-28.
 */
public class KRStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new KRStyleCheesePizza();
        } else if (item.equals("bulgoggi")) {
            return new KRStyleBulgoggiPizza();
        } else if (item.equals("clam")) {
            return new KRStyleBulgoggiPizza();
        } else if (item.equals("pepperoni")) {
            return new KRStylePepperoniPizza();
        } else return null;
    }
}
