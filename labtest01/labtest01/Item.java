package labtest01;

import java.util.HashMap;

/**
 * An item in a grocery store: 
 * Jar of peanut butter, package of pasta,
 * whatever.
 */
public class Item extends Identity implements IVisitable
{
	private final int aId;
	private final int aPrice; // In cents: 100 = one dollar
	
	private static final HashMap<Integer, Item> ALL_ITEMS = new HashMap<>();
	
	/**
	 * Creates a new item. Now private constructor to restrict for flyweight pattern.
	 * @param pName The name of the item. Not necessarily unique.
	 * @param pId A unique id for the item
	 * @param pPrice The price of the item in cents
	 */
	public Item(String pName, int pId, int pPrice)
	{
		super(pName);
		aId = pId;
		aPrice = pPrice;
	}
	
	/**
	 * Get the unique instance of an item.
	 * @param pId The unique ID of the item
	 * @return The item with the specified ID
	 */
	public static Item getItem(String pName, int pId, int pPrice)
	{
		if (!ALL_ITEMS.containsKey(pId))
		{
			ALL_ITEMS.put(pId, new Item(pName, pId, pPrice));
		}
		return ALL_ITEMS.get(pId);
	}
	
	/**
	 * @return The ID of the item.
	 */
	public int getId()
	{
		return aId;
	}
	
	/**
	 * @return The price of the item in cents
	 */
	public int getPrice()
	{
		return aPrice;
	}
	
	@Override
	public void accept(IVisitor pVisitor)
	{
		pVisitor.visitItem(this);
	}
	
}
