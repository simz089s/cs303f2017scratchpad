package labtest01;

public interface IVisitor
{
	void visitCorporation(Corporation pCorporation);
	void visitInventory(Inventory pInventory);
	void visitItem(Item pItem);
}
