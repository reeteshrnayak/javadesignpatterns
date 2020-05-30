package creational.command;

public class EngineCommand implements CommandInterface{

	private Engine engine;
	
	public EngineCommand(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public void execute() {
		engine.start();
	}
	
}
