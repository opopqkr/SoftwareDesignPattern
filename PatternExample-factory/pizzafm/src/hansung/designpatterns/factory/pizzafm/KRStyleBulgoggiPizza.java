package hansung.designpatterns.factory.pizzafm;

/**
 * Created by Park Chan mo on 2017-09-28.
 */
public class KRStyleBulgoggiPizza extends Pizza  {
    public KRStyleBulgoggiPizza() {
        name = "Korea Style Bulgoggi Pizza";
        dough = "Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Bulgoggi");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
