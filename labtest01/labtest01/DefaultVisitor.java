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
		for (IItem pIItem : pInventory)
		{
			pIItem.accept(this);
		}

	}

	@Override
	public void visitIItem(IItem pIItem) {
		pIItem.accept(this);
	}

}
