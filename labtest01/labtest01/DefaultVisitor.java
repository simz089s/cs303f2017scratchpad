package labtest01;

public abstract class DefaultVisitor implements IVisitor {

	@Override
	public void visitCorporation(Corporation pCorporation) {
		for (Inventory pInventory : pCorporation)
		{
			pInventory.accept(this);
		}
	}

	@Override
	public void visitInventory(Inventory pInventory) {
		for (Item pItem : pInventory)
		{
			pItem.accept(this);
		}

	}

	@Override
	public void visitItem(Item pItem) {
		pItem.accept(this);
	}

}
