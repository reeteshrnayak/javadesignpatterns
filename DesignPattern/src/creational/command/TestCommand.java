package creational.command;

public class TestCommand {

	public static void main(String[] arg) {
		
		CommandManager manager = new CommandManager();
		Engine engine = new Engine();
		Gear gear = new Gear();
		Accelerator accelerator = new Accelerator();

		EngineCommand engineCommandObj = new EngineCommand(engine);
		manager.setCommand(engineCommandObj);
		manager.actionCommand();

		GearCommand gearCommandObj = new GearCommand(gear);
		manager.setCommand(gearCommandObj);
		manager.actionCommand();

		AcceleratorCommand acceleratorCommandObj = new AcceleratorCommand(accelerator);
		manager.setCommand(acceleratorCommandObj);
		manager.actionCommand();

	}
}
