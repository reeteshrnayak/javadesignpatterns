package creational.command;

public class AcceleratorCommand implements CommandInterface {

	private Accelerator accelerator;

	public AcceleratorCommand(Accelerator accelerator) {
		this.accelerator = accelerator;
	}

	@Override
	public void execute() {
		accelerator.applyAccelerator();
	}

}
