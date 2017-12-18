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
	private Map<String, Inventory> aInventories;
	
	private static Corporation INSTANCE;
	
	/**
	 * @param pInventories An inventory to create the corporation with.
	 * @param pName A name to create the corporation with.
	 * @pre There does not exist another instance of a Corporation object.
	 */
	private Corporation(String pName, HashMap<String, Inventory> pInventories)
	{
//		assert (INSTANCE == null);
		super(pName);
		aInventories = pInventories;
	}
	
	public static Corporation getInstance(String pName, HashMap<String, Inventory> pInventories)
	{
		if (INSTANCE == null)
		{
			INSTANCE = new Corporation(pName, pInventories);
		}
		return INSTANCE;
	}
	
	public Corporation(String pName)
	{
		super(pName);
		aInventories = new HashMap<String, Inventory>();
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
