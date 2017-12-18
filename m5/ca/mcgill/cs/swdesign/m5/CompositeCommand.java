package ca.mcgill.cs.swdesign.m5;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command
{
	private final List<Command> aCommands;
	
	public CompositeCommand(Command...pCommands)
	{
		aCommands = new ArrayList<Command>();
		for (Command pCommand : pCommands)
		{
			aCommands.add(pCommand);
		}
	}
	
	@Override
	public void execute()
	{
		for (Command pCommand : aCommands)
		{
			pCommand.execute();
		}
	}
}
