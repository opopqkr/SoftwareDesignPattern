package hansung.designpatterns.state.gumballstatewinner;

public class SoldOutState extends State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	/*public void insertQuarter() {
		
	}*/
 
	public void ejectQuarter() {
		
	}
 
	public void turnCrank() {
		
	}
 
	public void dispense() {
		
	}

	@Override
	public void refill(int gumballs) {
		System.out.println("Refill : " + gumballs);
		gumballMachine.count = gumballs;
		//gumballMachine.setState(gumballMachine.getNoQuarterState());
	}


	public String toString() {
		return "sold out";
	}
}
