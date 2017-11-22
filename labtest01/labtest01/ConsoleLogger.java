package labtest01;

import java.util.ArrayList;
import java.util.List;

public class ConsoleLogger implements ILogger
{
	private Inventory aInventory;
	
	public ConsoleLogger(Inventory pInventory)
	{
		aInventory = pInventory;
		aInventory.addILogger(this);
	}
	
	@Override
	public void iItemStocked(IItem pIItem)
	{
		System.out.println(String.format("The IItem %s with ID %d was stocked to %s.", pIItem.getName(), pIItem.getId(), aInventory.getName()));
	}

	@Override
	public void iItemDisposed(IItem pIItem)
	{
		System.out.println(String.format("The IItem %s with ID %d was disposed from %s.", pIItem.getName(), pIItem.getId(), aInventory.getName()));
	}

}
