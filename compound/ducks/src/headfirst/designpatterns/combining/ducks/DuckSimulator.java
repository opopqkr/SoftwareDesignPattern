package headfirst.designpatterns.combining.ducks;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();

		//AbstractDuckFactory duckFactory = new DuckFactory();//카운팅 기능이 없는것
		AbstractDuckFactory duckFactory = CountingDuckFactory.getInstance();//카운팅 기능이 있는 싱글톤
		simulator.simulate(duckFactory);
	}
  
	void simulate(AbstractDuckFactory duckFactory) { //카운팅하는 것이 필요없으면 생성하는 부분이 자주 영향을 받음
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();

		Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));

		System.out.println("\nDuck Simulator");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		System.out.println("The ducks quacked "+QuackCounter.getQuacks()+" times");

		Flock flockOfDucks = new Flock();

		flockOfDucks.add(new MallardDuck());
		flockOfDucks.add(new RedheadDuck());
		flockOfDucks.add(new DuckCall());
		flockOfDucks.add(new RedheadDuck());
		flockOfDucks.add(new GooseAdapter(new Goose()));

		System.out.println("\nFlockOfDuck Simulator");
		simulate(flockOfDucks);
	}
   
	void simulate(Quackable duck) {
		duck.quack();
	}
}
