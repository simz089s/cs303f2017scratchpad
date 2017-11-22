package m7;

public interface Visitor
{
	void visitFile(File pFile);
	void visitSymLink(SymLink pSymLink);
	void visitDirectory(Directory pDirectory);
}
