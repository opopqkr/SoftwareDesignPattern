package hansung.designpatterns.factory.pizzafm;

/**
 * Created by Park Chan mo on 2017-09-28.
 */
public class KRStylePepperoniPizza extends Pizza  {
    public KRStylePepperoniPizza() {
        name = "Korea Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Sliced Pepperoni");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
