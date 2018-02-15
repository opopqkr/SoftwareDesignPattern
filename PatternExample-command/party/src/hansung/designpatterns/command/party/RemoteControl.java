package hansung.designpatterns.command.party;

import java.util.Stack;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	int count=0;

	Stack<Command> stack = new Stack <Command>();

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
 
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		count = 0;
		onCommands[slot].execute();
		//undoCommand = onCommands[slot];
		undoCommand = stack.push(onCommands[slot]);
	}
 
	public void offButtonWasPushed(int slot) {
		count = 0;
		offCommands[slot].execute();
		//undoCommand = offCommands[slot];
		undoCommand = stack.push(offCommands[slot]);
	}

	public void undoButtonWasPushed() {
		//undoCommand.undo();
		count ++;
		if(count>2){
			System.out.println("No!");
		}else{
			stack.pop().undo();
		}
		/*	if (!stack.isEmpty()) {
				stack.pop().undo();
			} else {
				System.out.println("stack이 비어있습니다.");
			}
		}*/
	}
 
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		int i=0;
		for (i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot"+i+"]"+"( " + 2*i + ") " + onCommands[i].getClass().getName()
				+ "      \t" + "( " + (2*i+1) + ") "+offCommands[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undo] ("+2*i+") " + undoCommand.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
