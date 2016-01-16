package c6_command;

public class LigthOnCommand implements ICommand {
	
	Light light;
	
	public LigthOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
