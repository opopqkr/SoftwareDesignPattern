package hansung.designpatterns.templatemethod.barista;


public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 		DouchCoffee douchCoffee = new DouchCoffee();

		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

		System.out.println("\nMaking douchCoffee...");
		douchCoffee.prepareRecipe();
 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		DouchWithHook douchWithHook = new DouchWithHook();

		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();

		System.out.println("\nMaking douchcoffee...");
		douchWithHook.prepareRecipe();


	}
}
