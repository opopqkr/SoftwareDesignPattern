package hansung.designpatterns.factory.pizzafm;

/**
 * Created by Park Chan mo on 2017-09-28.
 */
public class KRStyleCheesePizza extends Pizza {
    public KRStyleCheesePizza() {
        name = "Korea Style Deep Dish Cheese Pizza";
        dough = "Cheese Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
