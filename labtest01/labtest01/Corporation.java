package labtest01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class Corporation extends Identity implements Iterable<Inventory>, IVisitable
{
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	
	public Corporation(String pName) {
		super(pName);
	}

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
	
	@Override
	public void accept(IVisitor pVisitor)
	{
		pVisitor.visitCorporation(this);
	}

}
