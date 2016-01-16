package c6_command;

public class RemoteControl {
	
	ICommand[] onCommands;
	ICommand[] offCommands;
	
	public RemoteControl() {
		onCommands  = new ICommand[7];
		offCommands = new ICommand[7];
		
		ICommand noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer strinBuff = new StringBuffer();
		strinBuff.append("\n------ Remote Control ------\n");
		for(int i=0; i<7;i++) {
			strinBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
		}
		return strinBuff.toString();
	}
	
}
