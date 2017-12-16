package finalpractice;

public class PrintVisitor extends AbstractVisitor {

	public PrintVisitor()
	{
		super();
	}
	
	@Override
	public void visitFile(File pFile)
	{
		System.out.println("/" + pFile.getName());
		super.visitFile(pFile);
	}

	@Override
	public void visitSymLink(SymLink pSymLink)
	{
		System.out.println("/" + pSymLink.getName());
		super.visitSymLink(pSymLink);
	}

	@Override
	public void visitDirectory(Directory pDirectory)
	{
		System.out.println("/" + pDirectory.getName());
		super.visitDirectory(pDirectory);
	}
	
	public void visitHiddenDirectory(HiddenDirectory pHiddenDirectory)
	{
		System.out.println("/" + pHiddenDirectory.getName());
		super.visitHiddenDirectory(pHiddenDirectory);
	}

}
