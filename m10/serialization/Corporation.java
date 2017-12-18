package serialization;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class Corporation implements Iterable<Inventory>, Serializable
{
	private static final long serialVersionUID = 4208403628844393894L;
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}

	@Override
	public Iterator<Inventory> iterator()
	{
		return aInventories.values().iterator();
	}

}
