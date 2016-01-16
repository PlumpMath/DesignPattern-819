package c6_command;

public class GarageDoorOpenCommand implements ICommand {
	
	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.lightOn();
		garageDoor.up();
		garageDoor.stop();
		garageDoor.lightOff();
	}

}
