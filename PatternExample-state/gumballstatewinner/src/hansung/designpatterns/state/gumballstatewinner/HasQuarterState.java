package hansung.designpatterns.state.gumballstatewinner;

import java.util.Random;

public class HasQuarterState extends State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		/*int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMaballMachine.getWinnerState());
		} else {chine.setState(gum
			gumballMachine.setState(gumballMachine.getSoldState());
		}*/
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

	/*@Override
	public void refill(int gumballs) {
		System.out.println("Refill disable state");
	}*/


	public String toString() {
		return "waiting for turn of crank";
	}
}
