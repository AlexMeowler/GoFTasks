package task9;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {
    
    private List<Command> commands = new ArrayList<>();
    private int current = 0;
    
    public void storeCommand(Command command) {
	commands.add(command);
    }
    
    public void executeCommand() {
	commands.get(current).execute();
	current++;
    }
    
    public void undo() {
	commands.get(current - 1).unExecute();
    }
    
    public void redo() {
	commands.get(current - 1).execute();
    }
    
    public void undo(int amount) {
	for(int i = 1; i <= amount; i++) {
	    commands.get(current - i).unExecute();
	}
    }
    
    public void redo(int amount) {
	for(int i = 0; i < amount; i++) {
	    commands.get(current - amount + i).execute();
	}
    }

}
