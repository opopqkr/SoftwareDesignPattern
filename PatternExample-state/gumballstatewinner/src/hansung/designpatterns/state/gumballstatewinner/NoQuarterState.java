package hansung.designpatterns.state.gumballstatewinner;

public class NoQuarterState extends State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		//gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	}

	/*@Override
	public void refill(int gumballs) {
		System.out.println("Refill disable state");
	}*/


	public String toString() {
		return "waiting for quarter";
	}
}
