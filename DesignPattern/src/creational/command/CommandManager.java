package creational.command;

public class CommandManager {

	private CommandInterface command;

	public void setCommand(CommandInterface command) {
		this.command = command;
	}

	public void actionCommand() {
		this.command.execute();
	}

}
