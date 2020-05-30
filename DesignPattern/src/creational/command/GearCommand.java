package creational.command;

public class GearCommand implements CommandInterface{

	private Gear gear;
	
	public GearCommand(Gear gear) {
		this.gear = gear;
	}
	
	@Override
	public void execute() {
		gear.applyGear();
	}

}
