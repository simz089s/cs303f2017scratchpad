package labtest01;

import java.util.ArrayList;
import java.util.List;

public class GroupItem implements Comparable<IItem>, IItem
{
	private final String aName;
	private final int aId;
	private final int aPrice; // In cents: 100 = one dollar
	private final List<IItem> aIItems = new ArrayList<>();
	
	/**
	 * Creates a new group item.
	 * @param pName The name of the item. Not necessarily unique.
	 * @param pId A unique id for the group item
	 * @param pPrice The price of the group item in cents
	 * @param pIItems All the IItems grouped by this
	 */
	public GroupItem(String pName, int pId, int pPrice, IItem ... pIItems)
	{
		aName = pName;
		aId = pId;
		aPrice = pPrice;
		for (IItem pIItem : pIItems)
		{
			aIItems.add(pIItem);
		}
	}

	@Override
	public String getName()
	{
		return aName;
	}

	@Override
	public int getId()
	{
		return aId;
	}

	@Override
	public int getPrice()
	{
		return aPrice;
	}
	
	@Override
	public boolean equals(Object pItem)
	{
		if (this == pItem)
		{
			return true;
		}
		if (this.aId == ((IItem) pItem).getId())
		{
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(IItem pItem)
	{
		return this.getId() - pItem.getId();
	}

	@Override
	public void accept(IVisitor pVisitor) {
		pVisitor.visitIItem(this);
	}

}
