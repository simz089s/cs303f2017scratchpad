package m7;

public class PrintVisitor extends DefaultVisitor implements Visitor
{

	public PrintVisitor()
	{
		super();
	}
	
	public void visitFile(File pFile)
	{
		System.out.println(pFile.getName());
		pFile.accept(this);
	}
	
	public void visitSymLink(SymLink pSymLink)
	{
		System.out.println(pSymLink.getName());
		pSymLink.accept(this);
	}
	
	public void visitDirectory(Directory pDirectory)
	{
		System.out.println(pDirectory.getName());
		pDirectory.accept(this);
	}

}
