package finalpractice;

public interface Visitor
{
	void visitFile(File pFile);
	
	void visitSymLink(SymLink pSymLink);
	
	void visitDirectory(Directory pDirectory);
	
	void visitHiddenDirectory(HiddenDirectory pHiddenDirectory);
}
