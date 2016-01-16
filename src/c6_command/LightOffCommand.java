package c6_command;

public class LightOffCommand implements ICommand {
	
	Light light;
	
	public LightOffCommand(Light ligth) {
		this.light = ligth;
	}

	@Override
	public void execute() {
		light.off();
	}

}
