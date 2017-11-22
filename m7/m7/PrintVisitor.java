package m7;

public class PrintVisitor extends DefaultVisitor
{

	public PrintVisitor()
	{
		super();
	}
	
	@Override
	public void visitFile(File pFile)
	{
		System.out.println(pFile.getName());
		super.visitFile(pFile);
	}
	
	@Override
	public void visitSymLink(SymLink pSymLink)
	{
		System.out.println(pSymLink.getName());
		super.visitSymLink(pSymLink);
	}
	
	@Override
	public void visitDirectory(Directory pDirectory)
	{
		System.out.println(pDirectory.getName());
		super.visitDirectory(pDirectory);
	}

}
