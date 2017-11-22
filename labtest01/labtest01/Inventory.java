package labtest01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Represents the inventory of a 
 * physical grocery store.
 */
public class Inventory extends Identity implements Iterable<Item>, IVisitable
{
	private final HashMap<Item, Integer> aInventory = new HashMap<>();
	private final List<ILogger> aILoggers = new ArrayList<>();
	
	/**
	 * Creates a new inventory with no items in it,
	 * and identified uniquely with pName.
	 * @param pName A unique identifier for this inventory.
	 */
	public Inventory(String pName)
	{
		super(pName);
	}
	
	/**
	 * Adds pQuantity number of items to the inventory.
	 * @param pItem The type of item to add.
	 * @param pQuantity The amount to add.
	 */
	public void stock(IItem pIItem, int pQuantity)
	{
		int amount = 0;
		if( aInventory.containsKey(pIItem))
		{
			amount = aInventory.get(pIItem);
		}
		amount += pQuantity;
		aInventory.put(pIItem, amount);
		notifyStockedILoggers(pIItem);
	}
	
	/**
	 * Removes pQuantity of items from the inventory,
	 * for example by selling them or tossing them in
	 * the garbage.
	 * @param pItem The type of item to dispose of
	 * @param pQuantity The amount to dispose.
	 * @pre aInventory.containsKey(pItem) && pQuantity >= aInventory.get(pItem)
	 */
	public void dispose(IItem pIItem, int pQuantity)
	{
		int amount = aInventory.get(pIItem);
		amount -= pQuantity;
		aInventory.put(pIItem, amount);
		notifyDisposedILoggers(pIItem);
	}
	
	/**
	 * @param pItem The item to check for availability.
	 * @return How many of the items are available in the inventory.
	 */
	public int available(Item pItem)
	{
		if( aInventory.containsKey(pItem))
		{
			return aInventory.get(pItem);
		}
		else
		{
			return 0;
		}
	}

//	@Override
//	public Iterator<Item> iterator()
//	{
//		return aInventory.keySet().iterator();
//	}
	
	@Override
	public Iterator<IItem> iterator()
	{
		return aInventory.keySet().iterator();
	}
	
	public void addILogger(ILogger... pILoggers)
	{
		for (ILogger pILogger : pILoggers)
		{
			aILoggers.add(pILogger);
		}
	}
	
	@Override
	public void accept(IVisitor pVisitor)
	{
		pVisitor.visitInventory(this);
	}
	
	private void notifyStockedILoggers(IItem pIItem)
	{
		for (ILogger iLogger : aILoggers)
		{
			iLogger.iItemStocked(pIItem);
		}
	}
	
	private void notifyDisposedILoggers(IItem pIItem)
	{
		for (ILogger iLogger : aILoggers)
		{
			iLogger.iItemDisposed(pIItem);
		}
	}
	
}
